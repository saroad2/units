package units_generator.general_generator;

import units_schema.UnitScale;
import units_generator.NamesManipulator;
import units_generator.internal.UnitScaleInterface;


public class GeneralUnitScale implements UnitScaleInterface {

	String name;
	
	public GeneralUnitScale(UnitScale scale) {
		name = NamesManipulator.getName(scale);
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getScale() {
		// TODO Auto-generated method stub
		return null;
	}

}
