/*
Program/Project: Lab9b
Your Name: Ben Campbell and Lourie Valenzuela
Date: 11/10/2021
Instructor: Jeff Light
Description: Displays a menu to the screen 
*/
package week9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lab9b {
	public static void main(String[] args) {
		// Initialize variables
		Scanner sIn = new Scanner(System.in); // Input Scanner for String
		ArrayList<String> shoppingList = new ArrayList<String>(); // ArrayList for shoppingList
		String choice; // Holds user input of type String
		boolean done = false; // Keeps program running until user wants to quit

		// Keep running the program until the user quits
		do {
			// Print out the menu to the console
			System.out.println();
			System.out.println("1. Add Items");
			System.out.println("2. Delete Items");
			System.out.println("3. Show Items");
			System.out.println("4. Sort Items");
			System.out.println("5. Exit");
			System.out.print("Please enter a command: ");
			choice = sIn.nextLine();

			// Call the appropriate method for the choice selected.
			switch (choice) {
			case "1": // Add items to the Shopping List
				System.out.println(addItems(sIn, shoppingList) + " items have been added to your Shopping List.");
				break;
			case "2": // Delete items from the Shopping List
				System.out
						.println(deleteItems(sIn, shoppingList) + " items have been deleted from your Shopping List.");
				break;
			case "3": // Show the items in the Shopping List
				showItems(shoppingList);
				break;
			case "4": // Sort the items in the Shopping List
				sortItems(shoppingList);
				break;
			case "5": // Exit the program
				System.out.println("\nGoodbye");
				done = true;
				break;
			default: // Handles all input that is not between 1-5
				System.out.println("Invalid response.  Please enter a choice from the menu (1-5).");
			} // End of switch (choice)
		} while (!done); // Keep running the program until the user quits
	}// end of main()

	public static int addItems(Scanner sIn, ArrayList<String> shoppingList) {
		boolean done = false;
		String answer = "";
		int i = 0;

		while (!done) {
			System.out.println("Add an item to the list (or just hit 'ENTER' when done): ");
			answer = sIn.nextLine();
			if (answer.equals("")) {
				done = true;
			} else if(!answer.contains(":")){
				System.out.println("Invalid Entry. No ':' found. Entry must be in the form '<item>:<amount>'");
			} else {
					int colonIndex = answer.indexOf(":");
					String item = answer.substring(0 , colonIndex).trim();
					String amount = answer.substring(colonIndex + 1).trim();
					answer = item + ":" + amount;
				shoppingList.add(answer);
				System.out.printf("'%s' has been added to the Shopping List.\n\n", answer);
				i++;
			}
		} // end of while "done"
		return i;
		
	}// end of method addItems(ArrayList<String>)

	public static int deleteItems(Scanner sIn, ArrayList<String> shoppingList) {
		boolean done = false;
		String answer = "";
		int i = 0;

		while (!done) {
			System.out.println("Delete an item to the list (or just hit 'ENTER' when done): ");
			answer = sIn.nextLine();
			
			if (answer.equals("")) {
				done = true;
			} else if (shoppingList.contains(answer)){
				shoppingList.remove(answer);
				System.out.printf("'%s' has been deleted to the Shopping List.\n\n", answer);
				i++;
			} else {
			showItems(shoppingList); 
			System.out.printf("Invalid response! '%s' is NOT an item in the list.\n", answer);
			}
			}
		return i;

	}// end of method deleteItems(ArrayList<String>)

	public static void showItems(ArrayList<String> shoppingList) {
		System.out.println("--------------------------");
		System.out.println("      Shopping List       ");
		System.out.println("--------------------------");
		for (int i = 0; i < shoppingList.size(); i++ ) {
			int colonIndex = shoppingList.get(i).indexOf(":");
			String item = shoppingList.get(i).substring(0 , colonIndex);
			String amount = shoppingList.get(i).substring(colonIndex + 1);
			System.out.printf("%-23s %3s\n",item,amount);
		}
		System.out.println("--------------------------");

		//+ shoppingList
	}// end of method showItems(ArrayList<String>)

	public static void sortItems(ArrayList<String> shoppingList) {
		Collections.sort(shoppingList);
		showItems(shoppingList);

	}// end of method sortItems(ArrayList<String>)

}// end of class Lab9aStartCode