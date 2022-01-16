package InstagramModels;

public class AccountStatistics {
	private User[] accesedAccounts;
	private int followersNumbers;
	
	public AccountStatistics() {
		super();
	}
	
	public AccountStatistics(User[] accesedAccounts, int followers) {
		super();
		this.accesedAccounts = accesedAccounts;
		this.followersNumbers = followers;
	}

	public User[] getAccesedAccounts() {
		return accesedAccounts;
	}

	public void setAccesedAccounts(User[] accesedAccounts) {
		this.accesedAccounts = accesedAccounts;
	}

	public int getFollowers() {
		return followersNumbers;
	}

	public void setFollowers(int followers) {
		this.followersNumbers = followers;
	}

	
	
}
