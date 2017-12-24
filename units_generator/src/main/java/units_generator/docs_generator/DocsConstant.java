package units_generator.docs_generator;

import units_generator.cpp_generator.CppSupportChecker;
import units_generator.internal.ConstantInterface;
import units_generator.java_generator.JavaSupportChecker;
import units_schema.Constant;

public class DocsConstant implements ConstantInterface {

	private String name;
	private String unitScale;
	private double value;
	private String description;
	private boolean isCppSupported;
	private boolean isJavaSupported;
	
	private static CppSupportChecker cppSupportChecker = new CppSupportChecker(); 
	private static JavaSupportChecker javaSupportChecker = new JavaSupportChecker();
	
	public DocsConstant(Constant constant) {
		name = constant.getName();
		unitScale = DocsScaleCalculator.calculateConstantScale(constant);
		value = constant.getValue();
		description = constant.getDescription();
		isCppSupported = cppSupportChecker.isSupported(constant);
		isJavaSupported = javaSupportChecker.isSupported(constant);
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getUnitScale() {
		return unitScale;
	}

	@Override
	public double getValue() {
		return value;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public boolean getIsCppSupported() {
		return isCppSupported;
	}

	public boolean getIsJavaSupported() {
		return isJavaSupported;
	}

}
