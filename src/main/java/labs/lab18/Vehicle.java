package labs.lab18;

public abstract class Vehicle {
    protected String type;
    protected int gasLeft;

    public Vehicle() {
        this("Default", 0);
    }

    public Vehicle(String type, int gasLeft) {
        this.type = type;
        this.gasLeft = gasLeft;
    }

    public abstract void move();

    public void addGass(int amount) {
        gasLeft += amount;
    }

    @Override
    public String toString() {
        return "type = " + type + " gasLeft = " + gasLeft;
    }
}