package week13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class lab13b {

	public static void main(String[] args) {
		String fileLetter = "Warning Letter to Student -.txt";
		String fileScore = "Student Assignment Scores.csv";
		String grades = "";
		String letterName = "";
		File inScores = new File(fileScore);
		File inLetter = new File(fileLetter);
		Scanner score = null;
		Scanner letter = null;
		ArrayList<String> scoreList = new ArrayList<String>();

		try {
			letter = new Scanner(inLetter);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} // end of try/catch inLetter

		letter.useDelimiter("\\Z");
		String letterBody = letter.next();

		try {
			score = new Scanner(inScores);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} // end of try/catchinScores
		System.out.printf("Creating letters for: %n%n");
		while (score.hasNext()) {
			grades = score.nextLine();
			String[] gradeList = grades.split(",");
			for (int i = 0; i < gradeList.length; i++) {
				if (gradeList[i].equals("0")) {
					System.out.println(gradeList[0]);
					letterName = "Warning letter to student " + gradeList[0] + ".txt";
					
					File outFile = new File(letterName);
					PrintWriter writer = null;
					try {
						writer = new PrintWriter(outFile);
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
					writer.printf("Dear %s %n %s %n",gradeList[0],letterBody);
					for (int j = 0; j < gradeList.length; j++) {
						if (gradeList[j].matches("0")) {
						writer.printf("Assignment %s%n", j);
						}
					}
					writer.flush();
					break;
				}
				

			} // end of if gradeList[i].equals("0"))
		} // end of for loop
	} // end of while score.hasnext

}// end of main

//grades = score.nextLine();
//String[] gradeList = grades.split(",");
//System.out.printf("%-30s %-16s%n", gradeList[0],headerValue.charAt(headerValue.length()-1));