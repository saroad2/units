package units_generator.cpp_generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import units_generator.internal.UnitsTestCaseInterface;
import units_generator.internal.UnitsTestSuiteInterface;
import units_schema.TestCase;
import units_schema.TestSuite;

public class CppUnitsTestSuite implements UnitsTestSuiteInterface {

	private String unitType;
	private List<UnitsTestCaseInterface> testCases;
	private Set<String> includes;
	private Set<String> namespaces;
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
		includes = new TreeSet<>();
		includes.add("<units/cases.h>");
		includes.add("<gtest/gtest.h>");
		includes.add("<units/" + CppNamesFormatter.formatUnitTypeHeaderName(unitType) + ">");
	}
	
	private void buildNamespaces() {
		namespaces = new TreeSet<>();
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

	public Set<String> getIncludes() {
		return includes;
	}

	public Set<String> getNamespaces() {
		return namespaces;
	}

	public String getTestSuiteName() {
		return testSuiteName;
	}

}
