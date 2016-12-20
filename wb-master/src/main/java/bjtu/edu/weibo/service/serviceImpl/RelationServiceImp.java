package bjtu.edu.weibo.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import bjtu.edu.weibo.dao.UserDAOInterface;
import bjtu.edu.weibo.dao.daoimpl.UserDaoImp;
import bjtu.edu.weibo.model.User;
import bjtu.edu.weibo.service.RelationService;

public class RelationServiceImp implements RelationService{

	@Override
	public boolean followAction(User user1, User user2) {
		// TODO Auto-generated method stub
		UserDAOInterface userDao = new UserDaoImp();
		List<String> attention = new ArrayList<String>();
		attention=userDao.getAttention(user1.getId());
		for(String str:attention)
		{
			if(str.equals(user2.getId()))
			{
				return true;
				
			}
		}
		return false;
	}

	@Override
	public boolean unfollowAction(User user1, User user2) {
		// TODO Auto-generated method stub
		UserDAOInterface userDao=new UserDaoImp();
		List<String> attention = new ArrayList<String>();
		attention=userDao.getAttention(user1.getId());
		for(String str:attention)
		{
			if(str.equals(user2.getId()))
			{
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean deletefansAction(User user1, User user2) {
		// TODO Auto-generated method stub
		UserDAOInterface userDao=new UserDaoImp();
		List<String> fans = new ArrayList<String>();
		fans=userDao.getFans(user1.getId());
		for(String str:fans)
		{
			if(str.equals(user2.getId()))
			{
				return false;
			}
		}
		return true;
	}

}
