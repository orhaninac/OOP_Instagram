package InstagramModels;

public class User {
	
	private long id;
	private String username;
	private String email; 
	private String password;

	private Post[] posts;
	private String description;
	private String[] images;
	private String profilPhoto;
	
	public User() {
		super();
	}

	public User(long id, String username, String email, String password, Post[] posts, String description,
			String[] images, String profilPhoto) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.posts = posts;
		this.description = description;
		this.images = images;
		this.profilPhoto = profilPhoto;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Post[] getPosts() {
		return posts;
	}

	public void setPosts(Post[] posts) {
		this.posts = posts;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

	public String getProfilPhoto() {
		return profilPhoto;
	}

	public void setProfilPhoto(String profilPhoto) {
		this.profilPhoto = profilPhoto;
	}
	
}
