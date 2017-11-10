package units_generator.schema_validator.exceptions;

public class NoneExitingUnitScale extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8918901111893677846L;

	public NoneExitingUnitScale(String unitScaleName) {
		super("there is no unit scale named \"" + unitScaleName + "\" in schema.");
	}
}
