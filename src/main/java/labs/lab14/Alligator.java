package labs.lab14;

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

	public void eat(Cat cat) {
        System.out.println("I like felines");
        weight += cat.getWeight();
    }
    
	public void eat(Dog dog) {
        System.out.println("Canines are ok, but I sure like to eat felines! - I'll only eat half since Dogs are not as tasty.");
        weight += dog.getWeight() / 2;
	}

	public int getWeight() {
		return weight;
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