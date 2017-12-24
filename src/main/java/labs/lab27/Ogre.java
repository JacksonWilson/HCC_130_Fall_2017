package labs.lab27;

public class Ogre {
	private int bonesCrushed;
	private int peopleEaten;
	private String ugliness;

	public Ogre (int bc, int pe, String u) {
		bonesCrushed = bc;
		peopleEaten = pe;

		if (u.equals("Beastly") || u.equals("Hideous") || u.equals("Repugnant"))
			ugliness = u;
		else
			ugliness = "Ugly";
	}

	public void crushPerson() {
		bonesCrushed += 206;
	}

	public void eatPerson() {
		bonesCrushed += 206;
		peopleEaten++;
	}

	@Override
	public String toString () {
		return "Bones crushed:  " + bonesCrushed + "\nPeople eaten:  " + peopleEaten + "\nAnd I am " + ugliness + "!";
	}
}
