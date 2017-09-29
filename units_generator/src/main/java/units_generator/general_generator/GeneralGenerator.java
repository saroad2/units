package units_generator.general_generator;

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

import units_schema.Schema;

import org.antlr.stringtemplate.StringTemplateGroup;

import units_generator.cpp_generator.CppUnitsGenerator;

import org.antlr.stringtemplate.StringTemplate;

public class GeneralGenerator {

	private final static Logger logger =
			Logger.getLogger(GeneralGenerator.class.getName());
	
	public void generate(
			Schema schema,
			String stringTemplateDirectory,
			String outputDirectory) throws IOException{
		logger.info("Generatating general files...");
		GeneralSchema generalSchema = new GeneralSchema(schema);
		StringTemplateGroup group = getStringTempateGroup(stringTemplateDirectory);
		StringTemplate st = group.getInstanceOf("supported_units");
		Path outputPath = Paths.get(outputDirectory, "supported_units.md");
		st.setAttribute("schema", generalSchema);
		ArrayList<String> lines = new ArrayList<String>();
		lines.add(st.toString());
		Files.write(outputPath, lines, Charset.forName("utf-8"));
		logger.info("Generating general files succeded!");
	}
	
	private StringTemplateGroup getStringTempateGroup(
			String stringTemplateDirectory) throws FileNotFoundException {
		File groupFile = Paths.get(stringTemplateDirectory, "units_general.stg").toFile();
		return new StringTemplateGroup(new FileReader(groupFile));
	}
}
