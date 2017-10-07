package units_generator.cpp_generator;

import org.antlr.stringtemplate.StringTemplateGroup;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import units_generator.internal.LanguageUnitsGenerator;
import units_generator.internal.UnitScaleInterface;
import units_generator.internal.UnitTypeInterface;
import units_generator.internal.UnitsSchemaInterface;
import units_generator.internal.UnitsTestSuiteInterface;

public class CppUnitsGenerator extends LanguageUnitsGenerator{	
	
	private final static Logger logger =
			Logger.getLogger(CppUnitsGenerator.class.getName());
	private final static String root = "root";
	private final static String headers = "headers";
	private final static String tags = "tags";
	private final static String source = "source";
	private final static String testsHeaders = "tests_headers";
	private final static String testsSource = "tests_source";
	
	public CppUnitsGenerator(StringTemplateGroup group) {
		super(CppUnitsGenerator.class.getSimpleName(), group);
	}
	
	@Override
	public Map<String, Path> getDirectoriesMap(
			UnitsSchemaInterface schema,
			Path rootDirectory) throws IOException {
		Map<String, Path> directoriesMap = new HashMap<>();
		addToDirectoriesMap(directoriesMap, root, rootDirectory);
		Path headersDirectory = Paths.get(rootDirectory.toString(), "units", "headers", "units");
		addToDirectoriesMap(directoriesMap, headers, headersDirectory);
		addToDirectoriesMap(directoriesMap, tags, Paths.get(headersDirectory.toString(), "tags"));
		addToDirectoriesMap(
				directoriesMap,
				source,
				Paths.get(rootDirectory.toString(), "units", "cpp", "units", "tags"));
		Path testsPath = Paths.get(rootDirectory.toString(), "unitsTest");
		addToDirectoriesMap(
				directoriesMap,
				testsHeaders,
				Paths.get(testsPath.toString(), "headers", "units"));
		addToDirectoriesMap(
				directoriesMap,
				testsSource,
				Paths.get(testsPath.toString(), "cpp"));
		return directoriesMap;
	}
	
	@Override
	protected void generateSchemaFiles(
			UnitsSchemaInterface schema,
			Map<String, Path> directoriesMap) throws IOException {
		Path allUnitsPath = Paths.get(directoriesMap.get(testsHeaders).toString(), "all_units.h");
		generateTests((CppSchema)schema, allUnitsPath);
	}
	
	@Override
	protected void generateUnitTypeFiles(
			UnitTypeInterface unitType,
			Map<String, Path> directoriesMap) throws IOException {
		CppUnitType cppUnitType = (CppUnitType) unitType;
		Path tagsPath =Paths.get(directoriesMap.get(tags).toString(), cppUnitType.getTagsHeaderFileName());
		generateUnitTypeTagsHeaderFile(cppUnitType, tagsPath);
		if (!cppUnitType.isTagsOnly()) {
			Path headerPath = Paths.get(directoriesMap.get(headers).toString(), cppUnitType.getHeaderFileName());
			generateUnitTypeHeaderFile(cppUnitType, headerPath);
		}
		Path sourcePath = Paths.get(directoriesMap.get(source).toString(), cppUnitType.getTagsSourceFileName());
		generateUnitTypeSourceFile(cppUnitType, sourcePath);

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
		CppUnitsTestSuite cppUnitsTestSuite = (CppUnitsTestSuite)testSuite;
		String fileName = "test_" + cppUnitsTestSuite.getUnitType().replace(" ", "_") + "_conversions.cc";
		Path outputPath = Paths.get(directoriesMap.get(testsSource).toString(), fileName);
		writeStringTemplate("conversion_test_suite", "testSuite", cppUnitsTestSuite, outputPath);
	};

	private void generateUnitTypeHeaderFile(
			CppUnitType unitType,
			Path outputPath) throws IOException {
		logger.info("Generating " + unitType.getTypeName() + " header file to " + outputPath);
		writeStringTemplate("unit_type_header", "unitType", unitType, outputPath);

	}
	
	private void generateUnitTypeTagsHeaderFile(
			CppUnitType unitType,
			Path outputPath) throws IOException {
		logger.info("Generating " + unitType.getTypeName() + " tags header file to " + outputPath);
		writeStringTemplate("tags_header", "unitType", unitType, outputPath);
	}

	private void generateUnitTypeSourceFile(
			CppUnitType unitType,
			Path outputPath) throws IOException {
		logger.info("Generating " + unitType.getTypeName() + " source file to " + outputPath);
		writeStringTemplate("tags_src", "unitType", unitType, outputPath);
	}

	private void generateTests(
			CppSchema cppSchema,
			Path outputPath) throws IOException {
		logger.info("Generating test header files to " + outputPath.toString());
		writeStringTemplate("all_units", "schema", cppSchema, outputPath);
	}
}
