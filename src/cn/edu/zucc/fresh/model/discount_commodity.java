package cn.edu.zucc.fresh.model;

public class discount_commodity {
	public static String[] discount_commodityTitle={"¬˙’€±‡∫≈","…Ã∆∑±‡∫≈"};
	public String getCell(int col){
		if(col==0) return String.valueOf(Discount_information_id);
		else if(col==1) return String.valueOf(Commodity_information_id);
		else return "";
	}
	
	private int Commodity_information_id;
	private int Discount_information_id;
	
	public int getCommodity_information_id() {
		return Commodity_information_id;
	}
	public void setCommodity_information_id(int commodity_information_id) {
		Commodity_information_id = commodity_information_id;
	}
	public int getDiscount_information_id() {
		return Discount_information_id;
	}
	public void setDiscount_information_id(int discount_information_id) {
		Discount_information_id = discount_information_id;
	}
	
}
