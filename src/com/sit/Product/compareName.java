package com.sit.Product;

import java.util.Comparator;

public class compareName implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getName().compareTo(o2.getName()));
	}
	
}
