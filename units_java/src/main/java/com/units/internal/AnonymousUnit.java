package com.units.internal;

import com.units.Unit;

public class AnonymousUnit extends NumericValue implements Unit {

	private final Ratio _typeCode;
	private final double _scale;
	
	public AnonymousUnit(
			Ratio typeCode,
			double scale,
			double value) {
		super(value);
		this._typeCode = typeCode;
		this._scale = scale;
	}

	@Override
	public double scale() {
		return _scale;
	}

	@Override
	public Ratio typeCode() {
		return _typeCode;
	}
	
	@Override
	public String pluralName() {
		return "anonymous units";
	};

}
