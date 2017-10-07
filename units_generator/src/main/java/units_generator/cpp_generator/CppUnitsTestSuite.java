package units_generator.cpp_generator;

import java.util.ArrayList;
import java.util.List;

import units_generator.internal.UnitsTestCaseInterface;
import units_generator.internal.UnitsTestSuiteInterface;
import units_schema.TestCase;
import units_schema.TestSuite;

public class CppUnitsTestSuite implements UnitsTestSuiteInterface {

	private String unitType;
	private List<UnitsTestCaseInterface> testCases;
	private List<String> includes;
	private List<String> namespaces;
	private String testSuiteName;
	
	public CppUnitsTestSuite(TestSuite testSuite) {
		unitType = testSuite.getUnitType();
		testCases = new ArrayList<>();
		for (TestCase testCase : testSuite.getTestCases()) {
			testCases.add(new CppUnitsTestCase(testCase));
		}
		buildIncludes();
		buildNamespaces();
		testSuiteName = CppNamesFormatter.formatClassName("test " + unitType + " conversions");
	}

	private void buildIncludes() {
		includes = new ArrayList<>();
		includes.add("<units/cases.h>");
		includes.add("<gtest/gtest.h>");
		includes.add("<units/" + CppNamesFormatter.formatUnitTypeHeaderName(unitType) + ">");
	}
	
	private void buildNamespaces() {
		namespaces = new ArrayList<>();
		namespaces.add("testing");
		namespaces.add("units::" + CppNamesFormatter.formatNamespaceName(unitType));
	}
	
	@Override
	public String getUnitType() {
		return unitType;
	}

	@Override
	public List<UnitsTestCaseInterface> getTestCases() {
		return testCases;
	}

	public List<String> getIncludes() {
		return includes;
	}

	public List<String> getNamespaces() {
		return namespaces;
	}

	public String getTestSuiteName() {
		return testSuiteName;
	}

}
