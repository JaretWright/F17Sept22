package f17sept22;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class F17Sept22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Please enter your area code: ");
        Scanner keyboard = new Scanner(System.in);
        String userInput = keyboard.nextLine();
        
        System.out.printf("That is a%s area code%n", checkAreaCode(userInput)?
                                                    " valid" : "n invalid");
    }  
    
    public static boolean checkAreaCode(String areaCode)
    {
        return areaCode.matches("[2-9]\\d{2}");
    }
}
