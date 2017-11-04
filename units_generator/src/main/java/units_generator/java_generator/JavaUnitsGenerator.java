package units_generator.java_generator;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import units_generator.internal.ConstantsGroupInterface;
import units_generator.internal.LanguageUnitsGenerator;
import units_generator.internal.UnitScaleInterface;
import units_generator.internal.UnitTypeInterface;
import units_generator.internal.UnitsSchemaInterface;
import units_generator.internal.UnitsTestSuiteInterface;

import org.antlr.stringtemplate.StringTemplateGroup;

public class JavaUnitsGenerator extends LanguageUnitsGenerator {

	private static final String root = "root";
	private static final String library = "libary";
	private static final String tests = "tests";
	private static final String conversionTests = "conversion_tests";
	
	public JavaUnitsGenerator(StringTemplateGroup group) {
		super(JavaUnitsGenerator.class.getSimpleName(), group);
	}
	
	@Override
	protected Map<String, Path> getDirectoriesMap(
			UnitsSchemaInterface schema, 
			Path rootDirectory) throws IOException {
		Map<String, Path> directoriesMap = new HashMap<>();
		addToDirectoriesMap(directoriesMap, root, rootDirectory);
		Path libraryPath = Paths.get(rootDirectory.toString(), "main", "java", "com", "units");
		addToDirectoriesMap(directoriesMap, library, libraryPath);
		Path testsPath = Paths.get(rootDirectory.toString(), "test", "java", "com", "units", "tests");
		addToDirectoriesMap(directoriesMap, tests, testsPath);
		for (UnitTypeInterface unitType : schema.getUnitTypes()) {
			JavaUnitType javaUnitType = (JavaUnitType)unitType;
			Path unitTypePackagePath = Paths.get(libraryPath.toString(), javaUnitType.getPackageName());
			Path unitTypeTestsPackagePath = Paths.get(testsPath.toString(), javaUnitType.getPackageName());
			addToDirectoriesMap(
					directoriesMap,
					unitTypePackageKey(javaUnitType),
					unitTypePackagePath);
			addToDirectoriesMap(
					directoriesMap,
					unitTypeTestsPackageKey(javaUnitType),
					unitTypeTestsPackagePath);
		}
		addToDirectoriesMap(
				directoriesMap,
				conversionTests,
				Paths.get(testsPath.toString(), "casting"));
		return directoriesMap;
	}
	
	private String unitTypePackageKey(JavaUnitType unitType) {
		return unitType.getTypeName();
	}
	

	private String unitTypeTestsPackageKey(JavaUnitType unitType) {
		return unitType.getTypeName() + " tests";
	}

	@Override
	protected void generateSchemaFiles(
			UnitsSchemaInterface schema,
			Map<String, Path> directoriesMap) throws IOException {
	}

	@Override
	protected void generateUnitTypeFiles(
			UnitTypeInterface unitType,
			Map<String, Path> directoriesMap) throws IOException {
		JavaUnitType javaUnitType = (JavaUnitType)unitType; 
		Path outputPath = Paths.get(
				directoriesMap.get(unitTypePackageKey(javaUnitType)).toString(),
				javaUnitType.getClassName() + ".java");
		writeStringTemplate("unit_type_interface", "unitType", javaUnitType, outputPath);
	}

	@Override
	protected void generateUnitScaleFiles(
			UnitScaleInterface unitScale,
			Map<String, Path> directoriesMap) throws IOException {
		JavaUnitScale javaUnitScale = (JavaUnitScale)unitScale; 
		generateUnitScaleClass(directoriesMap, javaUnitScale);
		generateUnitScaleClassTests(directoriesMap, javaUnitScale);
	}
	
	@Override
	protected void generateTestSuiteFiles(
			UnitsTestSuiteInterface testSuite,
			Map<String, Path> directoriesMap) throws IOException {
		JavaTestSuite javaTestSuite = (JavaTestSuite)testSuite;
		Path outputPath = Paths.get(
				directoriesMap.get(conversionTests).toString(),
				javaTestSuite.getName() + ".java");
		writeStringTemplate("conversion_test_suite", "testSuite", javaTestSuite, outputPath);
	};
	
	@Override
	protected void generateConstantsGroup(
			ConstantsGroupInterface constantsGroup,
			Map<String, Path> directoriesMap) throws IOException
	{
		
	};

	private void generateUnitScaleClass(
			Map<String, Path> directoriesMap,
			JavaUnitScale javaUnitScale) throws IOException {
		Path outputPath = Paths.get(
				directoriesMap.get(unitTypePackageKey(javaUnitScale.getUnitType())).toString(),
				javaUnitScale.getClassName() + ".java");
		writeStringTemplate("unit_scale_class", "unitScale", javaUnitScale, outputPath);
	}

	private void generateUnitScaleClassTests(
			Map<String, Path> directoriesMap,
			JavaUnitScale javaUnitScale) throws IOException {
		Path outputPath = Paths.get(
				directoriesMap.get(unitTypeTestsPackageKey(javaUnitScale.getUnitType())).toString(),
				javaUnitScale.getClassName() + "Tests.java");
		writeStringTemplate("unit_scale_class_tests", "unitScale", javaUnitScale, outputPath);
	}

}
