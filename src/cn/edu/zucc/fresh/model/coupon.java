package cn.edu.zucc.fresh.model;

import java.util.Date;

public class coupon {
	public static String[] couponTitle={"优惠券编号","订单编号","内容","适用金额","减免金额","起始日期","结束日期"};
	public String getCell(int col){
		if(col==0) return String.valueOf(Coupon_id);
		else if(col==1) return String.valueOf(Commodity_order_id);
		else if(col==2) return Coupon_content;
		else if(col==3) return String.valueOf(Coupon_applicable_amount);
		else if(col==4) return String.valueOf(Coupon_deduction_amount);
		else if(col==5) return String.valueOf(Coupon_start_date);
		else if(col==6) return String.valueOf(Coupon_end_date);
		else return "";
	}
	
	private int Coupon_id;
	private int Commodity_order_id;
	private String Coupon_content;
	private float Coupon_applicable_amount;
	private float Coupon_deduction_amount;
	private Date Coupon_start_date;
	private Date Coupon_end_date;
	
	public int getCoupon_id() {
		return Coupon_id;
	}
	public void setCoupon_id(int coupon_id) {
		Coupon_id = coupon_id;
	}
	public int getCommodity_order_id() {
		return Commodity_order_id;
	}
	public void setCommodity_order_id(int commodity_order_id) {
		Commodity_order_id = commodity_order_id;
	}
	public String getCoupon_content() {
		return Coupon_content;
	}
	public void setCoupon_content(String coupon_content) {
		Coupon_content = coupon_content;
	}
	public float getCoupon_applicable_amount() {
		return Coupon_applicable_amount;
	}
	public void setCoupon_applicable_amount(float coupon_applicable_amount) {
		Coupon_applicable_amount = coupon_applicable_amount;
	}
	public float getCoupon_deduction_amount() {
		return Coupon_deduction_amount;
	}
	public void setCoupon_deduction_amount(float coupon_deduction_amount) {
		Coupon_deduction_amount = coupon_deduction_amount;
	}
	public Date getCoupon_start_date() {
		return Coupon_start_date;
	}
	public void setCoupon_start_date(Date coupon_start_date) {
		Coupon_start_date = coupon_start_date;
	}
	public Date getCoupon_end_date() {
		return Coupon_end_date;
	}
	public void setCoupon_end_date(Date coupon_end_date) {
		Coupon_end_date = coupon_end_date;
	}
	
}
