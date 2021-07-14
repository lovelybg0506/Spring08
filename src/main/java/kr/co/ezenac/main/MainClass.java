package kr.co.ezenac.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.ezenac.beans.TestBean;

public class MainClass {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/ezenac/config/beans.xml");
		
		TestBean t1 = new TestBean();
		t1.printData();
		
		System.out.println("---------------------------------------------");
		
		TestBean t2 = new TestBean(500);
		t2.printData();
		
		System.out.println("---------------------------------------------");
		
		TestBean obj1=ctx.getBean("obj1",TestBean.class);
		obj1.printData();

		System.out.println("---------------------------------------------");
		
		TestBean obj2=ctx.getBean("obj2",TestBean.class);
		obj2.printData();
	}
}
