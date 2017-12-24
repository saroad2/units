package units_generator.internal;

import java.util.List;

public abstract class AbstractUnitType {
	public abstract String getTypeName();
	public abstract List<UnitScaleInterface> getUnitScales();
}
