package units_generator.cpp_generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Logger;

import units_generator.UnitsGenerator;
import units_schema.Schema;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.StringTemplate;

public class CppUnitsGenerator {	
	
	private final static Logger logger =
			Logger.getLogger(CppUnitsGenerator.class.getName());

	public void generate(
			Schema schema,
			String stringTemplateDirectory,
			String outputDirectory) throws IOException{
		CppSchema cppSchema = convertToCppSchema(schema);
		StringTemplateGroup group = getStringTempateGroup(stringTemplateDirectory);
		generateHeaders(cppSchema, group, outputDirectory);
		generateSources(cppSchema, group, outputDirectory);
	}

	private CppSchema convertToCppSchema(Schema schema) {
		logger.info("Convert to CPP schema...");
		CppSchema cppSchema = new CppSchema(schema);
		logger.info("Convert to CPP schema succeeded!");
		return cppSchema;
	}
	
	private StringTemplateGroup getStringTempateGroup(
			String stringTemplateDirectory) throws FileNotFoundException {
		File groupFile = Paths.get(stringTemplateDirectory, "units_cpp.stg").toFile();
		return new StringTemplateGroup(new FileReader(groupFile));
	}

	private void generateHeaders(
			CppSchema cppSchema,
			StringTemplateGroup group,
			String outputDirectory) throws IOException {
		File headersDirectory = Paths.get(outputDirectory, "headers").toFile();
		headersDirectory.mkdir();
		generateTagsHeaderFile(cppSchema, group, headersDirectory);
		logger.info("Generating header files to " + headersDirectory.toString());
		for (CppUnitType unitType : cppSchema.getUnitTypes()) {
			if (!unitType.isTagsOnly()) {
				generateUnitTypeHeaderFile(group, unitType, headersDirectory);
			}
		}
	}

	void generateTagsHeaderFile(
			CppSchema cppSchema,
			StringTemplateGroup group,
			File headersDirectory) throws IOException{
		File tagsDirectory = Paths.get(headersDirectory.toString(), "tags").toFile();
		tagsDirectory.mkdir();
		for (CppUnitType unitType : cppSchema.getUnitTypes()) {
			generateUnitTypeTagsHeaderFile(group, unitType, tagsDirectory);
		}
	};
	
	private void generateUnitTypeTagsHeaderFile(
			StringTemplateGroup group,
			CppUnitType unitType,
			File tagsDirectory) throws IOException {
		StringTemplate st = group.getInstanceOf("tags_header");
		Path outputPath =
				Paths.get(tagsDirectory.getPath(),
						  unitType.getTagsHeaderFileName());
		st.setAttribute("unitType", unitType);
		ArrayList<String> lines = new ArrayList<String>();
		lines.add(st.toString());
		Files.write(outputPath, lines, Charset.forName("utf-8"));
	}
	
	private void generateUnitTypeHeaderFile(
			StringTemplateGroup group,
			CppUnitType unitType,
			File headersDirectory) throws IOException {
		StringTemplate st = group.getInstanceOf("unit_type_header");
		Path outputPath =
				Paths.get(headersDirectory.getPath(),
						  unitType.getHeaderFileName());
		st.setAttribute("unitType", unitType);
		ArrayList<String> lines = new ArrayList<String>();
		lines.add(st.toString());
		Files.write(outputPath, lines, Charset.forName("utf-8"));
	}

	private void generateSources(
			CppSchema cppSchema,
			StringTemplateGroup group,
			String outputDirectory) throws IOException {
		File cppDirectory = Paths.get(outputDirectory, "cpp", "tags").toFile();
		cppDirectory.mkdirs();
		logger.info("Generating source files to " + cppDirectory.toString());
		for (CppUnitType unitType : cppSchema.getUnitTypes()) {
			generateUnitTypeSourceFile(group, unitType, cppDirectory);
		}
	}

	private void generateUnitTypeSourceFile(
			StringTemplateGroup group,
			CppUnitType unitType,
			File headersDirectory) throws IOException {
		StringTemplate st = group.getInstanceOf("tags_src");
		Path outputPath =
				Paths.get(headersDirectory.getPath(),
						  unitType.getTagsSourceFileName());
		st.setAttribute("unitType", unitType);
		ArrayList<String> lines = new ArrayList<String>();
		lines.add(st.toString());
		Files.write(outputPath, lines, Charset.forName("utf-8"));
	}
}
