package labs.lab18;

public class BuoyancyOperatedAquaticTransport extends Vehicle {
    private Engine motor;
    private String color;
    private Boolean isCommercial;

    public BuoyancyOperatedAquaticTransport() {
        this.motor = new Engine();
        this.color = "Default";
        this.isCommercial = false;
    }

    public BuoyancyOperatedAquaticTransport(String type, int gasLeft, int cylinders, int ccDisplacement, String color, Boolean isCommercial) {
        super(type, gasLeft);
        this.motor = new Engine(cylinders, ccDisplacement);
        this.color = color;
        this.isCommercial = isCommercial;
    }

	@Override
	public void move() {
		gasLeft -= (gasLeft / 10);
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + motor + " color = " + color + " isCommercial = " + isCommercial;
    }
}