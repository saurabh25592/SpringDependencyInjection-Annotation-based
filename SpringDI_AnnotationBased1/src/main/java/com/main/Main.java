package com.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.entity.Custumer;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigureFile.class);
	    Custumer c=context.getBean(Custumer.class,"emp");
        System.out.println(c);
         
         
	
	}

}

