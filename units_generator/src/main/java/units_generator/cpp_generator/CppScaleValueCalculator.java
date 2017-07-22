package units_generator.cpp_generator;

import java.util.ArrayList;
import java.util.List;
import units_schema.UnitScale;

public class CppScaleValueCalculator {
	public static class Result {
		public String scale;
		public boolean isStringMultiplyer;
		
		public Result() {
			scale = "";
			isStringMultiplyer = false;
		}
	}
	
	public static Result calculate(UnitScale unitScale) {
		Result result = new Result();
		if (unitScale.getIsBasic()) {
			initializeBasicScale(result);
		}
		else if(unitScale.getRatio() != null) {
			initializeRatioScale(result, unitScale);
		}
		else {
			initializeRelativeScale(result, unitScale);
		}
		return result;
	}
	
	public static void initializeBasicScale(Result result) {
		result.scale = "1";
	}
	public static void initializeRatioScale(Result result, UnitScale unitScale) {
		CppUnitScale numerator = UnitsRepository.getInstance().getScale(unitScale.getRatio().getNumerator());
		CppUnitScale denumerator = UnitsRepository.getInstance().getScale(unitScale.getRatio().getDenumerator());
		result.scale = "ratio_scale_tag<" +
				numerator.getNamespace() + "::tags::" + numerator.getTagName() + ", " +
				denumerator.getNamespace() + "::tags::" + denumerator.getTagName() + ">::scale";
	}
	public static void initializeRelativeScale(Result result, UnitScale unitScale) {
		if (unitScale.getMultiplyerNumber() != null) {
			result.scale = Double.toString(unitScale.getMultiplyerNumber());
		}
		if (unitScale.getMultiplyerString() != null) {
			result.scale = unitScale.getMultiplyerString();
			result.isStringMultiplyer = true;
		}
		if (unitScale.getRelativeTo() != null) {
			CppUnitScale relativeTo = UnitsRepository.getInstance().getScale(unitScale.getRelativeTo());
			result.scale += " * " + relativeTo.getTagName() + "::scale";
		}
	}
}
