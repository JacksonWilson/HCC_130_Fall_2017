package labs.lab20;

public class SportsOrganization {
	private double payroll;
	private String sportName;

	public SportsOrganization() {
		payroll = 0.0;
		sportName = "Undefined sport";
	}

	public SportsOrganization(String sportName, double payroll) {
		this.payroll = payroll;
		this.sportName = sportName;
	}

	public void printSportInfo() {
		System.out.println(sportName + " (possibly Cricket)");
	}

	public final String getSportName() {
		return sportName;
	}

	public final double getPayroll() {
		return payroll;
	}
}