package assignments.a3;

import java.io.IOException;

import utils.KeyboardReader;

public class Polynomial {
    private double quadraticCoefficient;
    private double linearCoefficient;
    private double constant;

    public Polynomial() throws IOException {
        constructPolynomial();
    }

    public void constructPolynomial() throws IOException {
        quadraticCoefficient = KeyboardReader.getInstance().readDouble("Enter the coefficient of the quadratic term: ");
        linearCoefficient = KeyboardReader.getInstance().readDouble("Enter the coefficient of the linear term: ");
        constant = KeyboardReader.getInstance().readDouble("Enter the constant term: ");
    }

    public double functionValue(double n) {
        return quadraticCoefficient * n * n + linearCoefficient * n + constant;
    }

    public void displaySelf() {
        System.out.println(quadraticCoefficient + "x^2 + " + linearCoefficient + "x + " + constant);
    }
}