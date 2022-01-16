package InstagramModels;

public class Comment {
	private int id;
	private User user;
	private String content;
	private int likeNumbers;
	
	public Comment() {
		super();
	}

	public Comment(int id, User user, String content, int likeNumbers) {
		super();
		this.id = id;
		this.user = user;
		this.content = content;
		this.likeNumbers = likeNumbers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLikeNumbers() {
		return likeNumbers;
	}

	public void setLikeNumbers(int likeNumbers) {
		this.likeNumbers = likeNumbers;
	}
	
	
	
	
}
