package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

		// Your code follows here.
		

		
		// System.out.println("Print the number of customers");
		
		int count = scan.nextInt();
		
		Customer[] allCust = new Customer[count];
		
		// System.out.println(allCust.length + "cow");
		
		for (int i = 0; i < count; i++) {
		// 	System.out.println("Print Customer Info \n");
			
			allCust[i] = customerGenerator();
			
		// 	System.out.println("First Name: " + allCust[i].fName + " Last Name: " + allCust[i].lName + " Order: " + allCust[i].order);
			
			Item[] cart = new Item[allCust[i].order];
			
			for (int j = 0; j < allCust[i].order; j++) {
				
				cart[j] = itemCreator();
				
				
				
			}
			
			double total = cartPrice(cart);
			allCust[i].total = total;
			
			
		 //	System.out.println("The total for customer is " + total);
		}

		for (int q = 0; q < allCust.length; q++) {
			System.out.println(allCust[q].fName + ". " + allCust[q].lName + ": " + allCust[q].total);
		}
		
//		Customer biggestD = Biggest(allCust);
//		
//		Customer smallestD = Smallest(allCust);
//		
//		double average = Average(allCust);
//		
//		
//		System.out.println("Biggest: " + biggestD.fullName + " " + biggestD.lName + " (" + biggestD.total + ")");
//		System.out.println("Smallest:" + smallestD.fullName + " " + smallestD.lName + " (" + smallestD.total + ")");
//		System.out.println("Average: " + average);
//		
	
		
	}
	
	static Customer customerGenerator() {
		Scanner scan = new Scanner(System.in);
		
		// scan.close();
		
		String[] input = new String[3];
		
		input = scan.nextLine().split(" ");
		// char fName = input[0].charAt(0);
		String fName = input[0];
		String lName = input[1];
		String order = input[2];
		int cat = Integer.parseInt(order);
		
		Customer aCust = new Customer(fName, lName, cat);
		
		
		return aCust;
		
	}
	
	static double cartPrice(Item[] a) {
		double total = 0;
		
		for (int i = 0; i < a.length; i++) {
			total += a[i].total;
//			System.out.println(total);
			
			
		}
		
		return total;
		
	
		
		
		
		
	}
	
	
	static Item itemCreator() {
		Scanner scan = new Scanner(System.in);
		// scan.close();
		
		String[] input = new String[3];
		input = scan.nextLine().split(" ");
		
		String fquant = input[0];
		double quant = Integer.parseInt(fquant);
		
		String fname = input[1];
		
		
		String fcost = input[2];
		double cost = Double.parseDouble(fcost);
		
		Item newItem = new Item(quant, "", cost);
		
		return newItem;
		
		
	}
	
	static Customer Biggest(Customer[] a) {
		Customer biggestD = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i].total > biggestD.total) {
				biggestD = a[i];
			}
		}
		
		return biggestD;
		
	}
	
	static Customer Smallest(Customer[] a) {
		Customer smallestD = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i].total < smallestD.total) {
				smallestD = a[i];
			}
		}
		
		return smallestD;
		
	}
	
	static double Average(Customer[] a) {
		double avg = 0;
		double total = 0;
		
		for (int i = 0; i < a.length; i++) {
			total += a[i].total;
		}
		avg = total / a.length;
		
		return avg;
		
		
		
	}
	
	
	
	
	// adds up everything in the cart
	

	
	public static class Customer {
		
		char fName;
		String fullName;
		String lName;
		int order;
		double total;
		Item[] purchased;
		
		Customer(String a, String b, int c) {
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
