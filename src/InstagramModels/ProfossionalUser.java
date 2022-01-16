package InstagramModels;

public class ProfossionalUser extends User{
	
	private String businessType;
	private String businessName;
	private AccountStatistics statistics;

	public ProfossionalUser() {
		super();
	}
	
	public ProfossionalUser(long id, String username, String email, String password, Post[] posts, String description,
			String[] images, String profilPhoto, String businessType, String businessName, AccountStatistics statistics) {
		super(id,username,email,password,posts,description,images,profilPhoto);
		this.businessType = businessType;
		this.businessName = businessName;
		this.statistics = statistics;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public AccountStatistics getStatistics() {
		return statistics;
	}

	public void setStatistics(AccountStatistics statistics) {
		this.statistics = statistics;
	}

}
