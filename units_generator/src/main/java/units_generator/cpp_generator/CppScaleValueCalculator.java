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
		else {
			initializeNonBasicScale(result, unitScale);
		}
		return result;
	}
	
	public static void initializeBasicScale(Result result) {
		result.scale = "1";
	}
	
	public static void initializeNonBasicScale(Result result, UnitScale unitScale) {
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
