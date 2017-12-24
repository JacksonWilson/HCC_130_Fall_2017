package labs.lab21;

import java.io.IOException;

public class Undergraduate extends Student {
    private String minor;
    private String dorm;

    public Undergraduate() {
        super();
        this.minor = "Undeclared";
        this.dorm = "Unknown";
    }

    public Undergraduate(String ln, String id, String major, String minor, String dorm) throws IOException {
        super(ln, id, major);
        this.minor = minor;
        this.dorm = dorm;
    }

	@Override
	public boolean determineProbationaryStatus() {
        return getGPA() < 1.5;
    }
    
    @Override
    public void printStudentInfo() {
        super.printStudentInfo();
		System.out.println("Minor:      " + minor);
		System.out.println("Dorm:      " + dorm);
    }
}