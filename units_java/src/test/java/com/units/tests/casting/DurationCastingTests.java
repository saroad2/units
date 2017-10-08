/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.duration.*;

public class DurationCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromDaysToHours() {
		checkCastedValue(Hours.castFrom(Days.one()).value(), 24.0);
	}

	@Test
	public void testCastFromDaysToMicroseconds() {
		checkCastedValue(Microseconds.castFrom(Days.one()).value(), 8.64E10);
	}

	@Test
	public void testCastFromDaysToMilliseconds() {
		checkCastedValue(Milliseconds.castFrom(Days.one()).value(), 8.64E7);
	}

	@Test
	public void testCastFromDaysToMinutes() {
		checkCastedValue(Minutes.castFrom(Days.one()).value(), 1440.0);
	}

	@Test
	public void testCastFromDaysToSeconds() {
		checkCastedValue(Seconds.castFrom(Days.one()).value(), 86400.0);
	}

	@Test
	public void testCastFromDaysToYears() {
		checkCastedValue(Years.castFrom(Days.one()).value(), 0.00273972602739);
	}

	@Test
	public void testCastFromHoursToDays() {
		checkCastedValue(Days.castFrom(Hours.one()).value(), 0.04166666666666);
	}

	@Test
	public void testCastFromHoursToMicroseconds() {
		checkCastedValue(Microseconds.castFrom(Hours.one()).value(), 3.6E9);
	}

	@Test
	public void testCastFromHoursToMilliseconds() {
		checkCastedValue(Milliseconds.castFrom(Hours.one()).value(), 3600000.0);
	}

	@Test
	public void testCastFromHoursToMinutes() {
		checkCastedValue(Minutes.castFrom(Hours.one()).value(), 60.0);
	}

	@Test
	public void testCastFromHoursToSeconds() {
		checkCastedValue(Seconds.castFrom(Hours.one()).value(), 3600.0);
	}

	@Test
	public void testCastFromHoursToYears() {
		checkCastedValue(Years.castFrom(Hours.one()).value(), 1.14155251141E-4);
	}

	@Test
	public void testCastFromMicrosecondsToDays() {
		checkCastedValue(Days.castFrom(Microseconds.one()).value(), 1.1574074074E-11);
	}

	@Test
	public void testCastFromMicrosecondsToHours() {
		checkCastedValue(Hours.castFrom(Microseconds.one()).value(), 2.7777777777E-10);
	}

	@Test
	public void testCastFromMicrosecondsToMilliseconds() {
		checkCastedValue(Milliseconds.castFrom(Microseconds.one()).value(), 0.001);
	}

	@Test
	public void testCastFromMicrosecondsToMinutes() {
		checkCastedValue(Minutes.castFrom(Microseconds.one()).value(), 1.6666666666E-8);
	}

	@Test
	public void testCastFromMicrosecondsToSeconds() {
		checkCastedValue(Seconds.castFrom(Microseconds.one()).value(), 1.0E-6);
	}

	@Test
	public void testCastFromMicrosecondsToYears() {
		checkCastedValue(Years.castFrom(Microseconds.one()).value(), 3.1709791983E-14);
	}

	@Test
	public void testCastFromMillisecondsToDays() {
		checkCastedValue(Days.castFrom(Milliseconds.one()).value(), 1.1574074074E-8);
	}

	@Test
	public void testCastFromMillisecondsToHours() {
		checkCastedValue(Hours.castFrom(Milliseconds.one()).value(), 2.7777777777E-7);
	}

	@Test
	public void testCastFromMillisecondsToMicroseconds() {
		checkCastedValue(Microseconds.castFrom(Milliseconds.one()).value(), 1000.0);
	}

	@Test
	public void testCastFromMillisecondsToMinutes() {
		checkCastedValue(Minutes.castFrom(Milliseconds.one()).value(), 1.6666666666E-5);
	}

	@Test
	public void testCastFromMillisecondsToSeconds() {
		checkCastedValue(Seconds.castFrom(Milliseconds.one()).value(), 0.001);
	}

	@Test
	public void testCastFromMillisecondsToYears() {
		checkCastedValue(Years.castFrom(Milliseconds.one()).value(), 3.1709791983E-11);
	}

	@Test
	public void testCastFromMinutesToDays() {
		checkCastedValue(Days.castFrom(Minutes.one()).value(), 6.9444444444E-4);
	}

	@Test
	public void testCastFromMinutesToHours() {
		checkCastedValue(Hours.castFrom(Minutes.one()).value(), 0.016666666666);
	}

	@Test
	public void testCastFromMinutesToMicroseconds() {
		checkCastedValue(Microseconds.castFrom(Minutes.one()).value(), 6.0E7);
	}

	@Test
	public void testCastFromMinutesToMilliseconds() {
		checkCastedValue(Milliseconds.castFrom(Minutes.one()).value(), 60000.0);
	}

	@Test
	public void testCastFromMinutesToSeconds() {
		checkCastedValue(Seconds.castFrom(Minutes.one()).value(), 60.0);
	}

	@Test
	public void testCastFromMinutesToYears() {
		checkCastedValue(Years.castFrom(Minutes.one()).value(), 1.90258751902E-6);
	}

	@Test
	public void testCastFromSecondsToDays() {
		checkCastedValue(Days.castFrom(Seconds.one()).value(), 1.1574074074E-5);
	}

	@Test
	public void testCastFromSecondsToHours() {
		checkCastedValue(Hours.castFrom(Seconds.one()).value(), 2.7777777777E-4);
	}

	@Test
	public void testCastFromSecondsToMicroseconds() {
		checkCastedValue(Microseconds.castFrom(Seconds.one()).value(), 1000000.0);
	}

	@Test
	public void testCastFromSecondsToMilliseconds() {
		checkCastedValue(Milliseconds.castFrom(Seconds.one()).value(), 1000.0);
	}

	@Test
	public void testCastFromSecondsToMinutes() {
		checkCastedValue(Minutes.castFrom(Seconds.one()).value(), 0.016666666666);
	}

	@Test
	public void testCastFromSecondsToYears() {
		checkCastedValue(Years.castFrom(Seconds.one()).value(), 3.1709791983E-8);
	}

	@Test
	public void testCastFromYearsToDays() {
		checkCastedValue(Days.castFrom(Years.one()).value(), 365.0);
	}

	@Test
	public void testCastFromYearsToHours() {
		checkCastedValue(Hours.castFrom(Years.one()).value(), 8760.0);
	}

	@Test
	public void testCastFromYearsToMicroseconds() {
		checkCastedValue(Microseconds.castFrom(Years.one()).value(), 3.1536E13);
	}

	@Test
	public void testCastFromYearsToMilliseconds() {
		checkCastedValue(Milliseconds.castFrom(Years.one()).value(), 3.1536E10);
	}

	@Test
	public void testCastFromYearsToMinutes() {
		checkCastedValue(Minutes.castFrom(Years.one()).value(), 525600.0);
	}

	@Test
	public void testCastFromYearsToSeconds() {
		checkCastedValue(Seconds.castFrom(Years.one()).value(), 3.1536E7);
	}


}