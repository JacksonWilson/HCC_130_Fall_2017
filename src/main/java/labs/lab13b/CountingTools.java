package labs.lab13b;

public class CountingTools {
    private CountingTools() {}

	public static double factorial (int n) {
		double nFactorial = 1.0;

		if (n < 0)
			return 0;

		if (n == 0)
			return 1;

		for (int i = 1; i <= n; i++)
			nFactorial *= i;

		return nFactorial;
    }
    
    public static double permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static double combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}