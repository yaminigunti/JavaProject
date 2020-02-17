package com.cts.did1.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.did1.service.GreetService;

public class DidApp1 {
	public static void main(String []args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml") ;
	GreetService gs=(GreetService)context.getBean("g1");
	System.out.println(gs.greet("Yam"));
	GreetService gs1=(GreetService)context.getBean("g2");
	System.out.println(gs1.greet("Yami"));

}

}
