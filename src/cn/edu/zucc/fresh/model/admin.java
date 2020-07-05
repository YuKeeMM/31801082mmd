package cn.edu.zucc.fresh.model;

public class admin {
	public static String[] adminTitle={"员工编号","员工姓名","登录密码"};
	public String getCell(int col){
		if(col==0) return String.valueOf(Admin_id);
		else if(col==1) return Admin_name;
		else if(col==2) return Admin_password;
		else return "";
	}
	
	private int Admin_id;
	private String Admin_name;
	private String Admin_password;
	public int getAdmin_id() {
		return Admin_id;
	}
	public void setAdmin_id(int admin_id) {
		Admin_id = admin_id;
	}
	public String getAdmin_name() {
		return Admin_name;
	}
	public void setAdmin_name(String admin_name) {
		Admin_name = admin_name;
	}
	public String getAdmin_password() {
		return Admin_password;
	}
	public void setAdmin_password(String admin_password) {
		Admin_password = admin_password;
	}
	
}
