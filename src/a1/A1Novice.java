package a1;

import java.util.Scanner;

//worked with Tracy Ann and TAs



public class A1Novice {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		// Your code follows here.


		// START HERE
		
		// # of customers and are being handled
		
		
		int numOfCust = scan.nextInt();
		
		for (int i = 0; i < numOfCust; i++) {
			String firstName = scan.next();
			// gets the first character of the name
			char firstCharacterOfName = firstName.charAt(0);
			String lastName = scan.next();
			
			// this is where items are being handled (part of of the first array)
			
			int numOfItems = scan.nextInt();
			double total = 0;
			
			for (int j = 0; j < numOfItems; j++) {
				int quant = scan.nextInt();
				
				
				String itemNameWhichIsNeverUsedSoThisNameDoesntReallyMatter = scan.next();
				double costOfSaidItem = scan.nextDouble();
				total += quant * costOfSaidItem;
				
			}
			
			//right at the end of the beginning loop
			System.out.println(firstCharacterOfName + ". " + lastName + ": " + String.format("%.2f", total));
			
			
			
			
		}
		
		
		





	}





}
