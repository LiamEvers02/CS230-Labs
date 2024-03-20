import java.util.Scanner;

public class findASCII{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.nextLine();
        char firstChar = word.charAt(0);
        System.out.printf("The ASCII code of \'%c\' is: %d", firstChar, (int)firstChar);
        input.close();
        /* INPUT:
         * andrew
         * 
         * EXPECTED:
         * Enter a word:
         * The ASCII code of 'a' is: 97
         */
    }
}