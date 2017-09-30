package units_generator;

import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.StringTemplate;

import units_generator.internal.UnitScaleInterface;
import units_generator.internal.UnitTypeInterface;
import units_generator.internal.UnitsSchemaInterface;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Map;
import java.util.logging.Logger;

public abstract class LanguageUnitsGenerator {

	private static final Logger logger = 
			Logger.getLogger(LanguageUnitsGenerator.class.getName());

			private StringTemplateGroup group;
	
	public LanguageUnitsGenerator(StringTemplateGroup group) {
		this.group = group;
	}

	protected abstract Map<String, Path> getDirectoriesMap(
			Path outputDirectory) throws IOException;
	protected abstract void generateSchemaFiles(
			UnitsSchemaInterface schema,
			Map<String, Path> directoriesMap) throws IOException;
	protected abstract void generateUnitTypeFiles(
			UnitTypeInterface unitType,
			Map<String, Path> directoriesMap) throws IOException;
	protected abstract void generateUnitScaleFiles(
			UnitScaleInterface unitScale,
			Map<String, Path> directoriesMap) throws IOException;
	
	public void generate(
			UnitsSchemaInterface schema,
			Path outputDirectory) throws IOException{
		logger.info("Generatating files...");
		Map<String, Path> directoriesMap = getDirectoriesMap(outputDirectory);
		generateSchemaFiles(schema, directoriesMap);
		for (UnitTypeInterface unitType : schema.getUnitTypes()) {
			generateUnitTypeFiles(unitType, directoriesMap);
			for (UnitScaleInterface unitScale : unitType.getUnitScales()) {
				generateUnitScaleFiles(unitScale, directoriesMap);
			}
		}
		logger.info("Generating files succeded!");
	}

	protected void addToDirectoriesMap(
			Map<String, Path> directoriesMap,
			String key,
			Path directoryPath) throws IOException {
		directoryPath.toFile().mkdirs();
		directoriesMap.put(key, directoryPath);
	}
	protected void writeStringTemplate(
			String stringTemplateName,
			String attributeName,
			Object obj,
			Path outputPath) throws IOException {
		StringTemplate st = group.getInstanceOf(stringTemplateName);
		st.setAttribute(attributeName, obj);
		writeToFile(st.toString(), outputPath);
	}
	
	protected void writeToFile(String lines, Path outputPath) throws IOException{
		OutputStreamWriter stream = new OutputStreamWriter(
				new FileOutputStream(outputPath.toString()),
				StandardCharsets.UTF_8);
		stream.write(lines);
		stream.flush();
		stream.close();
	}
}
