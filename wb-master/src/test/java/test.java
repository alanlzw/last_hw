import java.util.ArrayList;
import java.util.List;

import bjtu.edu.weibo.dao.UserDAOInterface;
import bjtu.edu.weibo.dao.daoimpl.UserDaoImp;
import bjtu.edu.weibo.model.User;
import bjtu.edu.weibo.service.RelationService;
import bjtu.edu.weibo.service.serviceImpl.RelationServiceImp;

public class test {

	public static void main(String[] args)
	{
		User user1 =new User();
		user1.setId("0");
		User user2 = new User();
		user2.setId("6");
		RelationService service = new RelationServiceImp();
		System.out.println(service.followAction(user1, user2));
		System.out.println(service.unfollowAction(user1, user2));
		System.out.println(service.deletefansAction(user1, user2));
	}
}
