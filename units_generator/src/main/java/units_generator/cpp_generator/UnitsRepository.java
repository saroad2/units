package units_generator.cpp_generator;

import java.util.HashMap;
import java.util.Map;

public class UnitsRepository {
	
	private static UnitsRepository _repository = new UnitsRepository();
	private Map<String, CppUnitType> typesMap;
	private Map<String, CppUnitScale> scalesMap;
	
	public static UnitsRepository getInstance() {
		return _repository;
	}
	
	public UnitsRepository() {
		typesMap = new HashMap<String, CppUnitType>();
		scalesMap = new HashMap<String, CppUnitScale>();
	}
	
	public void addType(CppUnitType unitType) {
		typesMap.put(unitType.getTypeName(), unitType);
	}
	
	public CppUnitType getType(String typeName) {
		return typesMap.get(typeName);
	}
	
	public void addScale(CppUnitScale unitScale) {
		scalesMap.put(unitScale.getName(), unitScale);
	}
	
	public CppUnitScale getScale(String scaleName) {
		return scalesMap.get(scaleName);
	}
}
