package units_generator;

import units_schema.Schema;

import org.apache.commons.io.FileUtils;
import org.antlr.stringtemplate.StringTemplateGroup;

import units_generator.cpp_generator.CppSchema;
import units_generator.cpp_generator.CppUnitType;
import units_generator.cpp_generator.CppUnitsGenerator;

import units_generator.general_generator.GeneralGenerator;
import units_generator.general_generator.GeneralSchema;
import units_generator.schema_reader.InvalidSchemaException;
import units_generator.schema_reader.SchemaReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.ArrayList;

public class UnitsGenerator {
	
	private final static Logger logger =
			Logger.getLogger(UnitsGenerator.class.getName());
	
	public void generate(
			String jsonFilePath,
			String stringTemplateDirectory,
			String outputDirectory) {
		try {
			makeDirectories(outputDirectory);
			Schema schema = new SchemaReader().getSchema(jsonFilePath);
			generateCpp(stringTemplateDirectory, schema, outputDirectory);
			generateGeneralFiles(stringTemplateDirectory, schema, outputDirectory);
			return;
		}
		catch(IOException e) {
			logger.severe("Got io exception in read json file: " + e.getMessage());
		}
		catch(InvalidSchemaException e) {
			logger.severe("Units schema is invalid because of the following reason:\n" + e.toString());
		}
		System.exit(1);
    }

	private void generateCpp(String stringTemplateDirectory, Schema schema, String outputDirectory)
			throws IOException, FileNotFoundException {
		StringTemplateGroup group = getStringTempateGroup(stringTemplateDirectory,  "units_cpp.stg");
		CppSchema cppSchema = new CppSchema(schema);
		Path cppOutputDirectory = Paths.get(outputDirectory, "cpp");
		new CppUnitsGenerator(group).generate(cppSchema, cppOutputDirectory);
	}
	
	private void generateGeneralFiles(String stringTemplateDirectory, Schema schema, String outputDirectory)
			throws IOException {
		StringTemplateGroup group = getStringTempateGroup(stringTemplateDirectory,  "units_general.stg");
		GeneralSchema generalSchema = new GeneralSchema(schema);
		Path outputPath = Paths.get(outputDirectory);
		new GeneralGenerator(group).generate(generalSchema, outputPath);
	}
	
	private void makeDirectories(String outputDirectory) throws IOException{
		File outputFile = new File(outputDirectory);
		if (outputFile.exists()) {
			logger.info("Output directory already exists. Deleting it.");
			FileUtils.deleteDirectory(outputFile);
		}
		logger.info("Making new output directory.");
		outputFile.mkdir();
	}
	
	private StringTemplateGroup getStringTempateGroup(
			String stringTemplateDirectory,
			String groupFileName) throws FileNotFoundException {
		File groupFile = Paths.get(stringTemplateDirectory, groupFileName).toFile();
		return new StringTemplateGroup(new FileReader(groupFile));
	}

    public static void main(String[] args) {  
    	String jsonFilePath = new String(args[0]);
    	String stringTemplateDirectory = new String(args[1]);
    	String outputDirectory = new String(args[2]);
    	logger.info("generate units from json file: " + jsonFilePath);
    	logger.info("stringtemplate directory: " + stringTemplateDirectory);
    	logger.info("output directory: " + outputDirectory);
    	new UnitsGenerator().generate(jsonFilePath, stringTemplateDirectory, outputDirectory);
    }
}