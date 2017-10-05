package units_generator.java_generator;

import java.util.ArrayList;
import java.util.List;

import units_generator.internal.UnitTypeInterface;
import units_generator.internal.UnitsSchemaInterface;

import units_schema.Schema;
import units_schema.UnitType;

public class JavaUnitsSchema implements UnitsSchemaInterface {

	private List<UnitTypeInterface> unitTypes;
	
	private static JavaSupportChecker supportChecker = new JavaSupportChecker();
	
	public JavaUnitsSchema(Schema schema) {
		unitTypes = new ArrayList<>();
		for (UnitType unitType : schema.getUnitTypes()) {
			if (supportChecker.isSupported(unitType)) {
				unitTypes.add(new JavaUnitType(unitType));
			}
		}
	}
	
	@Override
	public List<UnitTypeInterface> getUnitTypes() {
		return unitTypes;
	}

}
