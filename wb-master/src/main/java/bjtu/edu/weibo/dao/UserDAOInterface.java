package bjtu.edu.weibo.dao;

import java.util.List;

import bjtu.edu.weibo.model.User;

public interface UserDAOInterface {
	public boolean insertNewUser(User user);
	
	//�����û�״̬
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
	
	
	public List<String> getFans(String id);  //����һ��UserID��List
	public boolean insertFans(String id);
	public boolean deleteFans(String id);
	
	public List<String> getAttention(String id);  //����һ��UserID��List
	public boolean insertAttentions(String id);
	public boolean deleteAttentions(String id);
	
	public List<String> getPircurlOr(String id);  //����һ��PircurlOr��List
	public List<String> getPicurlTh(String id);  //����һ��PicurlTh��List
	public boolean insertPicurl(String id); //ͬʱ����ͼƬ��ԭͼ������
	public boolean deletePicurl(String id); //ͬʱɾ��ͼƬ��ԭͼ������
	
	public List<String> getLikePicurlOr(String id);  //����һ��LikePircurlOr��List
	public List<String> getLikePicurlTh(String id);  //����һ��LikePircurlOr��List
	public boolean insertLikePicurl(String id);  //ͬʱ������޹���ͼƬ��ԭͼ������
	public boolean deleteLikePicurl(String id);  //ͬʱɾ�����޹���ͼƬ��ԭͼ������
	
	public List<String> getForwordWeibo(String id);  //����һ��WeiboID��List
	public boolean insertForwordWeibo(String id);
	public boolean deleteForwordWeibo(String id);
	
	public List<String> getLikeWeibo(String id);  //����һ��WeiboID��List
	public boolean insertLikeWeibo(String id);
	public boolean deleteLikeWeibo(String id);
	
	public List<String> getCommentWeibo(String id);  //����һ��WeiboID��List
	public boolean insertCommentWeibo(String id);
	public boolean deleteCommentWeibo(String id);
	
}
