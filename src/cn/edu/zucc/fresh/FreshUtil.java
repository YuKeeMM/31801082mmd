package cn.edu.zucc.fresh;

import cn.edu.zucc.fresh.comtrol.example.ExamplePlanManager;
import cn.edu.zucc.fresh.comtrol.example.ExampleStepManager;
import cn.edu.zucc.fresh.comtrol.example.ExampleUserManager;
import cn.edu.zucc.fresh.itf.IPlanManager;
import cn.edu.zucc.fresh.itf.IStepManager;
import cn.edu.zucc.fresh.itf.IUserManager;

public class freshUtil {
	public static IPlanManager planManager=new ExamplePlanManager();//需要换成自行设计的实现类
	public static IStepManager stepManager=new ExampleStepManager();//需要换成自行设计的实现类
	public static IUserManager userManager=new ExampleUserManager();//需要换成自行设计的实现类
	
}
