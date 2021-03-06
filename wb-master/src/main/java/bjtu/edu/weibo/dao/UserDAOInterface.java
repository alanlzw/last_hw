package bjtu.edu.weibo.dao;

import java.util.List;

import bjtu.edu.weibo.model.User;

public interface UserDAOInterface {
	public boolean insertNewUser(User user);
	
	//设置用户状态
	public boolean setState(String id, boolean s);
	
	public String getName(String id);
	public String updateName(String id);
	
	public String getPassword(String id);
	public String updatePassword(String id);
	
	public String getLocation(String id);
	public String updateLocation(String id);
	
	public String getBirthday(String id);
	public String updateBirthday(String id);
	
	public String getSex(String id);
	public String updateSex(String id);
	
	public String getLastTime(String id);
	public String updateLastName(String id);
	
	public String getWeiBoNumber(String id);
	public String updateWeiBoNumber(String id);
	
	public String getFansNumber(String id);
	public String updateFansNumber(String id);
	
	public String getAttentionNumber(String id);
	public String updateAttentionNumber(String id);
	
	
	public List<String> getFans(String id);  //返回一个UserID的List
	public boolean insertFans(String id);
	public boolean deleteFans(String id);
	
	public List<String> getAttention(String id);  //返回一个UserID的List
	public boolean insertAttentions(String id);
	public boolean deleteAttentions(String id);
	
	public List<String> getPircurlOr(String id);  //返回一个PircurlOr的List
	public List<String> getPicurlTh(String id);  //返回一个PicurlTh的List
	public boolean insertPicurl(String id); //同时插入图片的原图和缩略
	public boolean deletePicurl(String id); //同时删除图片的原图和缩略
	
	public List<String> getLikePicurlOr(String id);  //返回一个LikePircurlOr的List
	public List<String> getLikePicurlTh(String id);  //返回一个LikePircurlOr的List
	public boolean insertLikePicurl(String id);  //同时插入点赞过的图片的原图和缩略
	public boolean deleteLikePicurl(String id);  //同时删除点赞过的图片的原图和缩略
	
	public List<String> getForwordWeibo(String id);  //返回一个WeiboID的List
	public boolean insertForwordWeibo(String id);
	public boolean deleteForwordWeibo(String id);
	
	public List<String> getLikeWeibo(String id);  //返回一个WeiboID的List
	public boolean insertLikeWeibo(String id);
	public boolean deleteLikeWeibo(String id);
	
	public List<String> getCommentWeibo(String id);  //返回一个WeiboID的List
	public boolean insertCommentWeibo(String id);
	public boolean deleteCommentWeibo(String id);
	
}
