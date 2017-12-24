package units_generator.docs_generator;

import java.util.ArrayList;
import java.util.List;

import units_generator.internal.ConstantsGroupInterface;
import units_generator.internal.AbstractUnitType;
import units_generator.internal.AbstractUnitsSchema;
import units_generator.internal.UnitsTestSuiteInterface;
import units_schema.ConstantsGroup;
import units_schema.Schema;
import units_schema.TestSuite;
import units_schema.UnitType;

public class DocsSchema extends AbstractUnitsSchema {
	
	private List<AbstractUnitType> unitTypes;
	private List<UnitsTestSuiteInterface> testSuites;
	private List<ConstantsGroupInterface> constantsGroups;
	
	public DocsSchema(Schema schema) {
		initializeUnitTypes(schema);
		initializeTestsSuites(schema);
		initializeConstantsGroups(schema);
	}

	private void initializeUnitTypes(Schema schema) {
		unitTypes = new ArrayList<AbstractUnitType>();
		for (UnitType unitType : schema.getUnitTypes())
			unitTypes.add(new DocsUnitType(unitType));
	}
	
	private void initializeTestsSuites(Schema schema) {
		testSuites = new ArrayList<>();
		for (TestSuite testSuite : schema.getTests().getTestSuites())
			testSuites.add(new DocsTestSuite(testSuite));
	}
	
	private void initializeConstantsGroups(Schema schema) {
		constantsGroups = new ArrayList<>();
		for (ConstantsGroup group : schema.getConstants().getConstantsGroups())
			constantsGroups.add(new DocsConstantsGroup(group));
	}
	
	@Override
	public List<AbstractUnitType> getUnitTypes() {
		return unitTypes;
	}
	
	@Override
	public List<UnitsTestSuiteInterface> getTestSuites() {
		return testSuites;
	}
	
	@Override
	public List<ConstantsGroupInterface> getConstantsGroups() {
		return constantsGroups;
	}
}
