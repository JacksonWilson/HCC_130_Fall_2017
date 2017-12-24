package assignments.a4;

import java.util.Random;

public abstract class Monster {
	private int maxPoints;
	private int hitPoints;
    boolean alive;
    
    public Monster(int hitPoints, boolean alive) {
        this.hitPoints = this.maxPoints = hitPoints;
        this.alive = alive;
    }

	public static int generateRandomNumber(int n) {
		//Returns a random number between 1 and n inclusive
		return (new Random()).nextInt(n) + 1;
	}

	public void takeHit(int damage) {
		if (damage > hitPoints) {
			hitPoints = 0;
			buryMonster();
		}
		else
			hitPoints -= damage;
    }
    
    public int getMaxPoints() {
        return maxPoints;
    }
    
    public void setMaxPoints(int maxPoints) {
        this.maxPoints = maxPoints;
    }
    
    public int getHitPoints() {
        return hitPoints;
    }
    
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
    
    public boolean isAlive() {
        return alive;
    }
    
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public abstract int attack();
	public abstract void buryMonster();

    @Override
	public String toString () {
		return " Max points: " + maxPoints + " Hit points " + hitPoints;
	}
}