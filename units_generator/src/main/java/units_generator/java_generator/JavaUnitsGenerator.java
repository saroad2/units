package units_generator.java_generator;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import units_generator.LanguageUnitsGenerator;
import units_generator.internal.UnitScaleInterface;
import units_generator.internal.UnitTypeInterface;
import units_generator.internal.UnitsSchemaInterface;

import org.antlr.stringtemplate.StringTemplateGroup;

public class JavaUnitsGenerator extends LanguageUnitsGenerator {

	private static final String root = "root";
	private static final String library = "libary";
	private static final String tests = "tests";
	
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
	}

}
