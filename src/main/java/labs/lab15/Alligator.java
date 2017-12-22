package labs.lab15;

public class Alligator {
	static final String CLASSIFICATION;

	static {
		CLASSIFICATION = "Reptile";
	}

	private String color;
	private int age;
	private int weight;
	private String disposition;

	public Alligator() {
		this ("Green", 1, 40, "Aggressive");
	}

	public Alligator(String c, int a, int w, String d) {
		color = c;
		age = a;
		weight = w;
		disposition = d;
	}

	public void grow() {
        age++;
        weight += 5;
	}

	public void grow(int w) {
		age++;
		weight += w;
	}

	public void grow(int a, int w) {
			age += a;
			weight += w;
	}

	public void setColor(String c) {
		color = c;
	}

	public void setDisposition(String d) {
		disposition = d;
	}

	public void eat(Edible edible) {
        if (edible instanceof Cat) {
            System.out.println("I like felines");
            weight += edible.getWeight();
        } else if (edible instanceof Dog) {
            System.out.println("Canines are ok, but I sure like to eat felines! - I'll only eat half since Dogs are not as tasty.");
            weight += edible.getWeight() / 2;
        }
    }
    
	public void printCharacteristics() {
		System.out.println();
		System.out.println("I am a cat");
		System.out.println("My classification is:  " + CLASSIFICATION);
		System.out.println("My color is:  " + color);
		System.out.println("My age is:  " + age);
		System.out.println("My weight is:  " + weight);
		System.out.println("My disposition is:  " + disposition);
	}
}