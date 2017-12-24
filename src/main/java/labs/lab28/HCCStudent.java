package labs.lab28;

public class HCCStudent {
	private double gpa;
	private long numberOfCredits;
	private String name;

	public HCCStudent() {
		gpa = 0;
		numberOfCredits = 0;
		name = "";
	}

	public HCCStudent(double gpa, long numberOfCredits, String name) {
		this.gpa = gpa;
		this.numberOfCredits = numberOfCredits;
		this.name = name;
	}

	public void setGPA(double gpa) {
		this.gpa = gpa;
	}

	public void setNumberOfCredits(long numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}

	public void printData() {
		System.out.println("Student:\t" + name);
		System.out.println("GPA:\t\t" + gpa);
		System.out.println("Total Credits:\t" + numberOfCredits);
		System.out.println();
	}
}