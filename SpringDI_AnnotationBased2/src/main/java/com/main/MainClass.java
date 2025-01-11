package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jbk.Custumer;
import com.jbk.Product;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigureFile.class);
		Custumer c = context.getBean(Custumer.class);
		Product p = context.getBean(Product.class);
		System.out.println(c);

	}

}
