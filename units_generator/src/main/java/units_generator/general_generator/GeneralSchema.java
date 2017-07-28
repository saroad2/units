package units_generator.general_generator;

import java.util.ArrayList;
import java.util.List;

import units_generator.NamesManipulator;
import units_schema.Schema;
import units_schema.UnitType;
import units_schema.UnitScale;

public class GeneralSchema {
	
	private class GeneralUnitType {
		
		private class GeneralUnitScale {
			private String name;
			
			public String getName() {
				return name;
			}
			
			GeneralUnitScale(UnitScale scale) {
				name = NamesManipulator.getName(scale);
			}	
		}
		
		private String name;
		private List<GeneralUnitScale> unitScales;
		private int numberOfScales;
		
		public String getName() {
			return name;
		}

		public List<GeneralUnitScale> getUnitScales() {
			return unitScales;
		}
		

		public int getNumberOfScales() {
			return numberOfScales;
		}
		
		GeneralUnitType(UnitType unitType) {
			name = NamesManipulator.getName(unitType);
			unitScales = new ArrayList<GeneralUnitScale>();
			for (UnitScale scale : unitType.getUnitScales())
				unitScales.add(new GeneralUnitScale(scale));
			numberOfScales = unitScales.size();
		}
	}
	
	private List<GeneralUnitType> unitTypes;
	
	public GeneralSchema(Schema schema) {
		unitTypes = new ArrayList<GeneralUnitType>();
		for (UnitType unitType : schema.getUnitTypes()) {
			unitTypes.add(new GeneralUnitType(unitType));
		}
	}
	
	public List<GeneralUnitType> getUnitTypes() {
		return unitTypes;
	}
}
