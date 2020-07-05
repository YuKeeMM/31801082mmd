package cn.edu.zucc.fresh.model;

public class menu {
	public static String[] menuTitle={"²ËÆ×±àºÅ","²ËÆ×Ãû³Æ","²ËÆ×ÓÃÁÏ","²½Öè","Í¼Æ¬"};
	public String getCell(int col){
		if(col==0) return String.valueOf(Menu_id);
		else if(col==1) return Menu_name;
		else if(col==2) return Menu_ingredients;
		else if(col==3) return Menu_steps;
		else if(col==4) return Menu_pictures;
		else return "";
	}
	
	private int Menu_id;
	private String Menu_name;
	private String Menu_ingredients;
	private String Menu_steps;
	private longblob Menu_pictures;
	
	public int getMenu_id() {
		return Menu_id;
	}
	public void setMenu_id(int menu_id) {
		Menu_id = menu_id;
	}
	public String getMenu_name() {
		return Menu_name;
	}
	public void setMenu_name(String menu_name) {
		Menu_name = menu_name;
	}
	public String getMenu_ingredients() {
		return Menu_ingredients;
	}
	public void setMenu_ingredients(String menu_ingredients) {
		Menu_ingredients = menu_ingredients;
	}
	public String getMenu_steps() {
		return Menu_steps;
	}
	public void setMenu_steps(String menu_steps) {
		Menu_steps = menu_steps;
	}
	
}
