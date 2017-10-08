package units_generator.java_generator;

import units_generator.internal.LanguageSupportChecker;
import units_schema.Ratio;
import units_schema.UnitScale;
import units_schema.UnitType;

public class JavaSupportChecker implements LanguageSupportChecker{

	@Override
	public boolean isSupported(UnitScale unitScale) { 
		return isValidRatio(unitScale.getRatio());
	}
	
	@Override
	public boolean isSupported(UnitType unitType) { 
		return isValidRatio(unitType.getRatio());
	}
	
	private boolean isValidRatio(Ratio ratio) {
		if (ratio == null)
			return true;
		if (ratio.getNumerators() == null || ratio.getDenumerators() == null)
			return false;
		return ratio.getNumerators().size() == 1 &&
				ratio.getDenumerators().size() == 1;
	}
}
