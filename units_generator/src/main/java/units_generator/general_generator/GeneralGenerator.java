package units_generator.general_generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.antlr.stringtemplate.StringTemplateGroup;

import units_generator.LanguageUnitsGenerator;
import units_generator.internal.UnitScaleInterface;
import units_generator.internal.UnitTypeInterface;
import units_generator.internal.UnitsSchemaInterface;

import org.antlr.stringtemplate.StringTemplate;

public class GeneralGenerator extends LanguageUnitsGenerator{

	private final static Logger logger =
			Logger.getLogger(GeneralGenerator.class.getName());
	private final static String root = "root";

	public GeneralGenerator(StringTemplateGroup group) {
		super(GeneralGenerator.class.getSimpleName(), group);
	}
	@Override
	public Map<String, Path> getDirectoriesMap(
			UnitsSchemaInterface schema, 
			Path rootDirectory) throws IOException {
		Map<String, Path> directoriesMap = new HashMap<>();
		addToDirectoriesMap(directoriesMap, root, rootDirectory);
		return directoriesMap;
	}
	
	@Override
	protected void generateSchemaFiles(
			UnitsSchemaInterface schema,
			Map<String, Path> directoriesMap) throws IOException {
		Path outputPath = Paths.get(directoriesMap.get(root).toString(), "supported_units.md");
		generateSupportedUnits((GeneralSchema)schema, outputPath);
	}
	
	@Override
	protected void generateUnitTypeFiles(
			UnitTypeInterface unitType,
			Map<String, Path> directoriesMap) throws IOException {
	}
	
	@Override
	protected void generateUnitScaleFiles(
			UnitScaleInterface unitScale,
			Map<String, Path> directoriesMap) throws IOException {
	}
	
	public void generateSupportedUnits(
			GeneralSchema schema,
			Path outputPath) throws IOException{
		logger.info("Generatating supported units to " + outputPath + "...");
		writeStringTemplate("supported_units", "schema", schema, outputPath);
	}
}
