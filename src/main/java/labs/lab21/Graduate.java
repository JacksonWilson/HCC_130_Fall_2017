package labs.lab21;

import java.io.IOException;

public class Graduate extends Student {
    private String bdMajor;
    private char currentTrack;

    public Graduate() {
        super();
        this.bdMajor = "Unknown";
        this.currentTrack = 'U';
    }

    public Graduate(String ln, String id, String major, String bdMajor, char currentTrack) throws IOException {
        super(ln, id, major);
        this.bdMajor = bdMajor;
        this.currentTrack = currentTrack;
    }

	@Override
	public boolean determineProbationaryStatus() {
        return getGPA() < 2.0;
    }
    
    @Override
    public void printStudentInfo() {
        super.printStudentInfo();
		System.out.println("Bachelor\'s Major:      " + bdMajor);
		System.out.println("Track:      " + currentTrack);
    }
}