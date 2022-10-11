//Lourie and Bentley
package Week10;

import java.io.File;
import java.util.Scanner;

public class lab10a {

	public static void main(String[] args) {
		String fileName = "Student Assignment Scores.csv";
		String student;
		File inFile = new File(fileName);
		Scanner in = null;

		try {
			in = new Scanner(inFile);
		} catch (Exception e) {
			System.out.printf("Error. %s not found./n", fileName);
		}
		while (in.hasNext()) {
			student = in.nextLine();
			String[] studentList = student.split(",");
			System.out.println(student);
		}
	}

}
