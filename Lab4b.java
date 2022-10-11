// Lourie and Jinook
package week4;
import java.util.Scanner;
public class Lab4b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean valid = false;
		String input = "";
		int num = 0;
		
		while (!valid) {
			System.out.print("Please enter a number: ");
			input = sc.nextLine();
			
			try {
				num = Integer.parseInt(input);
				valid = true;
			} catch (Exception e) {
				System.out.println("Error: Please enter a whole number.");
			}
		}
		
		if(!(num == 0)) {
			System.out.println("num1 = " + num);
			System.out.println("num2 = " + (num + 1000));
			System.out.println("num3 = " + (num * 2));
		}

	}

}
