package cn.edu.zucc.fresh.model;

public class address {
	public static String[] addressTitle={"地址编号","用户编号","省","市","区","地址","联系人","电话"};
	public String getCell(int col){
		if(col==0) return String.valueOf(Address_id);
		else if(col==1) return String.valueOf(User_id);
		else if(col==2) return Address_province;
		else if(col==3) return Address_city;
		else if(col==4) return Address_area;
		else if(col==5) return Address_location;
		else if(col==6) return Address_person;
		else if(col==7) return Address_telephone_number;
		else return "";
	}
	
	private int Address_id;
	private int User_id;
	private String Address_province;
	private String Address_city;
	private String Address_area;
	private String Address_location;
	private String Address_person;
	private String Address_telephone_number;
	
	public int getAddress_id() {
		return Address_id;
	}
	public void setAddress_id(int address_id) {
		Address_id = address_id;
	}
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	public String getAddress_province() {
		return Address_province;
	}
	public void setAddress_province(String address_province) {
		Address_province = address_province;
	}
	public String getAddress_city() {
		return Address_city;
	}
	public void setAddress_city(String address_city) {
		Address_city = address_city;
	}
	public String getAddress_area() {
		return Address_area;
	}
	public void setAddress_area(String address_area) {
		Address_area = address_area;
	}
	public String getAddress_location() {
		return Address_location;
	}
	public void setAddress_location(String address_location) {
		Address_location = address_location;
	}
	public String getAddress_person() {
		return Address_person;
	}
	public void setAddress_person(String address_person) {
		Address_person = address_person;
	}
	public String getAddress_telephone_number() {
		return Address_telephone_number;
	}
	public void setAddress_telephone_number(String address_telephone_number) {
		Address_telephone_number = address_telephone_number;
	}
	
}
