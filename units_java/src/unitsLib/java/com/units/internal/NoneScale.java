package com.units.internal;

import com.units.Unit;

public class NoneScale extends AbstractUnit implements Unit {

	private static final double _scale = 1;
	private static final Ratio _typeCode = Ratio.one();
	
	public NoneScale(double value) {
		super(value);
	}
	
	public static NoneScale one() {
		return new NoneScale(1);
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
		return "none scale";
	}

}
