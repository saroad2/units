package units_generator.general_generator;

import units_schema.UnitType;
import units_schema.UnitScale;

import units_generator.internal.NamesManipulator;
import units_generator.internal.UnitScaleInterface;

import units_generator.cpp_generator.CppSupportChecker;
import units_generator.java_generator.JavaSupportChecker;


public class GeneralUnitScale implements UnitScaleInterface {

	private String name;
	private boolean isCppSupported;
	private boolean isJavaSupported;
	
	private static CppSupportChecker cppSupportChecker = new CppSupportChecker();
	private static JavaSupportChecker javaSupportChecker = new JavaSupportChecker();
	
	public GeneralUnitScale(UnitType unitType, UnitScale scale) {
		name = NamesManipulator.getName(scale);
		isCppSupported =
				cppSupportChecker.isSupported(unitType) &&
				cppSupportChecker.isSupported(scale);
		isJavaSupported =
				javaSupportChecker.isSupported(unitType) &&
				javaSupportChecker.isSupported(scale);
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getScale() {
		return null;
	}

	public boolean getIsCppSupported() {
		return isCppSupported;
	}

	public boolean getIsJavaSupported() {
		return isJavaSupported;
	}

}
