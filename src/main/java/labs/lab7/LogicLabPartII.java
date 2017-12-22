package labs.lab7;

import java.util.*;

public class LogicLabPartII {
	private static Random random = new Random();

	public static final void main(String[] args) {
		boolean a = true;
		boolean b = true;
		boolean c = false;
		boolean d = false;

		//Lab Part II
		boolean randomValue = getARandomBoolean();
		//question 1
		boolean answer = (c && randomValue) && (!c) || a; // TRUE, c is false so short-circuting occurred
		System.out.println("(" + c + " && " + randomValue + ") && (!" + c + ") || " + a + " = " + answer);
		//question 2
		answer = (c && randomValue) && ((!c) || a); // FALSE, c is false so short-circuting occurred
		System.out.println("(" + c + " && " + randomValue + ") && ((!" + c + ") || " + a + ") = " + answer);
		//question 3
		answer = c && randomValue && !c || a; // TRUE, c is false so short-circuting occurred
		System.out.println(c + " && " + randomValue + " && !" + c + " || " + a + " = " + answer);
		//question 4
		answer = (c && randomValue) && !(c || a); // FALSE, c is false so short-circuting occurred
		System.out.println("(" + c + " && " + randomValue + ") && !(" + c + " || " + a + ") = " + answer);
	}

	public static boolean getARandomBoolean() {
		return random.nextInt() % 2 == 0;
	}
}