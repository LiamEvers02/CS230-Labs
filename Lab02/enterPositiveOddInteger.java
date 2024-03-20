/*  a program repeatedly asks a user to enter a positive odd integer. 
While the user enters an invalid integer value, the program prompts the 
user to enter an integer again. Once the user enters a valid integer, 
the program prints the value.  */
import java.util.Scanner;
public class Lab02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        do{
            System.out.println("Enter a positive odd number:");
            number = input.nextInt();
        } while(!(number > 0 && number % 2 == 1));
        System.out.printf("The number is %d.", number);
        input.close();
        /* INPUT:
         * 0
         * 2
         * 4
         * 1
         * 
         * EXPECTED:
         * Enter a positive odd number:
         * Enter a positive odd number:
         * Enter a positive odd number:
         * Enter a positive odd number:
         * The number is 1.
         * 
         * INPUT:
         * -2
         * -1
         * 4
         * 7
         * 
         * EXPECTED:
         * Enter a positive odd number:
         * Enter a positive odd number:
         * Enter a positive odd number:
         * Enter a positive odd number:
         * The number is 7.
         * 
         * INPUT:
         * 3
         * 
         * EXPECTED:
         * Enter a positive odd number:
         * The number is 3.
         */
    }
}