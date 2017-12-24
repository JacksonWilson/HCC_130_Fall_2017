package labs.lab18;

public class Car extends Vehicle {
    private Engine motor;
    private String color;

    public Car() {
        this.motor = new Engine();
        this.color = "Default";
    }

    public Car(String type, int gasLeft, int cylinders, int ccDisplacement, String color) {
        super(type, gasLeft);
        this.motor = new Engine(cylinders, ccDisplacement);
        this.color = color;
    }

    public void removeAndInstallEngine(int cylinders, int ccDisplacement) {
        this.motor = new Engine(cylinders, ccDisplacement);
    }

	@Override
	public void move() {
		gasLeft -= (gasLeft / 20);
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + motor + " color = " + color;
    }
}