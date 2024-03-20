import java.util.Scanner;

public class usernameModifier{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a username:");
        String username = input.nextLine();
        int length = username.length();
        String digits = "";
        if(length == 6){digits = username.substring(3, 6);}
        else{digits = username.substring(4, 7);}
        int digitsAsInt = Integer.parseInt(digits);
        System.out.printf("%d", digitsAsInt + 1);
        input.close();
        /* INPUT:
         * akim161
         * 
         * EXPECTED:
         * Enter a username:
         * 162
         * 
         * INPUT:
         * eli923
         * 
         * EXPECTED:
         * Enter a username:
         * 924
         */
    }
}