package bjtu.edu.weibo.service;

import java.util.List;

import bjtu.edu.weibo.model.Picture;
import bjtu.edu.weibo.model.User;

public interface UserSendPictureServie {
	public List<Picture> UserSendPicture(User user);
}
