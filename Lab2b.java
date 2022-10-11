//Lourie and Jinook
package Week2;
import java.util.Scanner;
public class Lab2b {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sqWidth, recWidth, recHeight;
		
		System.out.print("Please enter the windth of the square: ");
		sqWidth = scan.nextLine();
		
		System.out.print("Please enter width of the rectangle: ");
		recWidth = scan.nextLine();
		
		System.out.print("Please enter height of the rectangle:");
		recHeight = scan.nextLine();
		
		int sqArea = Integer.parseInt(sqWidth);
		sqArea *= sqArea;
		int recArea = Integer.parseInt(recWidth) * Integer.parseInt(recHeight);
		
		System.out.println("The area of a square with a width of " + sqWidth + " is " + sqArea);
		System.out.println("The area of a rectangle with a width of " + recWidth + " and a height of " + recHeight + " is " + recArea);
	}
}