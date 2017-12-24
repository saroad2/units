package units_generator.docs_generator;

import java.util.ArrayList;
import java.util.List;

import units_generator.internal.ConstantsGroupInterface;
import units_generator.internal.UnitTypeInterface;
import units_generator.internal.AbstractUnitsSchema;
import units_generator.internal.UnitsTestSuiteInterface;
import units_schema.Schema;
import units_schema.TestSuite;
import units_schema.UnitType;

public class DocsSchema extends AbstractUnitsSchema {
	
	private List<UnitTypeInterface> unitTypes;
	private List<UnitsTestSuiteInterface> testSuites;
	
	public DocsSchema(Schema schema) {
		unitTypes = new ArrayList<UnitTypeInterface>();
		for (UnitType unitType : schema.getUnitTypes()) {
			unitTypes.add(new DocsUnitType(unitType));
		}
		testSuites = new ArrayList<>();
		for (TestSuite testSuite : schema.getTests().getTestSuites()) {
			testSuites.add(new DocsTestSuite(testSuite));
		}
	}
	
	@Override
	public List<UnitTypeInterface> getUnitTypes() {
		return unitTypes;
	}
	
	@Override
	public List<UnitsTestSuiteInterface> getTestSuites() {
		return testSuites;
	}
	
	@Override
	public List<ConstantsGroupInterface> getConstantsGroups() {
		return null;
	}
}
