package InstagramModels;

public class VideoPost extends Post{
	private String video;
	private int numberOfPlay;
	
	public VideoPost() {
		super();
	}

	public VideoPost(int id, User user, Comment[] comment, int likeNumbers, String video, int numberOfPlay) {
		super(id,user,comment,likeNumbers);
		this.video = video;
		this.numberOfPlay = numberOfPlay;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public int getNumberOfPlay() {
		return numberOfPlay;
	}

	public void setNumberOfPlay(int numberOfPlay) {
		this.numberOfPlay = numberOfPlay;
	}
	
}
