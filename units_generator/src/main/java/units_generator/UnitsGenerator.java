package units_generator;

import units_schema.Schema;

import com.fasterxml.jackson.databind.ObjectMapper;

import units_generator.cpp_generator.CppSchema;
import units_generator.cpp_generator.CppUnitType;
import units_generator.cpp_generator.CppUnitsGenerator;

import java.io.File;
import java.io.IOException;
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
			Schema schema = getSchema(jsonFilePath);
			logger.info("Generatating cpp files...");
			new CppUnitsGenerator().generate(schema, stringTemplateDirectory, outputDirectory);
			logger.info("Generating cpp files succeded!");
			return;
		}
		catch(IOException e)
		{
			logger.severe("Got io exception in read json file: " + e.getMessage());
		}
		System.exit(1);
    }
	
	private void makeDirectories(String outputDirectory) {
		File outputFile = new File(outputDirectory);
		if (outputFile.exists()) {
			logger.info("Output directory already exists. Deleting it.");
			outputFile.delete();
		}
		logger.info("Making new output directory.");
		outputFile.mkdir();
	}
	
	private Schema getSchema(String jsonFilePath) throws IOException{
		logger.info("Reading schema from " + jsonFilePath + "...");
		ObjectMapper mapper = new ObjectMapper();
		Schema schema = mapper.readValue(new File(jsonFilePath), Schema.class);
		logger.info("Reading schema succeded!");
		logger.fine("Schema content: " + schema.toString());
		return schema;
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