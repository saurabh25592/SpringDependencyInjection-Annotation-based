package com.jbk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Custumer {

	
	@Value("101")
	private int id;
	
	@Value("Mukesh")
	private String name;
	
	@Autowired
    private Product productId;    

	

	public void setProductId(Product productId) {
		this.productId = productId;
	}

	public Custumer() {

	}

	public Custumer(int id, String name, Product product) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Product getProductId() {
		return productId;
	}

	

	@Override
	public String toString() {
		return "Custumer [id=" + id + ", name=" + name + ", product=" +   "]";
	}

}
