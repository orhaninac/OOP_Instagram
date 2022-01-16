package InstagramModels;

public class PhotoPost extends Post{
	
	private String image;

	public PhotoPost() {
		super();
	}

	public PhotoPost(int id, User user, Comment[] comment, int likeNumbers, String image) {
		super(id,user,comment,likeNumbers);
		this.image = image;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
}
