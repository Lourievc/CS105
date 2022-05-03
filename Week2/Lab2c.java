//Lourie and Jinook
package Week2;

import java.util.Scanner;


public class Lab2c {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		String _deposit, _yInterest, _mInterest, _balance; 
				
		System.out.print("Please enter the amount to be deposited each month: ");
		_deposit = in.nextLine();
		
		System.out.print("Please enter the annual interest rate percent: ");
		_yInterest = in.nextLine();
		
		
		
		
		double deposit = Integer.parseInt(_deposit);
		double yInterest = Integer.parseInt(_yInterest);
		
		double mInterest = yInterest / 100 / 12;
		
		double balance = 0;
		
		balance = (deposit + balance) * (1 + mInterest);
		balance = (deposit + balance) * (1 + mInterest);
		balance = (deposit + balance) * (1 + mInterest);
		balance = (deposit + balance) * (1 + mInterest);
		balance = (deposit + balance) * (1 + mInterest);
		balance = (deposit + balance) * (1 + mInterest);
		
		System.out.print("The ending balance after 6 months is: $" + balance );
		
		
		
	}

}
