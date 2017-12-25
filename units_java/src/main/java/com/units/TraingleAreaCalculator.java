package com.units;

import com.units.area.Area;
import com.units.exceptions.IllegalUnitsCasting;
import com.units.length.Length;

class TraingleAreaCalculator <AreaUnit extends Area> {
	
	private Class<AreaUnit> cls;
	
	public TraingleAreaCalculator(Class<AreaUnit> cls) {
		this.cls = cls;
	}
	
	@SuppressWarnings("unchecked")
	public AreaUnit calculate(Length baseWidth, Length height) {
		try {
			/* You can multiply units by one another.
			 * In this case the result unit will be from a multiplication unit type.
			 *
			 * You can also multiply all units with scalars (doubles).
			 * In this example, we use reflection in order to invoke this method.
			 * */
			AreaUnit enclosingRectangleArea = baseWidth.multiply(height).castTo(cls);
			
			AreaUnit result = (AreaUnit)cls
					.getMethod("multiplyByScalar", double.class)
					.invoke(enclosingRectangleArea, 0.5);
			return result;
		}
		catch(ReflectiveOperationException e) {
			throw new IllegalUnitsCasting();
		}
	}
	
}
