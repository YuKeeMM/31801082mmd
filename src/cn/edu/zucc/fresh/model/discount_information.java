package cn.edu.zucc.fresh.model;

import java.util.Date;

public class discount_information {
	public static String[] discount_informationTitle={"满折编号","内容","适用商品数量","折扣","起始日期","结束日期"};
	public String getCell(int col){
		if(col==0) return String.valueOf(Discount_information_id);
		else if(col==1) return Discount_information_content;
		else if(col==2) return String.valueOf(Discount_information_number);
		else if(col==3) return String.valueOf(Discount_information_discount);
		else if(col==4) return String.valueOf(Discount_information_start_date);
		else if(col==4) return String.valueOf(Discount_information_end_date);
		else return "";
	}
	
	private int Discount_information_id;
	private String Discount_information_content;
	private int Discount_information_number;
	private float Discount_information_discount;
	private Date Discount_information_start_date;
	private Date Discount_information_end_date;
	
	public int getDiscount_information_id() {
		return Discount_information_id;
	}
	public void setDiscount_information_id(int discount_information_id) {
		Discount_information_id = discount_information_id;
	}
	public String getDiscount_information_content() {
		return Discount_information_content;
	}
	public void setDiscount_information_content(String discount_information_content) {
		Discount_information_content = discount_information_content;
	}
	public int getDiscount_information_number() {
		return Discount_information_number;
	}
	public void setDiscount_information_number(int discount_information_number) {
		Discount_information_number = discount_information_number;
	}
	public float getDiscount_information_discount() {
		return Discount_information_discount;
	}
	public void setDiscount_information_discount(float discount_information_discount) {
		Discount_information_discount = discount_information_discount;
	}
	public Date getDiscount_information_start_date() {
		return Discount_information_start_date;
	}
	public void setDiscount_information_start_date(Date discount_information_start_date) {
		Discount_information_start_date = discount_information_start_date;
	}
	public Date getDiscount_information_end_date() {
		return Discount_information_end_date;
	}
	public void setDiscount_information_end_date(Date discount_information_end_date) {
		Discount_information_end_date = discount_information_end_date;
	}
	
	
}
