package units_generator.cpp_generator;

public class CppNewCodeGetter {
	static private CppNewCodeGetter _codeGetter = new CppNewCodeGetter();
	
	private int nextCode;
	
	public static CppNewCodeGetter getInstance() {
		return _codeGetter;
	}
	
	private CppNewCodeGetter() {
		nextCode = 2;
	}
	
	public int getNextCode() {
		return nextCode;
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
