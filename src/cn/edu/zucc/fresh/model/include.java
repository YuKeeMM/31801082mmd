package cn.edu.zucc.fresh.model;

public class include {
	public static String[] includeTitle={"采购单编号","商品编号"};
	public String getCell(int col){
		if(col==0) return String.valueOf(Commodity_purchase_id);
		else if(col==1) return String.valueOf(Commodity_information_id);
		else return "";
	}
	
	private int Commodity_purchase_id;
	private int Commodity_information_id;
	
	public int getCommodity_purchase_id() {
		return Commodity_purchase_id;
	}
	public void setCommodity_purchase_id(int commodity_purchase_id) {
		Commodity_purchase_id = commodity_purchase_id;
	}
	public int getCommodity_information_id() {
		return Commodity_information_id;
	}
	public void setCommodity_information_id(int commodity_information_id) {
		Commodity_information_id = commodity_information_id;
	}
	
}
