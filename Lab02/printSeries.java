/* Write a program that prompts the user to input an integer i. 
Then, print the value of the following series up to 5 decimal places, 
where i specifies the number of terms in the series. The series is as follows:
1/1+1/3+1/5+...+1/(i∗2−1) */
import java.util.Scanner;
public class Lab02 {
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number:");
	double number = input.nextInt();
	double seriesSum = 0;
	for(double i = 1; i <= number; i++){
	    seriesSum += (1 / (i*2-1));
	}
	System.out.printf("The sum of this series is %.5f.", seriesSum);
    }
}