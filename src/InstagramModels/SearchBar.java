package InstagramModels;

public class SearchBar {
	
	private String searchIcon;
	private String searchText;
	private User[] recentlySearched;
	
	public SearchBar() {
		super();
	}

	public SearchBar(String searchIcon, String searchText, User[] recentlySearched) {
		super();
		this.searchIcon = searchIcon;
		this.searchText = searchText;
		this.recentlySearched = recentlySearched;
	}

	public String getSearchIcon() {
		return searchIcon;
	}

	public void setSearchIcon(String searchIcon) {
		this.searchIcon = searchIcon;
	}

	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}

	public User[] getRecentlySearched() {
		return recentlySearched;
	}

	public void setRecentlySearched(User[] recentlySearched) {
		this.recentlySearched = recentlySearched;
	}
	
}
