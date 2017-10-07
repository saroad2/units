package units_generator.schema_reader;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

import units_schema.Schema;
import units_schema.Tests;

public class SchemaReader {
	
	private final static Logger logger =
			Logger.getLogger(SchemaReader.class.getName());
	
	public Schema getSchema(String dataDirectoryPath) throws IOException, InvalidSchemaException{
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
		Path testsPath = Paths.get(dataDirectoryPath, "units_tests.json");
		Tests tests = mapper.readValue(testsPath.toFile(), Tests.class);
		schema.setTests(tests);
		logger.info("Reading schema succeded!");
		return schema;
	}
	
	private void validateSchema(Schema schema) throws InvalidSchemaException {
		logger.info("Validating schema...");
		SchemaValidator.validateSchema(schema);
		logger.info("Schema is valid!");
	}
}
