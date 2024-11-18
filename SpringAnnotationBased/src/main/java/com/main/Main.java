package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;

import com.entity.Student;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigureFile.class);
		Student st = context.getBean(Student.class);
//	st.setId(1);
//	st.setName("Saurabh");
		System.out.println(st);

	}
}
