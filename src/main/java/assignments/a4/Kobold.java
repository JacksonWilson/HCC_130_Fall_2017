package assignments.a4;

public class Kobold extends Monster {
    private int biteAttack;
    private int clawAttack;

    public Kobold(int hitPoints, boolean alive, int biteAttack, int clawAttack) {
        super(hitPoints, alive);
        this.biteAttack = biteAttack > 3 ? 3 : biteAttack;
        this.clawAttack = clawAttack > 4 ? 4 : clawAttack;
    }

	@Override
	public int attack() {
        int dmg = 0;
        if (generateRandomNumber(20) > 15)
            dmg += biteAttack;
        if (generateRandomNumber(20) > 12)
            dmg += clawAttack;
        return dmg;
    }
    
	@Override
	public void buryMonster() {
		alive = false;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Bite attack: " + biteAttack + " Claw attack: " + clawAttack;
    }
}