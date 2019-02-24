package com.nw.srs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nw.srs.beans.FlipKart;

public class ClientApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/nw/ars/config/application-context.xml");

		FlipKart flipKart = context.getBean("flipKart", FlipKart.class);

		String billMsg = flipKart.purchase(new String[] { "Shirt", "TV", "Mobile" });
		System.out.println(billMsg);

	}
}
