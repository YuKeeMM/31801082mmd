package cn.edu.zucc.fresh.model;

import java.util.Date;
public class user {
	public static String[] recommended_menuTitle={"用户编号","姓名","性别","密码","手机号码","邮箱","所在城市","注册时间","是否会员","会员截止日期"};
	public String getCell(int col){
		if(col==0) return String.valueOf(User_id);
		else if(col==1) return User_name;
		else if(col==2) return User_gender;
		else if(col==3) return User_password;
		else if(col==4) return User_phone_number;
		else if(col==5) return User_email_address;
		else if(col==6) return User_city;
		else if(col==7) return String.valueOf(User_registration_time);
		else if(col==8) return String.valueOf(User_vip);
		else if(col==9) return String.valueOf(User_vip_deadline);
		else return "";
	}
	
	private int User_id;
	private String User_name;
	private String User_gender;
	private String User_password;
	private String User_phone_number;
	private String User_email_address;
	private String User_city;
	private Date User_registration_time;
	private Boolean User_vip;
	private Date User_vip_deadline;
	
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	public String getUser_name() {
		return User_name;
	}
	public void setUser_name(String user_name) {
		User_name = user_name;
	}
	public String getUser_gender() {
		return User_gender;
	}
	public void setUser_gender(String user_gender) {
		User_gender = user_gender;
	}
	public String getUser_password() {
		return User_password;
	}
	public void setUser_password(String user_password) {
		User_password = user_password;
	}
	public String getUser_phone_number() {
		return User_phone_number;
	}
	public void setUser_phone_number(String user_phone_number) {
		User_phone_number = user_phone_number;
	}
	public String getUser_email_address() {
		return User_email_address;
	}
	public void setUser_email_address(String user_email_address) {
		User_email_address = user_email_address;
	}
	public String getUser_city() {
		return User_city;
	}
	public void setUser_city(String user_city) {
		User_city = user_city;
	}
	public Date getUser_registration_time() {
		return User_registration_time;
	}
	public void setUser_registration_time(Date user_registration_time) {
		User_registration_time = user_registration_time;
	}
	public Boolean getUser_vip() {
		return User_vip;
	}
	public void setUser_vip(Boolean user_vip) {
		User_vip = user_vip;
	}
	public Date getUser_vip_deadline() {
		return User_vip_deadline;
	}
	public void setUser_vip_deadline(Date user_vip_deadline) {
		User_vip_deadline = user_vip_deadline;
	}
	
}
