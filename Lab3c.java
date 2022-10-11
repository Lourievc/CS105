// Jinook and Lourie
package Week3;

import java.util.Scanner;

public class Lab3c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner in = new Scanner(System.in);
	
	String gender = "", _age = "";
	int age = 0;
	
	System.out.println("This program will ask a member's age and gender and determine which class they should attend on Sunday.\n ");
	System.out.println("Please enter the member's age: ");
	_age = in.nextLine();
	age = Integer.parseInt(_age);
	
	if (age < 1) {
		System.out.println("The member is a Babe In Arms ");
	} else if (age >= 1 && age < 3) { 
		System.out.println("The member should be in Nursery");
	} else if (age >= 3 && age < 12) {
		System.out.println("The member should attend Primary");
	} else if (age >= 12 && age < 18) {
		System.out.println("Please enter the member's gender: ");
		gender = in.nextLine();
		
		if (gender.equalsIgnoreCase("m")) {
			System.out.println("The member should attend Young Men's ");
		} else {
			System.out.println("The member should attend Young Women's ");
		}
	} else { 
		System.out.println("Please enter the member's gender: ");
		gender = in.nextLine();
		
		if (gender.equalsIgnoreCase("m")) {
			System.out.println("The member should attend Priesthood ");
		} else {
			System.out.println("The member should attend Relief Society ");
		}
	 

	}

}
}