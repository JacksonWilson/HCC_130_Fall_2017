package labs.lab17a;

public class Fish {
    private static int idCount;
    private static int numFishAlive;

    private int id;
    private int weight;
    private int maxWeight;
    private boolean alive;

    public Fish(int weight) {
        this.weight = weight;
        this.maxWeight = weight * 2;
        this.alive = true;
        ++Fish.idCount;
        this.id = Fish.idCount;
        Fish.numFishAlive++;
    }

    private int getWeight() {
        return weight;
    }

    public void kill() {
        System.out.println("ug, Fish #" + id + " is dead");
        alive = false;
        Fish.numFishAlive--;
    }

    public void eat(Fish fish) {
        System.out.println("Fish #" + id + " is eating Fish #" + fish.id);
        fish.kill();
        weight += fish.getWeight();
        if (weight > maxWeight) {
            kill();
        }
    }

    @Override
    public String toString() {
        return "id = " + id + " weight = " + weight + " alive = " + alive;
    }

    public static int getNumFishAlive() {
        return Fish.numFishAlive;
    }
}