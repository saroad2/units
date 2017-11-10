package units_generator.schema_validator.exceptions;

public class NoneExitingUnitType extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1279502559442668116L;

	public NoneExitingUnitType(String unitTypeName) {
		super("there is no unit type named \"" + unitTypeName + "\" in schema.");
	}
}
