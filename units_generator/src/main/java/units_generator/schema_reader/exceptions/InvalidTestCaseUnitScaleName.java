package units_generator.schema_reader.exceptions;

public class InvalidTestCaseUnitScaleName extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4124218967899352927L;

	public InvalidTestCaseUnitScaleName(long unitScaleCount, String unitScaleName) {
		super("found " + unitScaleCount + " unit scales with the name " + unitScaleName +
				". there should be exactly one");
	}
}
