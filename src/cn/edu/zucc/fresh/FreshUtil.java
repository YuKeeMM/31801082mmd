package cn.edu.zucc.fresh;

import cn.edu.zucc.fresh.comtrol.example.ExamplePlanManager;
import cn.edu.zucc.fresh.comtrol.example.ExampleStepManager;
import cn.edu.zucc.fresh.comtrol.example.ExampleUserManager;
import cn.edu.zucc.fresh.itf.IPlanManager;
import cn.edu.zucc.fresh.itf.IStepManager;
import cn.edu.zucc.fresh.itf.IUserManager;

public class freshUtil {
	public static IPlanManager planManager=new ExamplePlanManager();//��Ҫ����������Ƶ�ʵ����
	public static IStepManager stepManager=new ExampleStepManager();//��Ҫ����������Ƶ�ʵ����
	public static IUserManager userManager=new ExampleUserManager();//��Ҫ����������Ƶ�ʵ����
	
}
