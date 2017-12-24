package labs.lab22;

/*
 * Name: Jackson Wilson
 *
 * Date: 12/23/17
 *
 * Assignment Number: 22
 *
 * Instructor: Todd Simeone
 */

public class Calendar {
	long year;
	boolean isLeapYear;

	Calendar(long y) {
		year = y;

		if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))
			isLeapYear = true;
		else
			isLeapYear = false;
	}
}
