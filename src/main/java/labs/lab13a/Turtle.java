package labs.lab13a;

public class Turtle {
    public static final String CLASSIFICATION = "Reptiles";

    private double weight;
    private long age;
    char gender;

    Turtle(double weight, long age, char gender) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
    }

    private double getWeight() {
        return weight;
    }

    private long getAge() {
        return age;
    }

    void grow(double amountWeight) {
        weight += amountWeight;
    }

    void grow(long amountAge) {
        age += amountAge;
    }

    void grow(double amountWeight, long amountAge) {
        weight += amountWeight;
        age += amountAge;
    }

    public void printVitals() {
        System.out.println("WEIGHT: " + getWeight() + " AGE: " + getAge());
    }

    public void printClassification() {
        System.out.println("CLASSIFICATION: " + Turtle.CLASSIFICATION);
    }
}