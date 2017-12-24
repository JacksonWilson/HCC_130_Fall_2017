package labs.lab20;

public class FootballOrganization extends SportsOrganization {
    private int teamRank;
    private int numInjuries;

    public FootballOrganization() {
        super();
        this.teamRank = -1;
        this.numInjuries = 0;
    }

    public FootballOrganization(String sportName, double payroll, int teamRank, int numInjuries) {
        super(sportName, payroll);
        this.teamRank = teamRank;
        this.numInjuries = numInjuries;
    }
    
    @Override
    public void printSportInfo() {
		System.out.println(getSportName() + " (possibly Cricket) Payroll: " + getPayroll() + " Team Rank: " + teamRank + " Number of Injuries: " + numInjuries);
	}
}