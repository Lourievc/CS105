package Week1;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner iIn = new Scanner(System.in);
		// String[] cars = {"Fluffy", "Ginger"};
				// String[][] cars = {{"Fluffy", "Fred"}, {Ginger}};
				// System.out.println(cars[0][0]);
				ArrayList<String> cats = new ArrayList<String>();

				cats.add("Fluffy");
				cats.add("Dave");
				cats.add("Buster");

				// System.out.println(cats);
				// System.out.println(cats.get(2));

				// for (int i = 0; i < cats.size(); i++) {

				// int i = 0;
				// System.out.println(cats.get(i));
				// System.out.printf("Index #%d: %s\n", i, cats.get(i));

				// System.out.println(cats.get(cats.size()-1));

				// String name = "Jeffrey";

				// System.out.println(name.charAt(2));
				// int months = 18;

				// for (int i = 6; i < months; i = i + 3) {
				// System.out.println("Hello " + i);
				// for (String cat : cats) {
				// System.out.println(cat); //for-each don't use i in this for-each. Use other
				// words

				System.out.println(cats);

				int x = 5;
				int y = 9;
				
				System.out.println("\n\nBefore the function");
				System.out.println("-------------------");
				System.out.printf("x = %d        y = %d", x, y);
				System.out.println(cats);
				
				changeMe(x,y,cats);
				
				System.out.println("\n\nAfter the function");
				System.out.println("-------------------");
				System.out.printf("x = %d        y = %d", x, y);
				System.out.println(cats);

			}// end of main

			public static void changeMe(int x, int y, ArrayList<String> cats) {
				x = x + 100;
				y = y * y;
				cats.add("Fido");
				System.out.println("\n\nInside the function");
				System.out.println("-------------------");
				System.out.printf("x = %d        y = %d", x, y);
				System.out.println(cats);
			}
}
