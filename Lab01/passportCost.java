/* 
a program that calculates the cost of a NZ passport application based on user input. 
The program prompts the user to specify if they require a standard passport ('true')  
or an urgent passport ('false'), and if they need an child ('true') or adult ('false') passport. 
Passport costs:

Standard passport:
Adult passport: NZD$206.00 
Child passport: NZD$120.00 
Urgent passport:
Adult passport: NZD$412.00 
Child passport: NZD$326.00  
*/
import java.util.Scanner;
public class passportCost {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Is it a standard passport? 'true' for standard; 'false' for urgent:");
       int cost = 0;
       boolean standardUrgent = input.nextBoolean();
       System.out.println("Is it a child passport? 'true' for child; 'false' for adult:");
       boolean childAdult = input. nextBoolean();
       if(standardUrgent && childAdult){cost = 120;}
       else if(!standardUrgent && childAdult){cost = 326;}
       else if(standardUrgent && !childAdult){cost = 206;}
       else{cost = 412;}
       System.out.printf("The cost is $%d", cost);
       input.close();
       
       /* INPUT:
        * true
        * true
        * 
        * EXPECTED:
        * Is it a standard passport? 'true' for standard; 'false' for urgent:
        * Is it a child passport? 'true' for child; 'false' for adult:
        * The cost is $120
        *
        * INPUT:
        * true
        * false
        *
        * EXPECTED:
        * Is it a standard passport? 'true' for standard; 'false' for urgent:
        * Is it a child passport? 'true' for child; 'false' for adult:
        * The cost is $206
        *
        * INPUT:
        * false
        * false
        *
        * EXPECTED:
        * Is it a standard passport? 'true' for standard; 'false' for urgent:
        * Is it a child passport? 'true' for child; 'false' for adult:
        * The cost is $412
        */
   }
}