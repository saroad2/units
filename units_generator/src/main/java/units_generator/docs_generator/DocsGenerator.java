package units_generator.docs_generator;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.antlr.stringtemplate.StringTemplateGroup;

import units_generator.internal.ConstantsGroupInterface;
import units_generator.internal.LanguageUnitsGenerator;
import units_generator.internal.UnitScaleInterface;
import units_generator.internal.UnitTypeInterface;
import units_generator.internal.AbstractUnitsSchema;
import units_generator.internal.UnitsTestSuiteInterface;

public class DocsGenerator extends LanguageUnitsGenerator{

	private final static Logger logger =
			Logger.getLogger(DocsGenerator.class.getName());
	private final static String root = "root";

	public DocsGenerator(StringTemplateGroup group) {
		super(DocsGenerator.class.getSimpleName(), group);
	}
	@Override
	public Map<String, Path> getDirectoriesMap(
			AbstractUnitsSchema schema, 
			Path rootDirectory) throws IOException {
		Map<String, Path> directoriesMap = new HashMap<>();
		addToDirectoriesMap(directoriesMap, root, rootDirectory);
		return directoriesMap;
	}
	
	@Override
	protected void generateSchemaFiles(
			AbstractUnitsSchema schema,
			Map<String, Path> directoriesMap) throws IOException {
		Path outputDirectory = directoriesMap.get(root);
		DocsSchema docsSchema = (DocsSchema)schema; 
		generateSupportedUnits(docsSchema, outputDirectory);
		generateConversions(docsSchema, outputDirectory);
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
	
	@Override
	protected void generateTestSuiteFiles(
			UnitsTestSuiteInterface testSuite,
			Map<String, Path> directoriesMap) throws IOException {
	};
	
	@Override
	protected void generateConstantsGroup(
			ConstantsGroupInterface constantsGroup,
			Map<String, Path> directoriesMap) throws IOException
	{
		
	};
	
	private void generateSupportedUnits(
			DocsSchema schema,
			Path outputDirectory) throws IOException{
		Path outputPath = Paths.get(outputDirectory.toString(), "supported_units.md");
		logger.info("Generating supported units to " + outputPath + "...");
		writeStringTemplate("supported_units", "schema", schema, outputPath);
	}
	
	private void generateConversions(
			DocsSchema schema,
			Path outputDirectory) throws IOException{
		Path outputPath = Paths.get(outputDirectory.toString(), "conversions.md");
		logger.info("Generating supported units to " + outputPath + "...");
		writeStringTemplate("conversions", "schema", schema, outputPath);
	}
}
