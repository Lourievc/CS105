//Jinook and Lourie

package Week3;

import java.util.Scanner;

public class Lab3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		
		String chestsize;
		
		System.out.print("In this program, we will determine a man's shirt size based on the measurement in inches of the customer's chest.\n"
				+ "Please enter the customer's chest measurement in inches: ");
		chestsize = in.nextLine();
		
		int _chestsize = Integer.parseInt(chestsize);
		
		if (_chestsize < 38) {
			System.out.println("A customer with a chest measurement of " + _chestsize + " inches needs to order a size S.");
		}
		
		else if (_chestsize >= 38 && _chestsize < 40) {
			System.out.println("A customer with a chest measurement of " + _chestsize + " inches needs to order a size M.");
		}
		
		else if (_chestsize >= 40 && _chestsize < 43) {
			System.out.println("A customer with a chest measurement of " + _chestsize + " inches needs to order a size L.");
		}

		else if (_chestsize >= 43 && _chestsize < 46) {
			System.out.println("A customer with a chest measurement of " + _chestsize + " inches needs to order a size XL.");
		}
		
		else  {
			System.out.println("A customer with a chest measurement of " + _chestsize + " inches needs to order a size XXL.");
		}
	}

}
