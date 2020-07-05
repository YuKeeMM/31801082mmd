package cn.edu.zucc.fresh.model;

public class fresh {
	public static String[] freshTitle={"类别编号","类别名称","类别描述"};
	public String getCell(int col){
		if(col==0) return String.valueOf(Fresh_id);
		else if(col==1) return Fresh_name;
		else if(col==1) return Fresh_description;
		else return "";
	}
	
	private int Fresh_id;
	private String Fresh_name;
	private String Fresh_description;
	
	public int getFresh_id() {
		return Fresh_id;
	}
	public void setFresh_id(int fresh_id) {
		Fresh_id = fresh_id;
	}
	public String getFresh_name() {
		return Fresh_name;
	}
	public void setFresh_name(String fresh_name) {
		Fresh_name = fresh_name;
	}
	public String getFresh_description() {
		return Fresh_description;
	}
	public void setFresh_description(String fresh_description) {
		Fresh_description = fresh_description;
	}

}
