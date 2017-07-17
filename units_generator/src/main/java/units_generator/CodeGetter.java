package units_generator;

public class CodeGetter {
	private int nextCode;
	
	public int getNextCode() {
		return nextCode;
	}
	
	public CodeGetter() {
		nextCode = 2;
	}
	
	public int getNextAndBump()
	{
		int returned = getNextCode();
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
