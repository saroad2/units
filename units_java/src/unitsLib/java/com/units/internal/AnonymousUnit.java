package com.units.internal;

import com.units.Unit;
import com.units.exceptions.IllegalUnitsCasting;

public class AnonymousUnit extends AbstractUnit {

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

	public <E extends Unit> E castTo(Class<E> toClass) {
		try {
			validateType((Ratio)toClass.getField("_typeCode").get(null));
			double toScale = (double)toClass.getField("_scale").get(null);
			double newValue = value() * scale() / toScale;
			return toClass.getDeclaredConstructor(double.class).newInstance(newValue);
		}
		catch (ReflectiveOperationException e) {
			throw new IllegalUnitsCasting();
		}
	}
	
	private void validateType(Ratio otherType) {
		if (!otherType.equals(_typeCode)) {
			throw new IllegalUnitsCasting();
		}
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
