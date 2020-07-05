package cn.edu.zucc.fresh.model;
import java.util.Date;

public class order_evaluation {
	public static String[] order_evaluationTitle={"订单编号","用户编号","评价内容","评价日期","星级","照片"};
	public String getCell(int col){
		if(col==0) return String.valueOf(Commodity_order_id);
		else if(col==1) return String.valueOf(User_id);
		else if(col==2) return Order_evaluation_content;
		else if(col==3) return String.valueOf(Order_evaluation_date);
		else if(col==4) return Order_evaluation_star_level;
		else if(col==5) return Order_evaluation_photo;
		else return "";
	}
	
	private int Commodity_order_id;
	private int User_id;
	private String Order_evaluation_content;
	private Date Order_evaluation_date;
	private String Order_evaluation_star_level;
	private longblob Order_evaluation_photo;
	
	public int getCommodity_order_id() {
		return Commodity_order_id;
	}
	public void setCommodity_order_id(int commodity_order_id) {
		Commodity_order_id = commodity_order_id;
	}
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	public String getOrder_evaluation_content() {
		return Order_evaluation_content;
	}
	public void setOrder_evaluation_content(String order_evaluation_content) {
		Order_evaluation_content = order_evaluation_content;
	}
	public Date getOrder_evaluation_date() {
		return Order_evaluation_date;
	}
	public void setOrder_evaluation_date(Date order_evaluation_date) {
		Order_evaluation_date = order_evaluation_date;
	}
	public String getOrder_evaluation_star_level() {
		return Order_evaluation_star_level;
	}
	public void setOrder_evaluation_star_level(String order_evaluation_star_level) {
		Order_evaluation_star_level = order_evaluation_star_level;
	}
	
}
