package a1;

import java.util.Scanner;

import a1.A1Novice.Customer;
import a1.A1Novice.Item;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		


		// Your code follows here.
		System.out.println("print num of items");
		int countOfItems = scan.nextInt();
		ItemAdept[] allItems = new ItemAdept[countOfItems];
		
		for (int i = 0; i < countOfItems; i++) {
			ItemAdept newItem = itemCreatorAdept();
			allItems[i] = newItem;
		}
		
		Customer test = customerGeneratorAdept(allItems);
		System.out.println("Done");
		System.out.println(test.total);
		
//		scan.close();
		int countOfCustomers = scan.nextInt();
		Customer[] allCustomers;
		
		
		
	}
	
	
	
	
	
	
	static Customer customerGenerator() {
		Scanner scan = new Scanner(System.in);	
		scan.close();
		String[] input = new String[3];		
		input = scan.nextLine().split(" ");
		String fName = input[0];
		String lName = input[1];
		String order = input[2];
		int cat = Integer.parseInt(order);		
		Customer aCust = new Customer(fName, lName, cat);	
		return aCust;		
		
	}
	
	static Customer customerGeneratorAdept(ItemAdept[] a) {
		System.out.println("print customer info");
		Scanner scan = new Scanner(System.in);
		String[] input = new String[5];
		input = scan.nextLine().split(" ");
		scan.close();
		String fname = input[0];
		String lName = input[1];
		String order = input[2];
		int cat = Integer.parseInt(order);
		
		double total = 0;
		Customer aCust = new Customer(fname, lName, cat);
		
		total = cartPriceAdept(input, a);
		
		aCust.total = total;
		
		scan.close();
		
		
		
		
		// CHANGE THIS
		return aCust;
	}
	
	static double cartPrice(Item[] a) {
		double total = 0;		
		for (int i = 0; i < a.length; i++) {
			total += a[i].total;	
		}	
		return total;
	
	}
	
	static double cartPriceAdept(String[] a, ItemAdept[] b) {
		String totalItemsString = a[2];
		int totalItems = Integer.parseInt(totalItemsString);
		int placeHolderItems = 1;
		int placeHolderItemsName = 2;
		double cartTotal = 0; 
		
		// CHANGE
		ItemAdept itemWanted = new ItemAdept("name", 0);
		
		
		for (int i = 0; i < totalItems; i++ ) {
			
			// ItemAdept itemWanted;
			
			String numOfItemsHolder = a[placeHolderItems = placeHolderItems + 2];
			int numOfItems = Integer.parseInt(numOfItemsHolder);
			
			// used for a (item adept)
			int storeItemNumber;
			String nameOfItemWanted = a[placeHolderItemsName = placeHolderItemsName + 2];
			
			// search for items name
			for (int j = 0; j < b.length; i++) {
				if (b[j].name == nameOfItemWanted) {
					itemWanted = b[j];
				}
			}
			// ItemAdept itemWanted;
			
			cartTotal += (numOfItems * itemWanted.cost);
			
			
			
			
			}
		
		return cartTotal;
	}
	
	static Item itemCreator() {
		Scanner scan = new Scanner(System.in);
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
	
	static ItemAdept itemCreatorAdept() {
		Scanner scan = new Scanner(System.in);
		String[] input = new String[2];
		input = scan.nextLine().split(" ");
		// only 1 item
		
		String name = input[0];				
		String fcost = input[1];
		double cost = Double.parseDouble(fcost);		
	// 	Item newItem = new Item(1, fname, cost);
		ItemAdept newItem = new ItemAdept(name, cost);
		
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
	
	public static class ItemAdept {
		String name;
		double cost;
		ItemAdept(String a, double b) {
			this.name = a;
			this.cost = b;
		}
	}
	
	
}
