package com.sit.Product;

public class Product implements Comparable<Product>{

	private int id;
	private String name;
	public Product(int id, String name) {
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
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.getId() - o.getId();
	}


	
}
