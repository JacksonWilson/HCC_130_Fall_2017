package labs.lab26;

public class Statistics {
	public static double calculateMean (double [] data) {
		double accum = 0;

		for (int i = 0; i < data.length; i++)
			accum += data[i];

		if (data.length == 0)
			return 0.0;
		else
			return accum / data.length;
	}

	public static double calculateVariance(double[] data) {
		double mean = calculateMean(data);
		double sum = 0;

		for (double d : data) {
			sum += (mean - d) * (mean - d);
		}

		return sum / data.length;
	}

	public static double calculateStandardDeviation(double[] data) {
		return Math.sqrt(calculateVariance(data));
	}
}