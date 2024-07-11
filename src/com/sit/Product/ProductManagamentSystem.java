package com.sit.Product;

import java.util.*;


public class ProductManagamentSystem {

	private static List<Product> products = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean runing = true;
		while(runing) {
			displayMenu();
			
			int choice = scanner.nextInt();
			
			scanner.nextLine();
			
			switch(choice) {
			case 1:
				addProduct(scanner);
				break;
				
			case 2:
				removeProduct(scanner);
				break;
			case 3:
				displayProduct();
				break;
			case 4:
				searchProduct(scanner);
				break;
			case 5:
				sortProductByName();
				break;
			case 6:
				sortProductById();
				break;
			case 0:
				runing = false;
				break;
			default:
				System.out.println("Invalid choice! Please try again.");
			}
		}
		scanner.close();
	}
	private static void displayMenu() {
		System.out.println("Enter 1 for to add Product \n Enter 2 for removing a product."
				+ "\n Enter 3 to display Products \n Enter 4 to search a product by name\n Enter 5 to sort products by name"
				+ "\n Enter 6 to sort products by ID");
	}
		
	
	private static void  addProduct(Scanner scanner) {
		 System.out.println("Please Enter the product ID: ");
		 int id = scanner.nextInt();
		 scanner.nextLine();
		 System.out.println("Please Enter the Product Name");
		 String pName = scanner.nextLine();
		 products.add(new Product(id,pName));
		 System.out.println("Product added succesfully");
		
	}
	
	
	
	private static void removeProduct(Scanner scanner) {
		System.out.println("Enter the id you want to remove");
		int id = scanner.nextInt();
		for(Iterator<Product> iterator = products.iterator(); iterator.hasNext();) {
			Product check = iterator.next();
			int checkID = check.getId();
			if(checkID == id) {
				iterator.remove();
				break;
			}
		}
		System.out.println("Product not available.");
	}
	
	private static void displayProduct() {
		if(products.isEmpty()) {
			System.out.println("List is empty");
		}else {
		System.out.println(" ");
		for(Product each : products) {
			
			System.out.println(each);
		}
		}
		System.out.println(" ");
	}
	
	private static void searchProduct(Scanner scanner) {
		System.out.println("Enter the product you want to search");
		String name = scanner.nextLine();
		for(Iterator<Product> iterator = products.iterator(); iterator.hasNext();) {
			Product checkProducts = iterator.next();
			String checkName = checkProducts.getName();
			if(checkName.equals(name)) {
				System.out.println(checkProducts);
				break;
			}else {
				System.out.println("Product not available.");
			}
		}
		
		
	}
	
	private static void sortProductById(){
//		Collections.sort(products,new compareIds());
		Collections.sort(products);
		System.out.println("Products sorted Asscendigly by ID.");
	}
	
	private static void sortProductByName() {
		Collections.sort(products,new compareName());
		System.out.println("Products sorted by Name.");
	}
	
	
}
