package labs.lab21;

import java.io.IOException;

abstract public class Student {
	StudentCourseInfo sci1;
	StudentCourseInfo sci2;
	StudentCourseInfo sci3;

	private String lastName;
	private String id;
	private String major;
	private boolean onProbation;

	public Student () {
		sci1 = new StudentCourseInfo ();
		sci2 = new StudentCourseInfo ();
		sci3 = new StudentCourseInfo ();

		lastName = "Unknown";
		id = "Unknown";
		major = "Undeclared";
		onProbation = false;
	}

	public Student (String ln, String id, String m) throws IOException {
			System.out.println();
			System.out.println("Enter courses taken by student");
			System.out.println("-------------------");
			this.sci1 = requestCourseInfo ();
			this.sci2 = requestCourseInfo ();
			this.sci3 = requestCourseInfo ();

			this.lastName = ln;
			this.id = id;
			this.major = m;
			this.onProbation = determineProbationaryStatus();
	}

	abstract public boolean determineProbationaryStatus ();

	private StudentCourseInfo requestCourseInfo () throws IOException {
		String prefix = Driver.keyReader.readLine("Enter course prefix:  ");
		String number = Driver.keyReader.readLine("Enter course number:  ");
		int grade = Driver.keyReader.readInt("Enter student grade:  ");
		int credits = Driver.keyReader.readInt("Enter course credits:  ");

		return new StudentCourseInfo(prefix, number, grade, credits);
	}

	public double getGPA () {
		return ((sci1.getGrade() * sci1.getCredits()) + (sci2.getGrade() * sci2.getCredits()) + (sci3.getGrade() * sci3.getCredits())) / (double)(sci1.getCredits() + sci2.getCredits() + sci3.getCredits());
	}

	public boolean getOnProbation () {
		return onProbation;
	}

	public void printStudentInfo () {
		System.out.println("Student Information");
		System.out.println("-------------------");
		System.out.println("Name:       " + lastName);
		System.out.println("ID Number:  " + id);
		System.out.println("Major:      " + major);

		System.out.println("GPA:  " + getGPA());

		if (getOnProbation())
			System.out.println("Student is currently on probation");
		else
			System.out.println("Student is not currently on probation");
	}
}