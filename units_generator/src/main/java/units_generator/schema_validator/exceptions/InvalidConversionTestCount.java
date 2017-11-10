package units_generator.schema_validator.exceptions;

public class InvalidConversionTestCount extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1759214173663595204L;

	public InvalidConversionTestCount(
			String from,
			String to,
			long count,
			String context) {
		super("there are " + count + " test case from " + from + " to " + to +
				". there should be only one", context);
	}
}
