package Week2;

import java.util.Scanner;

public class Lab2a {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		String name;
		
		System.out.print("Please enter your name: ");
		name = in.nextLine();
		
		String dessert;
		
		System.out.print("What is your favorite dessert? ");
		dessert = in.nextLine();
		
		System.out.println("Hello, " + name + "!");
		System.out.println("I hope you like coding JavaScript as much as you like to eat " + dessert + ".");
		
		String major;
		
		System.out.print("What is your major? ");
		major = in.nextLine();
		
		System.out.println("I like " + major + "!");
		
		String city;
		
		System.out.print("Oh, and where do you live? ");
		city = in.nextLine();
		
		System.out.println(city + " is a nice place to live!");
		
		String animal;
		
		System.out.print("What animal do you like? ");
		animal = in.nextLine();
		
		System.out.println("I like " + animal + " too!");
		
		String phone;
		
		System.out.print("Do you prefer samsung or apple? ");
		phone = in.nextLine();
		
		System.out.println("I love " + phone + " too!");
		
		String season;
		
		System.out.print("Do you prefer summer or winter? ");
		season = in.nextLine();
		
		System.out.println("I like " + season + " too!");
		
	}

}
