package units_generator.schema_validator.exceptions;

public class EmptyName extends InvalidSchema {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3222344567668444040L;

	public EmptyName() {
		super("name cannot be empty");
	}
}
