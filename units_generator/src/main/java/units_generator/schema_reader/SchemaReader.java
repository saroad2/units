package units_generator.schema_reader;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import units_generator.schema_validator.SchemaValidator;
import units_generator.schema_validator.exceptions.InvalidSchema;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

import units_schema.Constants;
import units_schema.Schema;
import units_schema.Tests;

public class SchemaReader {
	
	private final static Logger logger =
			Logger.getLogger(SchemaReader.class.getName());
	
	public Schema getSchema(String dataDirectoryPath) throws IOException, InvalidSchema{
		Schema schema = readSchemaForDataDirectory(dataDirectoryPath);
		validateSchema(schema);
		logger.fine("Schema content: " + schema.toString());
		return schema;
	}
	
	private Schema readSchemaForDataDirectory(String dataDirectoryPath) throws IOException {
		logger.info("Reading schema from " + dataDirectoryPath + "...");
		ObjectMapper mapper = new ObjectMapper();
		Path unitsJsonFilePath = Paths.get(dataDirectoryPath, "units.json");
		Schema schema = mapper.readValue(unitsJsonFilePath.toFile(), Schema.class);
		readTestsFromDataDirectory(schema, mapper, dataDirectoryPath);
		readConstantsFromDataDirectory(schema, mapper, dataDirectoryPath);
		logger.info("Reading schema succeded!");
		return schema;
	}

	private void readTestsFromDataDirectory(Schema schema, ObjectMapper mapper, String dataDirectoryPath)
			throws IOException, JsonParseException, JsonMappingException {
		Path testsPath = Paths.get(dataDirectoryPath, "units_tests.json");
		Tests tests = mapper.readValue(testsPath.toFile(), Tests.class);
		schema.setTests(tests);
	}	
	
	private void readConstantsFromDataDirectory(Schema schema, ObjectMapper mapper, String dataDirectoryPath)
			throws IOException, JsonParseException, JsonMappingException {
		Path constantsPath = Paths.get(dataDirectoryPath, "units_constants.json");
		Constants constants = mapper.readValue(constantsPath.toFile(), Constants.class);
		schema.setConstants(constants);
	}

	private void validateSchema(Schema schema) throws InvalidSchema {
		logger.info("Validating schema...");
		SchemaValidator.validateSchema(schema);
		logger.info("Schema is valid!");
	}
}
