package units_generator;

import units_schema.Schema;

import org.apache.commons.io.FileUtils;
import org.antlr.stringtemplate.StringTemplateGroup;

import units_generator.cpp_generator.CppSchema;
import units_generator.cpp_generator.CppUnitsGenerator;
import units_generator.docs_generator.DocsGenerator;
import units_generator.docs_generator.DocsSchema;
import units_generator.java_generator.JavaUnitsGenerator;
import units_generator.java_generator.JavaUnitsSchema;
import units_generator.schema_reader.SchemaReader;
import units_generator.schema_reader.exceptions.InvalidSchema;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

public class UnitsGenerator {
	
	private final static Logger logger =
			Logger.getLogger(UnitsGenerator.class.getName());
	
	public void generate(
			String dataDirectoryPath,
			String stringTemplateDirectory,
			String outputDirectory) {
		try {
			makeDirectories(outputDirectory);
			Schema schema = new SchemaReader().getSchema(dataDirectoryPath);
			generateCpp(stringTemplateDirectory, schema, outputDirectory);
			generateJava(stringTemplateDirectory, schema, outputDirectory);
			generateDocs(stringTemplateDirectory, schema, outputDirectory);
			return;
		}
		catch(IOException e) {
			logger.severe("Got io exception in read json file: " + e.getMessage());
		}
		catch(InvalidSchema e) {
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
	
	private void generateJava(String stringTemplateDirectory, Schema schema, String outputDirectory)
			throws IOException, FileNotFoundException {
		StringTemplateGroup group = getStringTempateGroup(stringTemplateDirectory,  "units_java.stg");
		JavaUnitsSchema javaSchema = new JavaUnitsSchema(schema);
		Path javaOutputDirectory = Paths.get(outputDirectory, "java");
		new JavaUnitsGenerator(group).generate(javaSchema, javaOutputDirectory);
	}
	
	private void generateDocs(String stringTemplateDirectory, Schema schema, String outputDirectory)
			throws IOException {
		StringTemplateGroup group = getStringTempateGroup(stringTemplateDirectory,  "units_docs.stg");
		DocsSchema generalSchema = new DocsSchema(schema);
		Path outputPath = Paths.get(outputDirectory, "docs");
		new DocsGenerator(group).generate(generalSchema, outputPath);
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
    	String dataDirectoryPath = new String(args[0]);
    	String stringTemplateDirectory = new String(args[1]);
    	String outputDirectory = new String(args[2]);
    	logger.info("generate units from json file: " + dataDirectoryPath);
    	logger.info("stringtemplate directory: " + stringTemplateDirectory);
    	logger.info("output directory: " + outputDirectory);
    	new UnitsGenerator().generate(dataDirectoryPath, stringTemplateDirectory, outputDirectory);
    }
}