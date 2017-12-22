package labs.lab15;

public class Cat implements Edible {
	static final String CLASSIFICATION;

	static {
		CLASSIFICATION = "Mammal";
	}

	private String color;
	private int age;
	private int weight;
	private String disposition;

	public Cat() {
		this ("Tortoise shell", 1, 10, "Aloof");
	}

	public Cat(String c, int a, int w, String d) {
		color = c;
		age = a;
		weight = w;
		disposition = d;
	}

	public void grow() {
		age++;
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

	public void eat(String s) {
		System.out.println("I like " + s);
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

	@Override
	public int getWeight() {
		return weight;
    }
    
	@Override
	public boolean isPreferredFood(Object obj) {
		return !(obj instanceof Cat);
	}
}