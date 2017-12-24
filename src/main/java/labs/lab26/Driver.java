package labs.lab26;

import java.io.IOException;

import utils.KeyboardReader;

public class Driver {

    public static void main(String[] args) {
        try {
            KeyboardReader keyReader = KeyboardReader.getInstance();
            double[] data = new double[keyReader.readPositiveInt("Enter the size of data set: ")];
            for (int i = 0; i < data.length; i++) {
                data[i] = keyReader.readDouble((i + 1) + ": ");
            }
            
            System.out.println("Mean value: " + Statistics.calculateMean(data));
            System.out.println("Variance: " + Statistics.calculateVariance(data));
            System.out.println("Standard deviation: " + Statistics.calculateStandardDeviation(data));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}