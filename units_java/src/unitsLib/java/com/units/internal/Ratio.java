package com.units.internal;

public class Ratio {

	private int numerator;
	private int denominator;
	
	public Ratio(int numerator, int denominator) {
		if (denominator == 0)
			throw new IllegalArgumentException("denominator can't be 0");
		int gcd = calculateGcd(numerator, denominator);
		this.numerator = numerator / gcd;
		this.denominator = denominator / gcd;
	}
	
	public Ratio(int number) {
		this(number, 1);
	}
	
	private static int calculateGcd(int number1, int number2) {
		while (number2 != 0) {
			int temp = number1 % number2;
			number1 = number2;
			number2 = temp;
		}
		return number1;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}
	
	public Ratio multiply(Ratio other) {
		int newNumerator = getNumerator() * other.getNumerator();
		int newDenominator = getDenominator() * other.getDenominator();
		return new Ratio(newNumerator, newDenominator);
	}
	
	public Ratio divide(Ratio other) {
		int newNumerator = getNumerator() * other.getDenominator();
		int newDenominator = getDenominator() * other.getNumerator();
		return new Ratio(newNumerator, newDenominator);
	}
	
	public Ratio pow(int power) {
		int newNumerator = (int)Math.pow(getNumerator(), power);
		int newDenominator = (int)Math.pow(getDenominator(), power);
		return new Ratio(newNumerator, newDenominator);
	}
	
	public static Ratio one() {
		return new Ratio(1);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + denominator;
		result = prime * result + numerator;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ratio other = (Ratio) obj;
		if (denominator != other.denominator)
			return false;
		if (numerator != other.numerator)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ratio [" + numerator + "/" + denominator + "]";
	}
}
