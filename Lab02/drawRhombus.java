/* a program which prompts the user to input an integer and prints a hollow rhombus star pattern based on the provided integer.  */
import java.util.Scanner;
public class Lab02 {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter number of rows:");
       int rows = input.nextInt();
       for(int i = 1; i <= rows; i++){
           for(int j = 1; j <= rows - i; j++){
               System.out.print(" ");
           }
       if(i == 1 || i == rows){
           System.out.print("*".repeat(rows));
       }
       else{
           System.out.print("*");
           for (int k = 1; k <= rows - 2; k++){
               System.out.print(" ");
           }
           System.out.print("*");
       }
       System.out.println();
   }
   }
}