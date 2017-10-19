package units_generator.docs_generator;

import java.util.ArrayList;
import java.util.List;

import units_generator.internal.UnitTypeInterface;
import units_generator.internal.UnitsSchemaInterface;
import units_generator.internal.UnitsTestSuiteInterface;
import units_schema.Schema;
import units_schema.UnitType;

public class DocsSchema implements UnitsSchemaInterface {
	
	private List<UnitTypeInterface> unitTypes;
	
	public DocsSchema(Schema schema) {
		unitTypes = new ArrayList<UnitTypeInterface>();
		for (UnitType unitType : schema.getUnitTypes()) {
			unitTypes.add(new DocsUnitType(unitType));
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
