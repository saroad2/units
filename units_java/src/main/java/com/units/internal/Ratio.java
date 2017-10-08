package com.units.internal;

public class Ratio {

	private int numerator;
	private int denumerator;
	
	public Ratio(int numerator, int denumerator) {
		if (denumerator == 0)
			throw new IllegalArgumentException("denumerator can't be 0");
		int gcd = calculateGcd(numerator, denumerator);
		this.numerator = numerator / gcd;
		this.denumerator = denumerator / gcd;
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

	public int getDenumerator() {
		return denumerator;
	}
	
	public Ratio multiply(Ratio other) {
		int newNumerator = getNumerator() * other.getNumerator();
		int newDenumerator = getDenumerator() * other.getDenumerator();
		return new Ratio(newNumerator, newDenumerator);
	}
	
	public Ratio divide(Ratio other) {
		int newNumerator = getNumerator() * other.getDenumerator();
		int newDenumerator = getDenumerator() * other.getNumerator();
		return new Ratio(newNumerator, newDenumerator);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + denumerator;
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
		if (denumerator != other.denumerator)
			return false;
		if (numerator != other.numerator)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ratio [" + numerator + "/" + denumerator + "]";
	}
}
