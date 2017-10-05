package units_generator.general_generator;

import java.util.ArrayList;
import java.util.List;

import units_schema.UnitType;
import units_schema.UnitScale;
import units_generator.internal.NamesManipulator;
import units_generator.internal.UnitScaleInterface;
import units_generator.internal.UnitTypeInterface;

public class GeneralUnitType implements UnitTypeInterface {
	
	private String name;
	private List<UnitScaleInterface> unitScales;
	private int numberOfScales;

	GeneralUnitType(UnitType unitType) {
		name = NamesManipulator.getName(unitType);
		unitScales = new ArrayList<UnitScaleInterface>();
		for (UnitScale scale : unitType.getUnitScales())
			unitScales.add(new GeneralUnitScale(unitType, scale));
		numberOfScales = unitScales.size();
	}
	
	@Override
	public String getTypeName() {
		return name;
	}
	
	@Override
	public List<UnitScaleInterface> getUnitScales() {
		return unitScales;
	}

	public int getNumberOfScales() {
		return numberOfScales;
	}

}
