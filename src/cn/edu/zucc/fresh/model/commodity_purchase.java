package cn.edu.zucc.fresh.model;

public class commodity_purchase {
	public static String[] commodity_purchaseTitle={"采购编号","员工编号","数量","状态"};
	public String getCell(int col){
		if(col==0) return String.valueOf(Commodity_purchase_id);
		else if(col==1) return String.valueOf(Admin_id);
		else if(col==2) return String.valueOf(Commodity_purchase_number);
		else if(col==3) return Commodity_purchase_status;
		else return "";
	}
	
	private int Commodity_purchase_id;
	private int Admin_id;
	private int Commodity_purchase_number;
	private String Commodity_purchase_status;
	
	public int getCommodity_purchase_id() {
		return Commodity_purchase_id;
	}
	public void setCommodity_purchase_id(int commodity_purchase_id) {
		Commodity_purchase_id = commodity_purchase_id;
	}
	public int getAdmin_id() {
		return Admin_id;
	}
	public void setAdmin_id(int admin_id) {
		Admin_id = admin_id;
	}
	public int getCommodity_purchase_number() {
		return Commodity_purchase_number;
	}
	public void setCommodity_purchase_number(int commodity_purchase_number) {
		Commodity_purchase_number = commodity_purchase_number;
	}
	public String getCommodity_purchase_status() {
		return Commodity_purchase_status;
	}
	public void setCommodity_purchase_status(String commodity_purchase_status) {
		Commodity_purchase_status = commodity_purchase_status;
	}
	
}
