import java.util.Scanner;

public class surfaceAreaOfCylinder{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder:");
        double radius = input.nextDouble();
        System.out.println("Enter the height of the cylinder:");
        double height = input.nextDouble();
        double surfaceArea = Math.PI * (Math.pow(radius, 2)) * height;
        System.out.printf("The surface area of the cylinder is %.2f.", surfaceArea);
        input.close();
        /* INPUT:
         * 3.5
         * 8.5
         * 
         * EXPECTED:
         * Enter the radius of the cylinder:
         * Enter the height of the cylinder:
         * The surface area of the cylinder is 327.12.
         * 
         * INPUT:
         * 5
         * 4
         * 
         * EXPECTED:
         * Enter the radius of the cylinder:
         * Enter the height of the cylinder:
         * The surface area of the cylinder is 314.16.
         */
    }
}