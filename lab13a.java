//Bentley and Lourie 
package Week13;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class lab13a {

	public static void main(String[] args) {
		// initialize variables
	
			try {
				String fileName = "Pwd.txt";
				String passWord = "";
				File inFile = new File(fileName);
				Scanner in = new Scanner(inFile);
				
				PrintWriter valid = new PrintWriter("validpwd.txt");
				PrintWriter invalid = new PrintWriter("invalidpwd.txt");
				
				System.out.println("Beginning password analysis....\n"
						+ "Opening file 'Pwd.txt'.");
				
				while (in.hasNextLine()) {
					passWord = in.nextLine();
					if (passWord.length() < 8) {
						invalid.write(String.format("%-20s Invalid password! Must be at least 8 characters long.\n", passWord));
					} else if (!hasUpper(passWord)) {
						invalid.write(String.format("%-20s Invalid password! Must contain at least one UPPERCASE character.\n", passWord));
					} else if (!hasLower(passWord)) {
						invalid.write(String.format("%-20s Invalid password! Must contain at least one LOWERCASE character.\n", passWord));
					} else if (!hasNumber(passWord)) {
						invalid.write(String.format("%-20s Invalid password! Must contain at least one NUMBER.\n", passWord));
					} else if (!hasSpecial(passWord)) {
						invalid.write(passWord + "            Invalid password! Must contain at least one of {@, #, %, -, &, *}.\n");
					} else {
						valid.write(passWord + "\n");
					}
				}
				
				System.out.println("Analysis complete. Closing files.\n"
						+ "Results can be found in files 'invalidpwd.txt' and 'validpwd.txt' ");
				
				in.close();
				valid.flush();
				valid.close();
				invalid.flush();
				invalid.close();
				
			} catch (Exception e) {
				System.out.println("File Error: File 'Pwd.txt' not found!");
			}
			
	}// end of main
	
	public static boolean hasUpper(String passWord) {
		for (int i = 0; i < passWord.length(); i++) {
			if (Character.isUpperCase(passWord.charAt(i))) {
				return true;
			} // end of if
		} // end of for
		return false;
	}// end of hasUpper

	public static boolean hasLower(String passWord) {
		for (int i = 0; i < passWord.length(); i++) {
			if (Character.isLowerCase(passWord.charAt(i))) {
				return true;
			} // end of if
		} // end of for
		return false;
	}// end of hasLower

	public static boolean hasNumber(String passWord) {
		for (int i = 0; i < passWord.length(); i++) {
			if (Character.isDigit(passWord.charAt(i))) {
				return true;
			} // end of if
		} // end of for
		return false;
	}// end of hasNumber

	public static boolean hasSpecial(String passWord) {
		for (int i = 0; i < passWord.length(); i++) {
			if (passWord.charAt(i) == '@' || passWord.charAt(i) == '#' || passWord.charAt(i) == '%'
					|| passWord.charAt(i) == '-' || passWord.charAt(i) == '&'|| passWord.charAt(i) == '*') {
				return true;
			} // end of if
		} // end of for
		return false;
	}// end of hasSpecial
}// end of class
