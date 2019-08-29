package a1;

import java.util.Scanner;



public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

			System.out.println("START HERE");
			// count for the number of customers
			
			int count = scan.nextInt();

			
			//array of said customers
			Customer[] allCust = new Customer[count];
			
			for (int i = 0; i < count; i++) {
				allCust[i] = customerGenerator();
				
				// generate cart and it's price total
				Item[] cart = new Item[allCust[i].order];
				
				for (int j = 0; j < allCust[i].order; j++) {
//					allCust[i].cart[j] = itemGenerator();
					cart[j] = itemGenerator();
				}
				allCust[i].cart = cart;
				double cartTotal = cartPrice(cart);
				allCust[i].total = cartTotal;
				
			}
			
			for (int q = 0; q < count; q++) {
				Customer currCust = allCust[q];
				System.out.println(currCust.fName + ". " + currCust.lName + ": " + currCust.total);
			}
			
			System.out.println("Customer Info: " + allCust[0].fName + allCust[0].fNameFull);
			

		
		
	}
	

	
	static Customer customerGenerator() {
		Scanner scan = new Scanner(System.in);
		

		String fNameFull = scan.next();
		String lName = scan.next();
		int order = scan.nextInt();
		

		
		Customer newCust = new Customer(fNameFull, lName, order);
		
		
		return newCust;
		
	}
	
	static Item itemGenerator() {
		Scanner scan = new Scanner(System.in);
		
		int quantity = scan.nextInt();
		String name = scan.next();
		double price = scan.nextDouble();
		
		Item newItem = new Item(quantity, name, price);
		
		
		return newItem;
		
		
		
	}
	
	static double cartPrice(Item[] a) {
		
		double total = 0.00;
		for (int i = 0; i < a.length; i++) {
			total += a[i].total;
		}
		
		return total;
	
	}
	
public static class Customer {
		
		char fName;
		String fNameFull;
		String fullName;
		String lName;
		int order;
		double total;
		Item[] cart;
		
		Customer(String a, String b, int c) {
			this.fNameFull = a;
			this.fName = a.charAt(0);
			this.lName = b;
			this.order = c;
			this.fullName = a;
		}
		
		
		
			
		
	}
	
	public static class Item {
		double quant;
		String name;
		double cost;
		double total;
		
		Item(double a, String b, double c) {
			this.quant = a;
			this.name = b;
			this.cost = c;
			this.total = a * c;
			
		}
		
		
	}
	
	
	
}
