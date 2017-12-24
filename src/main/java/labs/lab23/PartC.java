package labs.lab23;

/*
 * Name: Jackson Wilson
 *
 * Date: 12/23/17
 *
 * Assignment Number: 23
 *
 * Instructor: Todd Simeone
 */
class PartC {
	public static void main(String [] args) {
		long loopControl = 100;
	
		do {
			if (loopControl % 3 == 0)
				System.out.println(loopControl);
			
			loopControl--;
		} while (loopControl >= 1);
	}
}