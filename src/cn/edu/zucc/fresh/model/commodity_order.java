package cn.edu.zucc.fresh.model;
import java.util.Date;

public class commodity_order {
	public static String[] commodity_orderTitle={"订单编号","地址编号","用户编号","原始金额","结算金额","要求送达时间","订单状态"};
	public String getCell(int col){
		if(col==0) return String.valueOf(Commodity_order_id);
		else if(col==1) return String.valueOf(Address_id);
		else if(col==2) return String.valueOf(User_id);
		else if(col==3) return String.valueOf(Commodity_order_original_amount);
		else if(col==4) return String.valueOf(Commodity_order_settlement_amount);
		else if(col==5) return String.valueOf(Commodity_order_required_time);
		else if(col==6) return Commodity_order_order_status;
		else return "";
	}
	
	private int Commodity_order_id;
	private int Address_id;
	private int User_id;
	private float Commodity_order_original_amount;
	private float Commodity_order_settlement_amount;
	private Date Commodity_order_required_time;
	private String Commodity_order_order_status;
	
	public int getCommodity_order_id() {
		return Commodity_order_id;
	}
	public void setCommodity_order_id(int commodity_order_id) {
		Commodity_order_id = commodity_order_id;
	}
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
	public float getCommodity_order_original_amount() {
		return Commodity_order_original_amount;
	}
	public void setCommodity_order_original_amount(float commodity_order_original_amount) {
		Commodity_order_original_amount = commodity_order_original_amount;
	}
	public float getCommodity_order_settlement_amount() {
		return Commodity_order_settlement_amount;
	}
	public void setCommodity_order_settlement_amount(float commodity_order_settlement_amount) {
		Commodity_order_settlement_amount = commodity_order_settlement_amount;
	}
	public Date getCommodity_order_required_time() {
		return Commodity_order_required_time;
	}
	public void setCommodity_order_required_time(Date commodity_order_required_time) {
		Commodity_order_required_time = commodity_order_required_time;
	}
	public String getCommodity_order_order_status() {
		return Commodity_order_order_status;
	}
	public void setCommodity_order_order_status(String commodity_order_order_status) {
		Commodity_order_order_status = commodity_order_order_status;
	}
	
}
