//Lourie and Bentley
package week10;

import java.io.File;
import java.util.Scanner;

public class lab10b {

	public static void main(String[] args) {
		String fileName = "Student Assignment Scores.csv";
		String student;
		String dash = "-";
		File inFile = new File(fileName);
		Scanner in = null;
		String header;

		try {
			in = new Scanner(inFile);
		} catch (Exception e) {
			System.out.printf("Error. %s not found./n", fileName);
		}
		header = in.nextLine();
		String[] headerList = header.split(",");
		//System.out.println("---------------------------------------------------------");
		System.out.println(dash.repeat(76));
		System.out.printf("%-30s %-7s %-7s %-7s %-7s %-7s %-7s %n",headerList[0],headerList[1],headerList[2],headerList[3],headerList[4],headerList[5],headerList[6]);
		System.out.println(dash.repeat(76));
		while (in.hasNext()) {
			student = in.nextLine();
			String[] studentList = student.split(",");
			System.out.printf("%-30s %-7s %-7s %-7s %-7s %-7s %-7s %n",studentList[0],studentList[1],studentList[2],studentList[3],studentList[4],studentList[5],studentList[6]);
		}
	}

}