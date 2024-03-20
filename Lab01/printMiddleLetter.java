import java.util.Scanner;

public class printMiddleLetter{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.nextLine();
        int middlePos = word.length() / 2;
        char result = word.charAt(middlePos);
        System.out.println(String.valueOf(result).toUpperCase());
        input.close();
        /* INPUT:
         * input
         * 
         * EXPECTED:
         * Enter a word:
         * P
         * 
         * INPUT:
         * fun
         * 
         * EXPECTED:
         * Enter a word:
         * U
         * 
         * INPUT:
         * good
         * 
         * EXPECTED:
         * Enter a word:
         * O
         */
    }
}