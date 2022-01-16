package InstagramModels;

import java.sql.Date;

public class Message {
	private int id;
	private String content;
	private User receiver;
	private User sender;
	private Date date;
	
	public Message() {
		super();
	}

	public Message(int id, String content, User receiver, User sender, Date date) {
		super();
		this.id = id;
		this.content = content;
		this.receiver = receiver;
		this.sender = sender;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
