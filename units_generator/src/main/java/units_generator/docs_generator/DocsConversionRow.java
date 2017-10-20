package units_generator.docs_generator;

import java.util.ArrayList;
import java.util.List;

public class DocsConversionRow {
	private String from;
	private List<String> values;
	
	public DocsConversionRow(String from) {
		this.from = from;
		this.values = new ArrayList<>();
	}
	
	public void addValue(String value) {
		this.values.add(value);
	}

	public String getFrom() {
		return from;
	}

	public List<String> getValues() {
		return values;
	}
}
