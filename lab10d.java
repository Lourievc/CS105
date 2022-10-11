//Lourie and Bentley
package Week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class lab10d {

	public static void main(String[] args) {
		String fileName = "Student Test Grades.csv";
		File inFile = new File(fileName);
		Scanner in = null;
		String dash = "-";
		String grade;
		int counter = 0;
		ArrayList<String[]> classRoster = new ArrayList<String[]>();

		try {
			in = new Scanner(inFile);

			while (in.hasNext()) {
				grade = in.nextLine();
				String[] gradeList = grade.split(",");
				classRoster.add(gradeList);
			} // end of read while loop
			

		} catch (FileNotFoundException e) {
			System.out.printf("Error, %s File not found.\n", fileName);
		}
		in.close();
		
		for (String[] headerList : classRoster) {
			if (counter == 0) {
				System.out.println(dash.repeat(47));
				System.out.printf("%-20s %-9s %-9s %-9s%n", headerList[0], headerList[1], headerList[2],
						headerList[3]);
				System.out.println(dash.repeat(47));
			} else {
				System.out.printf("%-20s %-9s %-9s %-9s%n", headerList[0], letterGrade(headerList[1]), letterGrade(headerList[2]),
						letterGrade(headerList[3]));
			}
			counter ++;
		}
		}// end of main
	public static String letterGrade(String number) {
		int score = Integer.parseInt(number);
		String letter = "";
		if (score > 94) {
			letter = "A";
		} else if (score > 90) {
			letter = "A-";
		} else if (score > 87) {
			letter = "B+";
		} else if (score > 84) {
			letter = "B";
		} else if (score > 80) {
			letter = "B-";
		} else if (score > 77) {
			letter = "C+";
		} else if (score > 74) {
			letter = "C";
		} else if (score > 70) {
			letter = "C-";
		} else if (score > 67) {
			letter = "D+";
		} else if (score > 64) {
			letter = "D";
		} else if (score > 60) {
			letter = "D-";
		} else {
			letter = "E";
		}
		return letter;
	}
	}// end of class

