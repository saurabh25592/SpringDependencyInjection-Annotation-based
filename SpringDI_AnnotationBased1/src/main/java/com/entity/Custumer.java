package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Custumer {
	
	@Value("1")
	int cid;
	
	@Value("Ganesh")
	String name;
	
	@Autowired
	Product shop;

	
	Discount dic;
	
	

	public int getCid() {
		return cid;
	}



	public void setCid(int cid) {
		this.cid = cid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Product getShop() {
		return shop;
	}



	public void setShop(Product shop) {
		this.shop = shop;
	}



	public Discount getDic() {
		return dic;
	}


    @Autowired
 	public void setDic(Discount dic) {
    	System.out.println("these is Annotation on  Setter method ");
		this.dic = dic;
	}



	@Override
	public String toString() {
		return "Custumer [cid=" + cid + ", name=" + name + ", shop=" + shop + ", dic=" + dic + "]";
	}
	
	
	
	
	
}
