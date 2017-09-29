package units_generator.schema_reader;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import units_schema.Schema;

public class SchemaReader {
	
	private final static Logger logger =
			Logger.getLogger(SchemaReader.class.getName());
	
	public Schema getSchema(String jsonFilePath) throws IOException, InvalidSchemaException{
		Schema schema = readSchemaForJsonFile(jsonFilePath);
		validateSchema(schema);
		logger.fine("Schema content: " + schema.toString());
		return schema;
	}
	
	private Schema readSchemaForJsonFile(String jsonFilePath) throws IOException {
		logger.info("Reading schema from " + jsonFilePath + "...");
		ObjectMapper mapper = new ObjectMapper();
		Schema schema = mapper.readValue(new File(jsonFilePath), Schema.class);
		logger.info("Reading schema succeded!");
		return schema;
	}
	
	private void validateSchema(Schema schema) throws InvalidSchemaException {
		logger.info("Validating schema...");
		SchemaValidator.validateSchema(schema);
		logger.info("Schema is valid!");
	}
}
