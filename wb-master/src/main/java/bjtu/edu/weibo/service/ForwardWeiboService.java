package bjtu.edu.weibo.service;

import java.util.List;

import bjtu.edu.weibo.model.User;
import bjtu.edu.weibo.model.Weibo;

public interface ForwardWeiboService {
	public int	getForwardNumber(Weibo weibo) ;//��ȡת������
	public List<User>	getForwardList(Weibo weibo); //ת���б�
	public boolean	forwardWeiboAction(Weibo weibo,User user);//ת������
}
