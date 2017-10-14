package com.units.exceptions;

public class IllegalUnitsMultiplication extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2231135792128268994L;

	public IllegalUnitsMultiplication() {
		super("Illegal units division had accured");
	}
}
