package units_generator.schema_validator.exceptions;

public class NoneExitingUnitType extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1279502559442668116L;

	public NoneExitingUnitType(String definedUnitType, String unitType) {
		super("the unit type " + unitType + " used in " + definedUnitType
				+ " definition does not exist.");
	}
}
