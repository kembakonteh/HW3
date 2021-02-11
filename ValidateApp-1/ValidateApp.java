import java.util.Scanner;
/**
 * This homework is designe to help teach about the implementation of control structures. It demonstartes, using an 
 * interactive menu of choices or commands that communicates with the user, by using standard input and output 
 * (System.in and System.out) using the scanner class. The program begins by displaying a menu choice to the user 
 * and tells the user to choose one from the display. Depending on what the user chooses, the program will then futher 
 * ask the user to enter either zip code or SSN. The program will then varfy if the entry is correct or not. 
 * The user is given clear instructions on how many digits to enter, depending on what he/she chose. If it is a zip code,
 * for instance, user cannot enter no more than 5 digit numbers or less (zip code has to be 5 digit numbers), otherwise 
 * the program will throw an error message instructing the user to try again with the menu displayed at every trial. 
 * likewise the program cannot take letters. If a user enters a letter it will show an error message.
 *
 * @author (Kemba Konteh)
 * @version (CSC142 01/29/18)
 * 
 */
public class ValidateApp
{
    public static void main(String[]args){
        menu();    // The menu method calls all the other methods created in this program. 
    }
    
    /**
     * This is the method that displays the menu choices to the user. As soon as the program is run, the menu choices
     * will be displayed asking the user to choice. 
     *
     * @param  This method does not take any parameter.
     * @return    The method does not return anything.
     */

    public static void menuDisplay(){
        System.out.println("Choose from the choice below:");
        System.out.println("1. Validate zip code\n" +
            "2. Validate SSN\n" +
            "3. Instructions\n" +
            "4. Validate email\n" +
            "0. Quit\n");

    }
    
    /**
     * This is the method that continues to display the menu as long as the user pays heed to the instructions
     * and enters a valid entry. Inside this method is a boolean statement/variable flag with a while loop that makes sure 
     * that the user enters only a number. The program will continue as long as flag variable is true.The program will
     * show an error message if the user enters a letter. The switch statements in the while loop is used for the multi-
     * ple way selection. Since user has three different choices to choose from, the switch statement helps to switch 
     * from one case to the other. If user makes a selection that is not being specified in the instructions, the 
     * program will jump to the "default" switch statement and shows a message telling user to try again. Every switch
     * case is asigned a specific actions, case 1,2,3,and 0.
     *
     * @param  No parameter
     * @return    No return
     */

    public static void menu(){
        Scanner sc = new Scanner(System.in);   // instantiate scanner object with the new keyword. Please note that
                                               // had to import imprt java.util.scanner 
        boolean flag = true;
        while(flag){
            //try{//
            menuDisplay();
            while(!sc.hasNextInt()){      // This reads and throws away any entry from user that is not a digit number.
                System.out.println("Errors");
                sc.next();
            }
            int choice = sc.nextInt(); 
            switch(choice){
                case 1: // This is case 1 of the switch statement. This is what displays when user chose 1 for zipcode
                System.out.println("Please enter the zip-code, must be 5 digits:");
                String zipcode = sc.next(); 
                if(Validation.validateZip(zipcode)){  // validates zipcode. If wrong zipcode entered, else statement 
                                                      // will be executed.
                    System.out.println("Zipcode is correct!");
                }
                else {
                    System.out.println("Zipcode is not correct,must be 5 digit (numbers), please try again:");
                }
                break;
                case 2:  // This is case 2 of the switch statement. This is what is diplayed when user chose 2 for SSN
                System.out.println("Please enter the SSN:");
                String SSN = sc.next(); 
                if(Validation.validateSSN(SSN)){  // This validates the SSN. If correct, it will be read if not 
                                                  // the else statement will execute.
                    System.out.println("SSN is correct!");
                }
                else{
                    System.out.println("SSN is not correct."); 
                }
                break;
                case 3:   // This is case 3 of the switch statement. This is what is displayed when user enters 3 
                          // 3 for instructions
                instructions();
                break;

                case 0:   // This is case 0 of the switch statement. The program ends when user chose this option and 
                          // and a "Than you for using this program" message is shown.
                System.out.println("Thanks for using the program."); 
                flag = false;
                break;
                default:  // This is the default switch statement that is executed when the user chooses and invalid
                          // that is not shown on the menu.
                System.out.println("Please try again, zip code must be at least 5 digits and not more.");

            }

        }
    }
    
    /**
     * This is the method that displays the instructions to the user. It tells the user how many digit numbers they can
     * type for each case zip code or SSN and in the format they should be, for SSN. 
     *
     * @param  No parameter
     * @return    Method does not return anything.
     */
    
    public static void instructions(){
        System.out.println("Here are the instructions you need to validate you zip code and SSN.\n");
        System.out.println("Zip code needs to be 5 digit numbers.\n");
        System.out.println("The SSN needs to be 9 digit numbers in the following format:\n xxx-xx-xxxx\n");
        

    }

}
