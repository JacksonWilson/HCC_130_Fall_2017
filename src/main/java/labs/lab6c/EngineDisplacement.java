package labs.lab6c;

import java.io.IOException;

import utils.KeyboardReader;

public class EngineDisplacement {
    private static final double c = 0.7854;
    public static void main(String[] args) {
        try (KeyboardReader keyReader = new KeyboardReader(System.in)) {
            double cylinderBore = keyReader.readDouble("Enter the cylinder bore (inches):\t");
            double stroke = keyReader.readDouble("Enter the stroke (inches):\t\t");
            double numCylinders = keyReader.readDouble("Enter the number of cylinders:\t\t");
            System.out.println("\nThe engine displacement in cubic inches is:\t" + (c * cylinderBore * cylinderBore * stroke * numCylinders));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}