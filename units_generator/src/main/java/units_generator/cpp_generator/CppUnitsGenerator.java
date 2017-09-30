package units_generator.cpp_generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.StringTemplate;

import units_generator.UnitsGenerator;
import units_generator.internal.UnitTypeInterface;

public class CppUnitsGenerator {	
	
	private final static Logger logger =
			Logger.getLogger(CppUnitsGenerator.class.getName());
	private final static String root = "root";
	private final static String headers = "headers";
	private final static String tags = "tags";
	private final static String source = "source";
	private final static String tests = "tests";
	
	private StringTemplateGroup group;
	
	public CppUnitsGenerator(StringTemplateGroup group) {
		this.group = group;
	}

	public void generate(
			CppSchema cppSchema,
			Path outputDirectory) throws IOException{
		logger.info("Generatating cpp files...");
		Map<String, Path> directoriesMap = getDirectoriesMap(outputDirectory);
		generateHeaders(cppSchema, directoriesMap);
		generateSources(cppSchema, directoriesMap);
		generateTests(cppSchema, directoriesMap);
		logger.info("Generating cpp files succeded!");
	}
	
	public Map<String, Path> getDirectoriesMap(Path rootDirectory) throws IOException{
		Map<String, Path> directoriesMap = new HashMap<>();
		addToDirectoriesMap(directoriesMap, root, rootDirectory);
		Path headersDirectory = Paths.get(rootDirectory.toString(), "units", "headers", "units");
		addToDirectoriesMap(directoriesMap, headers, headersDirectory);
		addToDirectoriesMap(directoriesMap, tags, Paths.get(headersDirectory.toString(), "tags"));
		addToDirectoriesMap(
				directoriesMap,
				source,
				Paths.get(rootDirectory.toString(), "units", "cpp", "units", "tags"));
		addToDirectoriesMap(
				directoriesMap,
				tests,
				Paths.get(rootDirectory.toString(), "unitsTest", "headers"));
		return directoriesMap;
	}
	
	public void addToDirectoriesMap(
			Map<String, Path> directoriesMap,
			String key,
			Path directoryPath) throws IOException {
		directoryPath.toFile().mkdirs();
		directoriesMap.put(key, directoryPath);
	}

	private void generateHeaders(
			CppSchema cppSchema,
			Map<String, Path> directoriesMap) throws IOException {
		generateTagsHeaderFile(cppSchema, directoriesMap);
		Path headersDirectory = directoriesMap.get(headers);
		logger.info("Generating header files to " + headersDirectory);
		for (UnitTypeInterface unitType : cppSchema.getUnitTypes()) {
			if (!((CppUnitType)unitType).isTagsOnly()) {
				generateUnitTypeHeaderFile((CppUnitType)unitType, headersDirectory);
			}
		}
	}

	void generateTagsHeaderFile(
			CppSchema cppSchema,
			Map<String, Path> directoriesMap) throws IOException{
		Path tagsDirectory = directoriesMap.get(tags);
		for (UnitTypeInterface unitType : cppSchema.getUnitTypes()) {
			generateUnitTypeTagsHeaderFile((CppUnitType)unitType, tagsDirectory);
		}
	};
	
	private void generateUnitTypeTagsHeaderFile(
			CppUnitType unitType,
			Path tagsDirectory) throws IOException {
		Path outputPath = Paths.get(tagsDirectory.toString(), unitType.getTagsHeaderFileName());
		logger.info("Generating " + unitType.getTypeName() + " tags header file to " + outputPath.toString());
		writeStringTemplate("tags_header", "unitType", unitType, outputPath);
	}
	
	private void generateUnitTypeHeaderFile(
			CppUnitType unitType,
			Path headersDirectory) throws IOException {
		Path outputPath = Paths.get(headersDirectory.toString(), unitType.getHeaderFileName());
		logger.info("Generating " + unitType.getTypeName() + " header file to " + outputPath.toString());
		writeStringTemplate("unit_type_header", "unitType", unitType, outputPath);

	}

	private void generateSources(
			CppSchema cppSchema,
			Map<String, Path> directoriesMap) throws IOException {
		Path sourceDirectoryPath = directoriesMap.get(source);
		logger.info("Generating source files to " + sourceDirectoryPath);
		for (UnitTypeInterface unitType : cppSchema.getUnitTypes()) {
			generateUnitTypeSourceFile((CppUnitType)unitType, sourceDirectoryPath);
		}
	}

	private void generateUnitTypeSourceFile(
			CppUnitType unitType,
			Path sourceFilesDirectory) throws IOException {
		Path outputPath = Paths.get(sourceFilesDirectory.toString(), unitType.getTagsSourceFileName());
		logger.info("Generating " + unitType.getTypeName() + " source file to " + outputPath.toString());
		writeStringTemplate("tags_src", "unitType", unitType, outputPath);
	}

	private void generateTests(
			CppSchema cppSchema,
			Map<String, Path> directoriesMap) throws IOException {
		Path outputPath = Paths.get(directoriesMap.get(tests).toString(), "all_units.h");
		logger.info("Generating test header files to " + outputPath.toString());
		writeStringTemplate("all_units", "schema", cppSchema, outputPath);
	}
	
	private void writeStringTemplate(
			String stringTemplateName,
			String attributeName,
			Object obj,
			Path outputPath) throws IOException {
		StringTemplate st = group.getInstanceOf(stringTemplateName);
		st.setAttribute(attributeName, obj);
		writeToFile(st.toString(), outputPath);
	}
	
	private void writeToFile(String lines, Path outputPath) throws IOException{
		OutputStreamWriter stream = new OutputStreamWriter(
				new FileOutputStream(outputPath.toString()),
				StandardCharsets.UTF_8);
		stream.write(lines);
		stream.flush();
		stream.close();
	}
}
