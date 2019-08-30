package a1;

import java.util.Scanner;

public class A1Adept {
	
	// worked with Tracy Ann and TAs

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numOfStoreItems = scan.nextInt();
		
		// storing items name and price in an array
		// STORE VAR
		String[] storeItemName = new String[numOfStoreItems];
		double[] storeItemPrices = new double[numOfStoreItems];
		
		
		// this cycles through the store item input and store them to an array
		for (int i = 0; i < numOfStoreItems; i ++) {
			
			storeItemName[i] = scan.next();
			storeItemPrices[i] = scan.nextDouble();
			
			
		}
		
		// customer info begins here
		
		int numOfCust = scan.nextInt();
		
		// where the cust info is being stored
		// CUST VAR
		String[] custName = new String[numOfCust];
		double[] custCartPrice = new double[numOfCust];
		
		// input
		for (int j = 0; j < numOfCust; j ++) {
			String currCustName = scan.next() + " " + scan.next();
			custName[j] = currCustName;
			
			// input for store price will be added directly to cust cart
			
			int sizeOfCart = scan.nextInt();
			
			for (int k = 0; k < sizeOfCart; k ++) {
				int numOfCurrItem = scan.nextInt();
				String nameOfCurrItem = scan.next();
				
				// used to assign the input to the proper array
				for (int q = 0; q < numOfStoreItems; q++) {
					if (nameOfCurrItem.equals(storeItemName[q])) {
						custCartPrice[j] += (storeItemPrices[q] * numOfCurrItem);
					}
				}
				
			}
			
			
			System.out.println(custName[j] + ": " + custCartPrice[j]);
			
			
		}
		
		/* this portion of the code cycles through each cust cart
		 * store the price and place 
		 * then prints
		 */
		
		
		// Get Biggest
		double biggestSpender = custCartPrice[0];
		int biggestSpenderPlace = 0;
		
		for (int i = 0; i < numOfCust; i++) {
			if (custCartPrice[i] >= biggestSpender) {
				biggestSpender = custCartPrice[i];
				biggestSpenderPlace = i;
			}
		}
		
		// Get Smallest
				double smallestSpender = custCartPrice[0];
				int smallestSpenderPlace = 0;
				
				for (int i = 0; i < numOfCust; i++) {
					if (custCartPrice[i] <= smallestSpender) {
						smallestSpender = custCartPrice[i];
						smallestSpenderPlace = i;
					}
				}
				
		// Get Average
				double totalOfAllCarts = 0;
				double average;
				
				for (int i = 0; i < numOfCust; i++) {
					totalOfAllCarts += custCartPrice[i];
				}
				
				average = totalOfAllCarts / numOfCust;
				
				System.out.println("Biggest: " + custName[biggestSpenderPlace] + " (" + String.format("%.2f", biggestSpender) + ") ");
				
				System.out.println("Smallest: " + custName[smallestSpenderPlace] + " (" + String.format("%.2f", smallestSpender) + ") ");
				
				System.out.println("Average: " + String.format("%.2f", average));
		
		
		
		
		
		

	}
}

