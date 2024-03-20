/* a program that prompts the user to input two integers. Then, it iterates through the range of integers from the first to the second one (inclusive), printing the double of each number in ascending order.  */
import java.util.Scanner;
public class printDoubleInRange {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first integer:");
    int x = input.nextInt();
    System.out.println("Enter the second integer:");
    int y = input.nextInt();
    while(x <= y){System.out.printf("The double of %d is %d.\n", x, x*2); x++;}
    /* INPUT: 
     * 5
     * 8
     * 
     * EXPECTED:
     * Enter the first integer:
     * Enter the second integer:
     * The double of 5 is 10.
     * The double of 6 is 12.
     * The double of 7 is 14.
     * The double of 8 is 16.
     * 
     * INPUT:
     * 2
     * 0
     * 
     * EXPECTED:
     * Enter the first integer:
     * Enter the second integer:
     */
    }
    
}