package units_generator.internal;

public class PrimesGetter {
	
	private int nextCode;
	
	public PrimesGetter() {
		nextCode = 2;
	}
	
	public int getNextPrime() {
		return nextCode;
	}
	
	public int getNextPrimeAndBump()
	{
		int returned = getNextPrime();
		bump();
		return returned;
	}
	
	private void bump() {
		++nextCode;
		while (!isPrime(nextCode)) {
			++nextCode;
		}
	}
	
	private boolean isPrime(int number) {
		for (int i=2; i <=Math.sqrt(number); ++i) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
}
