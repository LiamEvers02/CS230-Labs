import java.util.Scanner;

public class moneyConverter{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter NZD:");
        double NZD = input.nextDouble();
        double convRate = 1 / 1.0654;
        System.out.printf("%.1f NZD is equivalent to %.1f AUD.", NZD, NZD * convRate);
        input.close();
        /* INPUT:
         * 55.52
         * 
         * EXPECTED:
         * Enter NZD:
         * 55.5 NZD is equivalent to 52.1 AUD.
         * 
         * INPUT:
         * 99.95
         * 
         * EXPECTED:
         * Enter NZD:
         * 100.0 NZD is equivalent to 93.8 AUD.
         * 
         */
    }
}