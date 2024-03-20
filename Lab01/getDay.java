import java.util.*;
import java.time.*;
public class getDay {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a date (yyyy-mm-dd):");
      String date = input.nextLine();
      LocalDate ld = LocalDate.parse(date);
      System.out.printf("The day of '%s' is: %s", date, ld.getDayOfWeek());
      /* INPUT:
       * 2021-12-18
       * 
       * EXPECTED:
       * Enter a date (yyyy-mm-dd):
       * The day of '2021-12-18' is: SATURDAY
       * 
       * INPUT:
       * 2021-10-09
       * 
       * EXPECTED:
       * Enter a date (yyyy-mm-dd):
       * The day of '2021-10-09' is: SATURDAY
       */
  }
}