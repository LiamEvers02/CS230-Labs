/* Write a program that prompts the user to enter a word. The program calculates the number of consonants in the word and displays the total. */
import java.util.Scanner;
public class Lab02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next().toLowerCase();
        String consonants = "bcdfghjklmnpqrstvwxyz";
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            if(consonants.contains(String.valueOf(word.charAt(i)))){
                count++;
            }
        }
        System.out.printf("The number of consonants is %d.", count);
    }
}