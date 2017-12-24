package units_generator.internal;

import java.util.List;

public abstract class AbstractUnitsSchema {
	public abstract List<AbstractUnitType> getUnitTypes();
	public abstract List<UnitsTestSuiteInterface> getTestSuites();
	public abstract List<ConstantsGroupInterface> getConstantsGroups();
	
	public final AbstractUnitType getUnitTypeOfScale(String scaleName) {
		return getUnitTypes().stream()
				.filter((unitType) -> unitType.hasScale(scaleName))
				.findFirst()
				.orElse(null);
	}
	
	public final AbstractUnitType getUnitType(String unitTypeName) {
		return getUnitTypes().stream()
				.filter((unitType) -> unitType.getTypeName().equals(unitTypeName))
				.findFirst()
				.orElse(null);
	}
	
	public final UnitScaleInterface getUnitScale(String scaleName) {
		return getUnitTypes().stream()
				.map((unitType) -> unitType.getUnitScale(scaleName))
				.filter(scale -> scale != null)
				.findFirst()
				.orElse(null);
	}
}
