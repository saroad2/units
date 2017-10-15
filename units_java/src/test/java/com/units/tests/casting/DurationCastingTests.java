/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.duration.*;

public class DurationCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromDaysToHours() {
		checkCastedValue(Days.one().castTo(Hours.class).value(), 24.0);
	}

	@Test
	public void testCastFromDaysToMicroseconds() {
		checkCastedValue(Days.one().castTo(Microseconds.class).value(), 8.64E10);
	}

	@Test
	public void testCastFromDaysToMilliseconds() {
		checkCastedValue(Days.one().castTo(Milliseconds.class).value(), 8.64E7);
	}

	@Test
	public void testCastFromDaysToMinutes() {
		checkCastedValue(Days.one().castTo(Minutes.class).value(), 1440.0);
	}

	@Test
	public void testCastFromDaysToSeconds() {
		checkCastedValue(Days.one().castTo(Seconds.class).value(), 86400.0);
	}

	@Test
	public void testCastFromDaysToYears() {
		checkCastedValue(Days.one().castTo(Years.class).value(), 0.00273972602739);
	}

	@Test
	public void testCastFromHoursToDays() {
		checkCastedValue(Hours.one().castTo(Days.class).value(), 0.04166666666666);
	}

	@Test
	public void testCastFromHoursToMicroseconds() {
		checkCastedValue(Hours.one().castTo(Microseconds.class).value(), 3.6E9);
	}

	@Test
	public void testCastFromHoursToMilliseconds() {
		checkCastedValue(Hours.one().castTo(Milliseconds.class).value(), 3600000.0);
	}

	@Test
	public void testCastFromHoursToMinutes() {
		checkCastedValue(Hours.one().castTo(Minutes.class).value(), 60.0);
	}

	@Test
	public void testCastFromHoursToSeconds() {
		checkCastedValue(Hours.one().castTo(Seconds.class).value(), 3600.0);
	}

	@Test
	public void testCastFromHoursToYears() {
		checkCastedValue(Hours.one().castTo(Years.class).value(), 1.14155251141E-4);
	}

	@Test
	public void testCastFromMicrosecondsToDays() {
		checkCastedValue(Microseconds.one().castTo(Days.class).value(), 1.1574074074E-11);
	}

	@Test
	public void testCastFromMicrosecondsToHours() {
		checkCastedValue(Microseconds.one().castTo(Hours.class).value(), 2.7777777777E-10);
	}

	@Test
	public void testCastFromMicrosecondsToMilliseconds() {
		checkCastedValue(Microseconds.one().castTo(Milliseconds.class).value(), 0.001);
	}

	@Test
	public void testCastFromMicrosecondsToMinutes() {
		checkCastedValue(Microseconds.one().castTo(Minutes.class).value(), 1.6666666666E-8);
	}

	@Test
	public void testCastFromMicrosecondsToSeconds() {
		checkCastedValue(Microseconds.one().castTo(Seconds.class).value(), 1.0E-6);
	}

	@Test
	public void testCastFromMicrosecondsToYears() {
		checkCastedValue(Microseconds.one().castTo(Years.class).value(), 3.1709791983E-14);
	}

	@Test
	public void testCastFromMillisecondsToDays() {
		checkCastedValue(Milliseconds.one().castTo(Days.class).value(), 1.1574074074E-8);
	}

	@Test
	public void testCastFromMillisecondsToHours() {
		checkCastedValue(Milliseconds.one().castTo(Hours.class).value(), 2.7777777777E-7);
	}

	@Test
	public void testCastFromMillisecondsToMicroseconds() {
		checkCastedValue(Milliseconds.one().castTo(Microseconds.class).value(), 1000.0);
	}

	@Test
	public void testCastFromMillisecondsToMinutes() {
		checkCastedValue(Milliseconds.one().castTo(Minutes.class).value(), 1.6666666666E-5);
	}

	@Test
	public void testCastFromMillisecondsToSeconds() {
		checkCastedValue(Milliseconds.one().castTo(Seconds.class).value(), 0.001);
	}

	@Test
	public void testCastFromMillisecondsToYears() {
		checkCastedValue(Milliseconds.one().castTo(Years.class).value(), 3.1709791983E-11);
	}

	@Test
	public void testCastFromMinutesToDays() {
		checkCastedValue(Minutes.one().castTo(Days.class).value(), 6.9444444444E-4);
	}

	@Test
	public void testCastFromMinutesToHours() {
		checkCastedValue(Minutes.one().castTo(Hours.class).value(), 0.016666666666);
	}

	@Test
	public void testCastFromMinutesToMicroseconds() {
		checkCastedValue(Minutes.one().castTo(Microseconds.class).value(), 6.0E7);
	}

	@Test
	public void testCastFromMinutesToMilliseconds() {
		checkCastedValue(Minutes.one().castTo(Milliseconds.class).value(), 60000.0);
	}

	@Test
	public void testCastFromMinutesToSeconds() {
		checkCastedValue(Minutes.one().castTo(Seconds.class).value(), 60.0);
	}

	@Test
	public void testCastFromMinutesToYears() {
		checkCastedValue(Minutes.one().castTo(Years.class).value(), 1.90258751902E-6);
	}

	@Test
	public void testCastFromSecondsToDays() {
		checkCastedValue(Seconds.one().castTo(Days.class).value(), 1.1574074074E-5);
	}

	@Test
	public void testCastFromSecondsToHours() {
		checkCastedValue(Seconds.one().castTo(Hours.class).value(), 2.7777777777E-4);
	}

	@Test
	public void testCastFromSecondsToMicroseconds() {
		checkCastedValue(Seconds.one().castTo(Microseconds.class).value(), 1000000.0);
	}

	@Test
	public void testCastFromSecondsToMilliseconds() {
		checkCastedValue(Seconds.one().castTo(Milliseconds.class).value(), 1000.0);
	}

	@Test
	public void testCastFromSecondsToMinutes() {
		checkCastedValue(Seconds.one().castTo(Minutes.class).value(), 0.016666666666);
	}

	@Test
	public void testCastFromSecondsToYears() {
		checkCastedValue(Seconds.one().castTo(Years.class).value(), 3.1709791983E-8);
	}

	@Test
	public void testCastFromYearsToDays() {
		checkCastedValue(Years.one().castTo(Days.class).value(), 365.0);
	}

	@Test
	public void testCastFromYearsToHours() {
		checkCastedValue(Years.one().castTo(Hours.class).value(), 8760.0);
	}

	@Test
	public void testCastFromYearsToMicroseconds() {
		checkCastedValue(Years.one().castTo(Microseconds.class).value(), 3.1536E13);
	}

	@Test
	public void testCastFromYearsToMilliseconds() {
		checkCastedValue(Years.one().castTo(Milliseconds.class).value(), 3.1536E10);
	}

	@Test
	public void testCastFromYearsToMinutes() {
		checkCastedValue(Years.one().castTo(Minutes.class).value(), 525600.0);
	}

	@Test
	public void testCastFromYearsToSeconds() {
		checkCastedValue(Years.one().castTo(Seconds.class).value(), 3.1536E7);
	}


}