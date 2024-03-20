import java.util.*;
public class Lab01 {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a word:");
      String word = input.nextLine();
      StringBuilder sb1 = new StringBuilder(word);
      StringBuilder sb2 = new StringBuilder(word);
      sb1.append(sb2.reverse());
      System.out.printf("The secret code is '%s'.",sb1.toString());
      /* INPUT:
       * hello
       * 
       * EXPECTED:
       * Enter a word:
       * The secret code is 'helloolleh'
       * 
       * INPUT:
       * two
       * 
       * EXPECTED:
       * Enter a word:
       * The secret code is 'twoowt'
       * 
       * INPUT:
       * four
       * 
       * EXPECTED:
       * Enter a word:
       * The secret code is 'fourruof'
       */
  }
}