package labs.lab19;

public class Rock extends DecayingMaterial {

    public Rock(double v) {
        super(v);
    }

	@Override
	public void decay() {
		volume--;
    }
    
	public static void identifyProcess() {
		System.out.println("Decays via a linear relationship");
    }
    
    @Override
    public String toString() {
        return "Pick me up if you want";
    }
}