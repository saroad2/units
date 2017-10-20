package units_generator.docs_generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import units_generator.internal.UnitsTestCaseInterface;
import units_generator.internal.UnitsTestSuiteInterface;
import units_schema.TestSuite;

public class DocsTestSuite implements UnitsTestSuiteInterface {

	private String unitType;
	private Set<String> unitScaleNames;
	private List<DocsConversionRow> rows;
	
	public DocsTestSuite(TestSuite testSuite) {
		this.unitType = testSuite.getUnitType();
		this.unitScaleNames = testSuite.getTestCases().stream()
				.map(testCase -> testCase.getFrom())
				.collect(Collectors.toSet());
		this.rows = new ArrayList<>();
		for (String scaleName : unitScaleNames) {
			rows.add(buildRow(testSuite, scaleName));
		}
	}
	
	private DocsConversionRow buildRow(TestSuite testSuite, String from) {
		DocsConversionRow row = new DocsConversionRow(from);
		for (String to : unitScaleNames) {
			if (from.equals(to))
				row.addValue("1");
			else
				row.addValue(getConversionValue(testSuite, from, to));
		}
		return row;
	}
	
	private String getConversionValue(TestSuite testSuite, String from, String to) {
		return testSuite.getTestCases().stream()
				.filter(testCase -> testCase.getFrom().equals(from)
						&& testCase.getTo().equals(to))
				.collect(Collectors.toList()).get(0).getValue().toString();
	}
	
	@Override
	public String getUnitType() {
		return unitType;
	}

	@Override
	public List<UnitsTestCaseInterface> getTestCases() {
		return null;
	}
	
	public Set<String> getUnitScaleNames() {
		return unitScaleNames;
	}

	public List<DocsConversionRow> getRows() {
		return rows;
	}

}
