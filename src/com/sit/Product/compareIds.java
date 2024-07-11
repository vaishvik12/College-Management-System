package com.sit.Product;

import java.util.Comparator;

public class compareIds implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getId() - o2.getId();
	}
	
}
