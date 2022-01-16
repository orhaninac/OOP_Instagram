package InstagramModels;

public class Post {
	private int id;
	private User user;	
	private Comment[] comment;
	private int likeNumbers;
	
	public Post() {
		super();
	}

	public Post(int id, User user, Comment[] comment, int likeNumbers) {
		super();
		this.id = id;
		this.user = user;
		this.comment = comment;
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

	public Comment[] getComment() {
		return comment;
	}

	public void setComment(Comment[] comment) {
		this.comment = comment;
	}

	public int getLikeNumbers() {
		return likeNumbers;
	}

	public void setLikeNumbers(int likeNumbers) {
		this.likeNumbers = likeNumbers;
	}
	
}
