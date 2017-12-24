package labs.lab20;

public class BaseballOrganization extends SportsOrganization {
    private String city;
    private String mascot;

    public BaseballOrganization() {
        super();
        this.city = "Anywhere";
        this.mascot = "Anything";
    }

    public BaseballOrganization(String sportName, double payroll, String city, String mascot) {
        super(sportName, payroll);
        this.city = city;
        this.mascot = mascot;
    }

    @Override
    public void printSportInfo() {
		System.out.println(getSportName() + " (possibly Cricket) City: " + city + " Mascot: " + mascot);
	}
}