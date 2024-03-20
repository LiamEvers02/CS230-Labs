/*  a program which prompts the user to enter a web address and extracts the domain name from it. Print the extracted domain name in uppercase. For example, if the input is 'www.example.com', then the program prints 'EXAMPLE'. */
import java.util.Scanner;
import java.util.regex.*;
public class domainNameExtractor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a web address (www.domain.com):");
		String address = input.next();
		String[] addressArray = address.split("\\.");
		System.out.printf("The domain is '%s'.", addressArray[1].toUpperCase());
		
	}
}