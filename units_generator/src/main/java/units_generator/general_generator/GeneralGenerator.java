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

import units_schema.Schema;

import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.StringTemplate;

public class GeneralGenerator {

	public void generate(
			Schema schema,
			String stringTemplateDirectory,
			String outputDirectory) throws IOException{
		GeneralSchema generalSchema = new GeneralSchema(schema);
		StringTemplateGroup group = getStringTempateGroup(stringTemplateDirectory);
		StringTemplate st = group.getInstanceOf("supported_units");
		Path outputPath = Paths.get(outputDirectory, "supported_units.md");
		st.setAttribute("schema", generalSchema);
		ArrayList<String> lines = new ArrayList<String>();
		lines.add(st.toString());
		Files.write(outputPath, lines, Charset.forName("utf-8"));
	}
	
	private StringTemplateGroup getStringTempateGroup(
			String stringTemplateDirectory) throws FileNotFoundException {
		File groupFile = Paths.get(stringTemplateDirectory, "units_general.stg").toFile();
		return new StringTemplateGroup(new FileReader(groupFile));
	}
}
