package units_generator.internal;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractUnitsSchema {
	public abstract List<AbstractUnitType> getUnitTypes();
	public abstract List<UnitsTestSuiteInterface> getTestSuites();
	public abstract List<ConstantsGroupInterface> getConstantsGroups();
	
	public final AbstractUnitType getUnitTypeOfScale(String scaleName) {
		return getUnitTypes().stream()
				.filter((unitType) -> unitTypeHasScale(unitType, scaleName))
				.collect(Collectors.toList())
				.get(0);
	}
	
	public final boolean unitTypeHasScale(AbstractUnitType unitType, String scaleName) {
		return unitType.getUnitScales().stream()
				.filter((unitScale) -> unitScale.getName().equals(scaleName))
				.count() != 0;
	}
}
