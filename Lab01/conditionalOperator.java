/*
 * Write a program that prompts the user to input four integer 
 * values and then identifies and prints the largest value among them
 * using the conditional operator. 
 */
import java.util.*;
public class conditionalOperator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int max = Integer.MIN_VALUE;
      System.out.println("Enter the first integer:");
      int current = input.nextInt();
      max = current > max ? current : max;
      System.out.println("Enter the second integer:");
      current = input.nextInt();
      max = current > max ? current : max;
      System.out.println("Enter the third integer:");
      current = input.nextInt();
      max = current > max ? current : max;
      System.out.println("Enter the fourth integer:");
      current = input.nextInt();
      max = current > max ? current : max;
      System.out.printf("The maximum is %d.", max);
      input.close();

      /* INPUT:
       * 42
       * 34
       * 12
       * 67
       * 
       * EXPECTED:
       * Enter the first integer:
       * Enter the second integer:
       * Enter the third integer:
       * Enter the fourth integer:
       * The maximum is 67.
       * 
       * INPUT:
       * 92
       * 34
       * 12
       * 67
       * 
       * EXPECTED:
       * Enter the first integer:
       * Enter the second integer:
       * Enter the third integer:
       * Enter the fourth integer:
       * The maximum is 92.
       */
   }
}