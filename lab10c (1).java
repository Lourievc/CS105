package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lab10c {

	public static void main(String[] args) {
		String fileName = "Student Assignment Scores.csv";
		File inFile = new File(fileName);
		Scanner in = null;
		String dash = "-";
		String header;
		String grade;
		try {
			in = new Scanner(inFile);
		} catch (FileNotFoundException e) {
			System.out.printf("Error, %s File not found.\n",fileName);
		}
		header = in.nextLine();
		String[] headerList = header.split(",");
		
		System.out.printf("%-25s %-16s%n", "Student", "Assignment with 0");
		System.out.println(dash.repeat(46));
		while(in.hasNext()) {
			grade = in.nextLine();
			String[] gradeList = grade.split(","); 
			for (int i = 0; i < gradeList.length; i++ ) {
			if (gradeList[i].equals("0")) { 
				String headerValue=headerList[i];
				System.out.printf("%-30s %-16s%n", gradeList[0],headerValue.charAt(headerValue.length()-1));
			}//end of if gradeList[i].equals("0"))
		}//end of for loop
	}//end of whole loop in.hasNext()

}

}