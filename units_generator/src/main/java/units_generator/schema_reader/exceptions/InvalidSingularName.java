package units_generator.schema_reader.exceptions;

public class InvalidSingularName extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7055535212797292940L;

	public InvalidSingularName(int index, String typeName) {
		super("Unit scale number " + index + " of type " + typeName + " has no singular name.");
	}
}
