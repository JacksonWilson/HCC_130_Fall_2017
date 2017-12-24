package labs.lab19;

public class RadioactiveMaterial extends DecayingMaterial {

	public RadioactiveMaterial(double v) {
		super(v);
	}

	@Override
	public void decay() {
		volume /= 2;
	}

	public static void identifyProcess() {
		System.out.println("Decays via a half-life relationship");
	}
	
    @Override
    public String toString() {
        return "Do not touch me!!!";
    }
}
