package labs.lab7;

public class LogicLabPartI {
	public static final void main(String[] args) {
		boolean a = true;
		boolean b = true;
		boolean c = false;
		boolean d = false;

		//AND truth table
		System.out.println("    AND    \t|\tResult");
		System.out.println("------------------------------");
		System.out.println(a + "  " + b + "\t|\t" + (a && b));
		System.out.println(a + "  " + c + "\t|\t" + (a && c));
		System.out.println(c + "  " + b + "\t|\t" + (c && b));
		System.out.println(c + "  " + d + "\t|\t" + (c && d));


		//OR truth table
		System.out.println("    OR    \t|\tResult");
		System.out.println("------------------------------");
		System.out.println(a + "  " + b + "\t|\t" + (a || b));
		System.out.println(a + "  " + c + "\t|\t" + (a || c));
		System.out.println(c + "  " + b + "\t|\t" + (c || b));
		System.out.println(c + "  " + d + "\t|\t" + (c || d));
	}
}