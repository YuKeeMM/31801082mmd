package cn.edu.zucc.fresh.model;

public class recommended_menu {
	public static String[] recommended_menuTitle={"ÉÌÆ·±àºÅ","²ËÆ×±àºÅ","ÃèÊö"};
	public String getCell(int col){
		if(col==0) return String.valueOf(Commodity_information_id);
		else if(col==1) return String.valueOf(Menu_id);
		else if(col==2) return Recommended_menu_description;
		else return "";
	}
	
	private int Commodity_information_id;
	private int Menu_id;
	private String Recommended_menu_description;
	
	public int getCommodity_information_id() {
		return Commodity_information_id;
	}
	public void setCommodity_information_id(int commodity_information_id) {
		Commodity_information_id = commodity_information_id;
	}
	public int getMenu_id() {
		return Menu_id;
	}
	public void setMenu_id(int menu_id) {
		Menu_id = menu_id;
	}
	public String getRecommended_menu_description() {
		return Recommended_menu_description;
	}
	public void setRecommended_menu_description(String recommended_menu_description) {
		Recommended_menu_description = recommended_menu_description;
	}
	
	
}
