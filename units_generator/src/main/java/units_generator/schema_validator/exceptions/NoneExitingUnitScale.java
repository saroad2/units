package units_generator.schema_validator.exceptions;

public class NoneExitingUnitScale extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8918901111893677846L;

	public NoneExitingUnitScale(String definedUnitScale, String unitScale) {
		super("the unit scale " + unitScale + " used in " + definedUnitScale
				+ " definition does not exist.");
	}
}
