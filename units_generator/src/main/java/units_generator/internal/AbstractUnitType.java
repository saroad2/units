package units_generator.internal;

import java.util.List;

public abstract class AbstractUnitType {
	public abstract String getTypeName();
	public abstract List<UnitScaleInterface> getUnitScales();

	public final UnitScaleInterface getUnitScale(String scaleName) {
		return getUnitScales().stream()
			.filter((unitScale) -> unitScale.getName().equals(scaleName))
			.findFirst()
			.orElse(null);
	}
	
	public final boolean hasScale(String scaleName) {
		return getUnitScale(scaleName) != null;
	}
}
