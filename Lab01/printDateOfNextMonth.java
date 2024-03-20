import java.util.*;
import java.time.*;
public class printDateOfNextMonth{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a date (yyyy-mm-dd):");
      LocalDate ld = LocalDate.parse(input.nextLine());
      System.out.println(ld.plusMonths(1).toString());
      input.close();
      /* INPUT:
       * 2021-12-18
       * 
       * EXPECTED:
       * Enter a date (yyyy-mm-dd):
       * 2022-01-18
       * 
       * INPUT:
       * 2021-10-09
       * 
       * EXPECTED:
       * Enter a date (yyyy-mm-dd):
       * 2021-11-09 
       */
  }
}