package labs.lab21;

public class StudentCourseInfo {
	private String prefix;
	private String number;
	private int grade;  //Note - for programming simplicity:  A = 4, B = 3, C = 2, D = 1, F = 0
	private int credits;

	public StudentCourseInfo () {
		prefix = "Unknown";
		number = "Unknown";
		grade = 0;
		credits = 0;
	}

	public StudentCourseInfo (String p, String n, int g, int c) {
		prefix = p;
		number = n;
		grade = g;
		credits = c;
	}

	public String getCourseInfo () {
		return ("Prefix:  " + prefix + "  Number:  " + number + "  Grade:  " + grade + "  Credits:  " + credits);
	}

	public int getGrade () {
		return grade;
	}

	public int getCredits () {
		return credits;
	}
}