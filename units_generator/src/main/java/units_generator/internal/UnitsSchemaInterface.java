package units_generator.internal;

import java.util.List;
import java.util.stream.Collectors;

public interface UnitsSchemaInterface {
	public List<UnitTypeInterface> getUnitTypes();
	public List<UnitsTestSuiteInterface> getTestSuites();
	public List<ConstantsGroupInterface> getConstantsGroups();
	
	default public UnitTypeInterface getUnitTypeOfScale(String scaleName) {
		return getUnitTypes().stream()
				.filter((unitType) -> unitTypeHasScale(unitType, scaleName))
				.collect(Collectors.toList())
				.get(0);
	}
	
	default public boolean unitTypeHasScale(UnitTypeInterface unitType, String scaleName) {
		return unitType.getUnitScales().stream()
				.filter((unitScale) -> unitScale.getName().equals(scaleName))
				.count() != 0;
	}
}
