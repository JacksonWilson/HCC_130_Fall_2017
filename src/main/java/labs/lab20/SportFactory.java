package labs.lab20;

public class SportFactory {
	public static final SportsOrganization createSportsOrganization() {
		return new BaseballOrganization();
	}
}