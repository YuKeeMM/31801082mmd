package cn.edu.zucc.fresh.model;

public class commodity_information {
	public static String[] commodity_informationTitle={"商品编号","类别编号","商品名称","价格","会员价","数量","规格","详情"};
	public String getCell(int col){
		if(col==0) return String.valueOf(Commodity_information_id);
		else if(col==1) return String.valueOf(Fresh_id);
		else if(col==2) return Commodity_information_name;
		else if(col==3) return String.valueOf(Commodity_information_price);
		else if(col==4) return String.valueOf(Commodity_information_vip_price);
		else if(col==5) return String.valueOf(Commodity_information_number);
		else if(col==6) return Commodity_information_specification;
		else if(col==7) return Commodity_information_details;
		else return "";
	}
	
	private int Commodity_information_id;
	private int Fresh_id;
	private String Commodity_information_name;
	private float Commodity_information_price;
	private float Commodity_information_vip_price;
	private int Commodity_information_number;
	private String Commodity_information_specification;
	private String Commodity_information_details;
	
	public int getCommodity_information_id() {
		return Commodity_information_id;
	}
	public void setCommodity_information_id(int commodity_information_id) {
		Commodity_information_id = commodity_information_id;
	}
	public int getFresh_id() {
		return Fresh_id;
	}
	public void setFresh_id(int fresh_id) {
		Fresh_id = fresh_id;
	}
	public String getCommodity_information_name() {
		return Commodity_information_name;
	}
	public void setCommodity_information_name(String commodity_information_name) {
		Commodity_information_name = commodity_information_name;
	}
	public float getCommodity_information_price() {
		return Commodity_information_price;
	}
	public void setCommodity_information_price(float commodity_information_price) {
		Commodity_information_price = commodity_information_price;
	}
	public float getCommodity_information_vip_price() {
		return Commodity_information_vip_price;
	}
	public void setCommodity_information_vip_price(float commodity_information_vip_price) {
		Commodity_information_vip_price = commodity_information_vip_price;
	}
	public int getCommodity_information_number() {
		return Commodity_information_number;
	}
	public void setCommodity_information_number(int commodity_information_number) {
		Commodity_information_number = commodity_information_number;
	}
	public String getCommodity_information_specification() {
		return Commodity_information_specification;
	}
	public void setCommodity_information_specification(String commodity_information_specification) {
		Commodity_information_specification = commodity_information_specification;
	}
	public String getCommodity_information_details() {
		return Commodity_information_details;
	}
	public void setCommodity_information_details(String commodity_information_details) {
		Commodity_information_details = commodity_information_details;
	}
	
}
