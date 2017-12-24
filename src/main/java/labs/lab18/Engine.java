package labs.lab18;

public class Engine {
    private int cylinders;
    private int ccDisplacement;

    public Engine() {
        this(0, 0);
    }

    public Engine(int cylinders, int ccDisplacement) {
        this.cylinders = cylinders;
        this.ccDisplacement = ccDisplacement;
    }

    @Override
    public String toString() {
        return "cylinders = " + cylinders + " ccDisplacement = " + ccDisplacement;
    }
}