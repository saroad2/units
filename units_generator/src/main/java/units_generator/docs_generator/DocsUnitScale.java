package units_generator.docs_generator;

import units_schema.UnitType;
import units_schema.UnitScale;

import units_generator.internal.NamesManipulator;
import units_generator.internal.UnitScaleInterface;

import units_generator.cpp_generator.CppSupportChecker;
import units_generator.java_generator.JavaSupportChecker;


public class DocsUnitScale implements UnitScaleInterface {

	private String name;
	private String scale;
	private boolean isCppSupported;
	private boolean isJavaSupported;
	
	private static CppSupportChecker cppSupportChecker = new CppSupportChecker();
	private static JavaSupportChecker javaSupportChecker = new JavaSupportChecker();
	
	public DocsUnitScale(UnitType unitType, UnitScale unitScale) {
		name = NamesManipulator.getName(unitScale);
		scale = DocsScaleCalculator.calculateScale(unitScale);
		isCppSupported =
				cppSupportChecker.isSupported(unitType) &&
				cppSupportChecker.isSupported(unitScale);
		isJavaSupported =
				javaSupportChecker.isSupported(unitType) &&
				javaSupportChecker.isSupported(unitScale);
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getScale() {
		return scale;
	}

	public boolean getIsCppSupported() {
		return isCppSupported;
	}

	public boolean getIsJavaSupported() {
		return isJavaSupported;
	}

}
