package units_generator.internal;

import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.StringTemplate;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Map;
import java.util.logging.Logger;

public abstract class LanguageUnitsGenerator {

	private String name;
	private Logger logger;
	private StringTemplateGroup group;
	
	public LanguageUnitsGenerator(String name, StringTemplateGroup group) {
		this.name = name;
		this.logger = Logger.getLogger(name);
		this.group = group;
	}
	
	protected abstract Map<String, Path> getDirectoriesMap(
			AbstractUnitsSchema schema, Path rootDirectory) throws IOException;
	protected abstract void generateSchemaFiles(
			AbstractUnitsSchema schema,
			Map<String, Path> directoriesMap) throws IOException;
	protected abstract void generateUnitTypeFiles(
			AbstractUnitType unitType,
			Map<String, Path> directoriesMap) throws IOException;
	protected abstract void generateUnitScaleFiles(
			UnitScaleInterface unitScale,
			Map<String, Path> directoriesMap) throws IOException;
	protected abstract void generateTestSuiteFiles(
			UnitsTestSuiteInterface testSuite,
			Map<String, Path> directoriesMap) throws IOException;
	protected abstract void generateConstantsGroup(
			ConstantsGroupInterface constantsGroup,
			Map<String, Path> directoriesMap) throws IOException;
	
	public void generate(
			AbstractUnitsSchema schema,
			Path rootDirectory) throws IOException{
		logger.info(name + ": Generating files...");
		Map<String, Path> directoriesMap = getDirectoriesMap(schema, rootDirectory);
		generateSchemaFiles(schema, directoriesMap);
		for (AbstractUnitType unitType : schema.getUnitTypes()) {
			generateUnitTypeFiles(unitType, directoriesMap);
			for (UnitScaleInterface unitScale : unitType.getUnitScales()) {
				generateUnitScaleFiles(unitScale, directoriesMap);
			}
		}
		if (schema.getTestSuites() != null) {
			for (UnitsTestSuiteInterface testSuite : schema.getTestSuites()) {
				generateTestSuiteFiles(testSuite, directoriesMap);
			}
		}
		if (schema.getConstantsGroups() != null) {
			for (ConstantsGroupInterface constantsGroup : schema.getConstantsGroups()) {
				generateConstantsGroup(constantsGroup, directoriesMap);
			}
		}
		logger.info(name + ": Generating files succeded!");
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
