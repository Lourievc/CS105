//Lourie and Jinook
package Week3;

import java.util.*;

public class Lab3b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("In this program we will calculate a person's BMI.\n");
		
		System.out.print("Please enter a person's height in inches: ");
		String temp = sc.nextLine();
		double height = Integer.parseInt(temp);
		
		System.out.print("Please enter a person's wheight in pounds: ");
		temp = sc.nextLine();
		double wheight = Integer.parseInt(temp);
		
		height *= 0.0254;
		wheight *= 0.45359237;
		
		double bmi = wheight / (height*height);
		
		if (bmi < 18.5) {
			System.out.println("The person's BMI is: " + bmi + ". " + "The person has a BMI classification of: Underweight");
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("The person's BMI is: " + bmi + ". " + "The person has a BMI classification of: Normal");
		} else if (bmi >= 25 && bmi <= 29.9) {
			System.out.println("The person's BMI is: " + bmi + ". " + "The person has a BMI classification of: Overweight");
		} else {
			System.out.println("The person's BMI is: " + bmi + ". " + "The person has a BMI classification of: Obese");
		}
	}

}
