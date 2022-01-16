package InstagramModels;

import java.sql.Date;

public class Story {
	private int id;
	private User owner;
	private Date date;
	private String content;
	private User[] followersWhoSee;
	
	public Story() {
		super();
	}

	public Story(int id, User owner, Date date, String content, User[] followersWhoSee) {
		super();
		this.id = id;
		this.owner = owner;
		this.date = date;
		this.content = content;
		this.followersWhoSee = followersWhoSee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User[] getFollowersWhoSee() {
		return followersWhoSee;
	}

	public void setFollowersWhoSee(User[] followersWhoSee) {
		this.followersWhoSee = followersWhoSee;
	}
	
}
