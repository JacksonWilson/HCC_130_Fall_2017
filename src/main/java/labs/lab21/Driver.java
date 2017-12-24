package labs.lab21;

import java.io.IOException;

import utils.KeyboardReader;

public class Driver {
	public static KeyboardReader keyReader;

	static {
		keyReader = new KeyboardReader(System.in);
	}

	public static void main (String [] args) {
		try {
			char status = Character.toUpperCase(keyReader.readChar("Enter student status (U = Undergraduate, G = Graduate):  ", 'U', 'G', 'u', 'g'));
			String last = keyReader.readLine("Enter last name:  ");
			String id = keyReader.readLine("Enter student id:  ");
			String major = keyReader.readLine("Enter major:  ");
	
			Student s1;
			if (status == 'U') {
				String minor = keyReader.readLine("Enter minor:  ");
				String dorm = keyReader.readLine("Enter dormitory:  ");
	
				s1 = new Undergraduate(last, id, major, minor, dorm);
			}
	
			else {
				System.out.print("Enter major of bachelor's degree:  ");
				String bachelorMajor = keyReader.readLine();
	
				char track = keyReader.readChar("Enter current track:  ");
	
				s1 = new Graduate(last, id, major, bachelorMajor, track);
			}
	
			System.out.println();
			s1.printStudentInfo();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}