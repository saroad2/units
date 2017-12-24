package units_generator.java_generator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import units_generator.internal.ConstantsGroupInterface;
import units_generator.internal.NamesManipulator;
import units_generator.internal.AbstractUnitType;
import units_generator.internal.AbstractUnitsSchema;
import units_generator.internal.UnitsTestSuiteInterface;
import units_schema.ConstantsGroup;
import units_schema.Schema;
import units_schema.TestSuite;
import units_schema.UnitType;

public class JavaUnitsSchema extends AbstractUnitsSchema {

	private List<AbstractUnitType> unitTypes;
	private List<UnitsTestSuiteInterface> testSuites;
	private List<ConstantsGroupInterface> constantsGroups;
	
	private static JavaSupportChecker supportChecker = new JavaSupportChecker();
	
	public JavaUnitsSchema(Schema schema) {
		unitTypes = new ArrayList<>();
		testSuites = new ArrayList<>();
		for (UnitType unitType : schema.getUnitTypes()) {
			if (!supportChecker.isSupported(unitType))
				continue;
			unitTypes.add(new JavaUnitType(this, unitType));
			String unitTypeName = NamesManipulator.getName(unitType);
			TestSuite testSuite = schema.getTests().getTestSuites().stream()
					.filter((someTestSuite) -> someTestSuite.getUnitType().equals(unitTypeName))
					.collect(Collectors.toList()).get(0);
			testSuites.add(new JavaTestSuite(testSuite));
		}
		constantsGroups = new ArrayList<>();
		for (ConstantsGroup group : schema.getConstants().getConstantsGroups())
			constantsGroups.add(new JavaConstantsGroup(this, group));
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
