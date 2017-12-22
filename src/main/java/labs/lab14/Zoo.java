package labs.lab14;

public class Zoo {
    private Dog dog;
    private Cat cat;
    private Alligator alligator;

    public Zoo() {
        this.dog = new Dog();
        this.cat = new Cat();
        this.alligator = new Alligator();
    }

    public Zoo(String c, int a, int w, String d) {
        this.dog = new Dog();
        this.cat = new Cat();
        this.alligator = new Alligator(c, a, w, d);
    }

    public Dog getDog() {
        return dog;
    }

    public Cat getCat() {
        return cat;
    }

    public Alligator getAlligator() {
        return alligator;
    }

    public void printInventory() {
        dog.printCharacteristics();
        cat.printCharacteristics();
        alligator.printCharacteristics();
    }
}