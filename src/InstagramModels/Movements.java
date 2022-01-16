package InstagramModels;

import java.sql.Time;

public class Movements {
	private int id;
	private User[] users;
	private String Content;
	private Time time;
	
	public Movements() {
		super();
	}

	public Movements(int id, User[] users, String content, Time time) {
		super();
		this.id = id;
		this.users = users;
		Content = content;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User[] getUsers() {
		return users;
	}

	public void setUsers(User[] users) {
		this.users = users;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
	
	
}
