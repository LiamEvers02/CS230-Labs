/* a program which prompts the user to enter a number of rows and prints a number pattern as shown in the examples below. */
import java.util.Scanner;
public class printTrianglePattern {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter number of rows:");
       int number = input.nextInt();
       for (int i = 1; i <= number; i++){
           for(int j = 1; j <= number - i; j++){
               System.out.print(" ");
           }
           for (int k = i; k >= 1; k--){
               System.out.print(k);
               
           }
        System.out.println();
       }
   }
}