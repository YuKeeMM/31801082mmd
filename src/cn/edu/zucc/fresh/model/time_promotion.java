package cn.edu.zucc.fresh.model;

import java.util.Date;;

public class time_promotion {
	public static String[] recommended_menuTitle={"促销编号","商品编号","促销价格","促销数量","起始日期","结束日期"};
	public String getCell(int col){
		if(col==0) return String.valueOf(Time_promotion_id);
		else if(col==1) return String.valueOf(Commodity_information_id);
		else if(col==2) return String.valueOf(Time_promotion_price);
		else if(col==3) return String.valueOf(Time_promotion_number);
		else if(col==4) return String.valueOf(Time_promotion_start_date);
		else if(col==5) return String.valueOf(Time_promotion_end_date);
		else return "";
	}
	
	private int Time_promotion_id;
	private int Commodity_information_id;
	private float Time_promotion_price;
	private int Time_promotion_number;
	private Date Time_promotion_start_date;
	private Date Time_promotion_end_date;
	
	public int getTime_promotion_id() {
		return Time_promotion_id;
	}
	public void setTime_promotion_id(int time_promotion_id) {
		Time_promotion_id = time_promotion_id;
	}
	public int getCommodity_information_id() {
		return Commodity_information_id;
	}
	public void setCommodity_information_id(int commodity_information_id) {
		Commodity_information_id = commodity_information_id;
	}
	public float getTime_promotion_price() {
		return Time_promotion_price;
	}
	public void setTime_promotion_price(float time_promotion_price) {
		Time_promotion_price = time_promotion_price;
	}
	public int getTime_promotion_number() {
		return Time_promotion_number;
	}
	public void setTime_promotion_number(int time_promotion_number) {
		Time_promotion_number = time_promotion_number;
	}
	public Date getTime_promotion_start_date() {
		return Time_promotion_start_date;
	}
	public void setTime_promotion_start_date(Date time_promotion_start_date) {
		Time_promotion_start_date = time_promotion_start_date;
	}
	public Date getTime_promotion_end_date() {
		return Time_promotion_end_date;
	}
	public void setTime_promotion_end_date(Date time_promotion_end_date) {
		Time_promotion_end_date = time_promotion_end_date;
	}
	
	
}
