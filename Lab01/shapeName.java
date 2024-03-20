/*  
 a program that prompts the user to enter the number of sides
 of a geometric shape and determines the name of the shape from 
 its number of sides. Your program should print the appropriate 
 name as part of a meaningful message and should support shapes 
 with anywhere from 3 up to (and including) 10 sides. If a number 
 of sides outside of this range is entered then your program should 
 display an appropriate error message  
 */
import java.util.Scanner;
public class shapeName{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of sides:");
		int sides = input.nextInt();
		String shape = "";
		switch(sides){
		    case 3:
		        shape = "triangle";
		        break;
		    case 4:
		        shape = "quadrilateral";
		        break;
		    case 5:
		        shape = "pentagon";
		        break;
		    case 6:
		        shape = "hexagon";
		        break;
		    case 7:
		        shape = "heptagon";
		        break;
		    case 8:
		        shape = "octagon";
		        break;
		    case 9:
		        shape = "nonagon";
		        break;
		    case 10:
		        shape = "decagon";
		        break;
		        
		}
		if(sides > 2 && sides < 11){System.out.printf("The number of sides is %d and it is a %s.", sides, shape);}
		else{System.out.println("That number of sides is not supported by this program.");}
        input.close();
        /* INPUT:
         * 3
         * 
         * EXPECTED:
         * Enter the number of sides:
         * The number of sides is 3 and it is a triangle.
         * 
         * INPUT:
         * 10
         * 
         * EXPECTED:
         * Enter the number of sides:
         * The number of sides is 10 and it is a decagon.
         * 
         * INPUT:
         * 0
         * 
         * EXPECTED:
         * Enter the number of sides:
         * That number of sides is not supported by this program.
         * 
         * INPUT:
         * 8
         * 
         * EXPECTED:
         * Enter the number of sides:
         * The number of sides is 8 and it is a octagon.
         */
	}
}