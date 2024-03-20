/* 
a program that prompts the user to enter a password. 
The program processes the password and prints a message indicating whether or not the password is valid. 
A valid password needs to meet the following criteria:

The password should have a length of at least 8 characters.
The first character of the password must be an alphabetical letter.
The password should have at least 4 alphabetical characters.
The password should have at least 3 numerical characters.
*/

import java.util.Scanner;
public class passwordValidator {
	public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter a password:");
	    String password = input.next();
	    char[] passwordArray = password.toCharArray();
	    boolean validity = true;
	    if(passwordArray.length < 8){validity = false;}
	    if(!Character.isAlphabetic(passwordArray[0])){validity = false;}
	    int alphabet = 0, numeric = 0;
	    for(char c : passwordArray){
	        if(Character.isDigit(c)){numeric += 1;}
	        if(Character.isAlphabetic(c)){alphabet += 1;}
	    }
	    if(numeric < 3){validity = false;}
	    if(alphabet < 4){validity = false;}
	    String message = validity ? "Your password is valid!" : "Your password is invalid!";
	    System.out.println(message);
	}
}