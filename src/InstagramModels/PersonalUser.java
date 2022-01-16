package InstagramModels;

public class PersonalUser extends User{
	
	private String name;

	public PersonalUser() {
		super();
	}

	public PersonalUser(long id, String username, String email, String password, Post[] posts, String description,
			String[] images, String profilPhoto, String name) {
		super(id,username,email,password,posts,description,images,profilPhoto);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
