package bjtu.edu.weibo.model;

import java.util.List;

public class User {
	private String id;
	private String name;
	private String phone;
	private String sex;
	private int age;
	public List<String> getFans() {
		return fans;
	}
	public void setFans(List<String> fans) {
		this.fans = fans;
	}
	public List<String> getAttention() {
		return attention;
	}
	public void setAttention(List<String> attention) {
		this.attention = attention;
	}
	private String birthday;
	private String location;
	private String email;
	private String qq;
	private String education;
	private String Lastweibo;
	private List<String> fans;
	private List<String> attention;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getLastweibo() {
		return Lastweibo;
	}
	public void setLastweibo(String lastweibo) {
		Lastweibo = lastweibo;
	}
}
