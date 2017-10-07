package units_generator.general_generator;

import java.util.ArrayList;
import java.util.List;

import units_generator.internal.UnitTypeInterface;
import units_generator.internal.UnitsSchemaInterface;
import units_generator.internal.UnitsTestSuiteInterface;
import units_schema.Schema;
import units_schema.UnitType;

public class GeneralSchema implements UnitsSchemaInterface {
	
	private List<UnitTypeInterface> unitTypes;
	
	public GeneralSchema(Schema schema) {
		unitTypes = new ArrayList<UnitTypeInterface>();
		for (UnitType unitType : schema.getUnitTypes()) {
			unitTypes.add(new GeneralUnitType(unitType));
		}
	}
	
	@Override
	public List<UnitTypeInterface> getUnitTypes() {
		return unitTypes;
	}
	
	@Override
	public List<UnitsTestSuiteInterface> getTestSuites() {
		return null;
	}
}
