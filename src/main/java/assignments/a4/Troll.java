package assignments.a4;

public class Troll extends Monster implements Regeneratable {
    private int hitAttack;
    private int weaponAttack;

    public Troll(int hitPoints, boolean alive, int hitAttack, int weaponAttack) {
        super(hitPoints, alive);
        this.hitAttack = hitAttack;
        this.weaponAttack = weaponAttack;
    }

	@Override
	public int attack() {
        int dmg = 0;
        if (generateRandomNumber(20) > 11)
            dmg += hitAttack;
        if (generateRandomNumber(20) > 10)
            dmg += weaponAttack;
        return dmg;
	}

	@Override
	public void buryMonster() {
		if (generateRandomNumber(2) == 1) {
            regenerate();
        } else {
            alive = false;
        }
    }

	@Override
	public void regenerate() {
        setHitPoints(getMaxPoints() / 2);
        alive = true;
	}
    
    @Override
    public String toString() {
        return super.toString() + " Hit attack: " + hitAttack + " Weapon attack: " + weaponAttack;
    }
}