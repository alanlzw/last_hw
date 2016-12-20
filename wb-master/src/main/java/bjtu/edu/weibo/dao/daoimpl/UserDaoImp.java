package bjtu.edu.weibo.dao.daoimpl;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.omg.PortableInterceptor.USER_EXCEPTION;

import bjtu.edu.weibo.dao.UserDAOInterface;
import bjtu.edu.weibo.model.User;

public class UserDaoImp implements UserDAOInterface{

	private final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private final String DB_URL="jdbc:oracle:thin:@localhost:1521:orcl";
	private final String USER = "scott";
	private final String pwd="alan";
	private static Connection conn=null;
	private static Statement st;
	
	
	public Connection getConnection()
	{
		try {
			Class.forName(JDBC_DRIVER);
			conn=DriverManager.getConnection(DB_URL,USER,pwd);
		} catch (SQLException |ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("连接数据库失败");
		}
		return conn;
	}
	@Override
	public boolean insertNewUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setState(String id, boolean s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateName(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updatePassword(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLocation(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateLocation(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getBirthday(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateBirthday(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSex(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateSex(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLastTime(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateLastName(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWeiBoNumber(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateWeiBoNumber(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFansNumber(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateFansNumber(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAttentionNumber(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateAttentionNumber(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getFans(String id) {
		// TODO Auto-generated method stub
		List<String> fans=new ArrayList<String>();
		String sql="select fans from User1 where id ="+id;
		conn = getConnection();
		try {
			st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			if(rs.next())
			{
				String str=rs.getString("fans");
				String[] temp=str.split(",");
				for(int i=0;i<temp.length;i++)
				{
					fans.add(temp[i]);
				}
			}
			st.close();
			conn.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return fans;
	}

	@Override
	public boolean insertFans(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteFans(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> getAttention(String id) {
		// TODO Auto-generated method stub
		List<String> atten=new ArrayList<String>();
		String sql="select attention from User1 where id ="+id;
		conn = getConnection();
		try {
			st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			if(rs.next())
			{
				String str=rs.getString("attention");
				String[] temp=str.split(",");
				for(int i=0;i<temp.length;i++)
				{
					atten.add(temp[i]);
				}
			}
			st.close();
			conn.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return atten;
	}

	@Override
	public boolean insertAttentions(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAttentions(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> getPircurlOr(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getPicurlTh(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertPicurl(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePicurl(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> getLikePicurlOr(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getLikePicurlTh(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertLikePicurl(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteLikePicurl(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> getForwordWeibo(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertForwordWeibo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteForwordWeibo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> getLikeWeibo(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertLikeWeibo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteLikeWeibo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> getCommentWeibo(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertCommentWeibo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCommentWeibo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
