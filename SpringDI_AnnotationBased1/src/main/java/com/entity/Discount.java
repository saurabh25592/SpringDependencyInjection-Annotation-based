package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Discount {

	@Value("30")
	int per;
	
	@Value("diwali Dhamaka")
	String name;

	@Override
	public String toString() {
		return "Discount [per=" + per + ", name=" + name + "]";
	}
	
	
}
