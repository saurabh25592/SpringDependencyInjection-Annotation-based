package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("product")
public class Product {
	
	@Value("101")
	int sk_id;
	
	@Value("santoor saban")
	String pname;

	@Override
	public String toString() {
		return "Product [sk_id=" + sk_id + ", pname=" + pname + "]";
	}
	
	

}
