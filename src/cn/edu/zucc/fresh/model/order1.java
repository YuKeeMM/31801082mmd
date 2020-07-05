package cn.edu.zucc.fresh.model;

public class order1 {
	public static String[] order1Title={"商品编号","订单编号","满折编号","数量","价格","折扣"};
	public String getCell(int col){
		if(col==0) return String.valueOf(Commodity_information_id);
		else if(col==1) return String.valueOf(Commodity_order_id);
		else if(col==2) return String.valueOf(Discount_information_id);
		else if(col==3) return String.valueOf(Order1_number);
		else if(col==4) return String.valueOf(Order1_price);
		else if(col==5) return String.valueOf(Order1_discount);
		else return "";
	}
	
	private int Commodity_information_id;
	private int Commodity_order_id;
	private int Discount_information_id;
	private int Order1_number;
	private float Order1_price;
	private float Order1_discount;
	
	public int getCommodity_information_id() {
		return Commodity_information_id;
	}
	public void setCommodity_information_id(int commodity_information_id) {
		Commodity_information_id = commodity_information_id;
	}
	public int getCommodity_order_id() {
		return Commodity_order_id;
	}
	public void setCommodity_order_id(int commodity_order_id) {
		Commodity_order_id = commodity_order_id;
	}
	public int getDiscount_information_id() {
		return Discount_information_id;
	}
	public void setDiscount_information_id(int discount_information_id) {
		Discount_information_id = discount_information_id;
	}
	public int getOrder1_number() {
		return Order1_number;
	}
	public void setOrder1_number(int order1_number) {
		Order1_number = order1_number;
	}
	public float getOrder1_price() {
		return Order1_price;
	}
	public void setOrder1_price(float order1_price) {
		Order1_price = order1_price;
	}
	public float getOrder1_discount() {
		return Order1_discount;
	}
	public void setOrder1_discount(float order1_discount) {
		Order1_discount = order1_discount;
	}
	
	
}
