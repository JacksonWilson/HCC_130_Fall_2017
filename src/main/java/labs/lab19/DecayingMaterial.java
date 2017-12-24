package labs.lab19;

public abstract class DecayingMaterial {
	protected double volume;

	public DecayingMaterial(double v) {
		volume = v;
	}

	public abstract void decay();

	public void printVolume() {
		System.out.println("Current volume is:  " + volume);
	}
	
	public static void identifyProcess() {
		System.out.println("Decay process not defined");
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof DecayingMaterial
			&& Math.floor(volume) == Math.floor(((DecayingMaterial)obj).volume);
	}
}
