/*  a program which prompts the user to enter a year and prints whether the year is a leap year or not.
 *  Wikipedia states Leap year as a special year containing one extra day i.e. total 366 days in a year. 
 *  A year is said to be leap year, if the year is exactly divisible by 4 but not divisible by 100. 
 *  Year is also a leap year if it is exactly divisible by 400.
 */
import java.util.Scanner;
public class isLeapYear{
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a year:");
		int year = input.nextInt();
		if(year % 4 == 0 && year % 100 != 0){System.out.printf("%d is a leap year.", year);}
		else{System.out.printf("%d is not a leap year.", year);}
        input.close();
        /* INPUT:
         * 2004
         * 
         * EXPECTED:
         * Enter a year:
         * 2004 is a leap year.
         * 
         * INPUT:
         * 2019
         * 
         * EXPECTED:
         * Enter a year:
         * 2019 is not a leap year.
         * 
         * INPUT:
         * 2021
         * 
         * EXPECTED:
         * Enter a year:
         * 2021 is not a leap year.
         * 
         * INPUT:
         * 2009
         * 
         * EXPECTED:
         * Enter a year:
         * 2009 is not a leap year.
         */
	}
}