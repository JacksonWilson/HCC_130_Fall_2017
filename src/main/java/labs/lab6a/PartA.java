package labs.lab6a;

/*
Name of class: PartA (it is using the naming rules and naming conventions)
Name of variable: letterVariable (it is using the naming rules and naming conventions although it is not very descriptive)
Expected output: A\n65
System.out.println((int)letterVariable) casts the char to its ASCII number and prints that
*/
public class PartA {
	public static void main(String args[]) {
		char letterVariable = 0;

		letterVariable = 'A';
		System.out.println(letterVariable);
		System.out.println((int)letterVariable);
	}
}
