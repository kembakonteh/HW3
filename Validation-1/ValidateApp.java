import java.util.Scanner;
/**
 * Write a description of class ValidateApp here.
 *
import java.util.Scanner;
 * @author (your name)
 * @version (a version number or a date)
 */
public class ValidateApp
{
    public static void main(String[]args){
        menu();
    }
    
    public static void menuDisplay(){
        System.out.println("Choose from the choice below:");
        System.out.println("1. validate zip code\n" +
            "2. validate SSN\n" +
            "3. instructions\n" +
            "0. quit\n");

    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            try{
                menuDisplay();
                int choice = Integer.parseInt(sc.nextLine());
                switch(choice){
                    case 1:
                        System.out.println("Please enter the zip-code");
                        String zipcode = sc.nextLine(); 
                        if(Validation.validateZip(zipcode)){
                            System.out.println("Zipcode is correct!");
                        }
                        else {
                            System.out.println("Zipcode is not correct.");
                        }
                        break;
                    case 2:
                        System.out.println("Please enter the SSN:");
                        String SSN = sc.nextLine(); 
                        if(Validation.validateSSN(SSN)){
                            System.out.println("SSN is correct!");
                        }
                        else{
                           System.out.println("SSN is not correct."); 
                        }
                        break;
                    case 3:
                        instructions();
                        break;
                    
                    case 0:
                        System.out.println("Thanks for using the program."); 
                        flag = false;
                        break;
                    default:
                        System.out.println("Please choose from 0 to 3");
                   
                }
            }
            catch(IllegalArgumentException e){
                if(e.getMessage().contains("For input string:")){
                    System.out.println("Incorrect option data type");
                }
                else{
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    
    public static void instructions(){
        System.out.println("Enter 2 if you want to validate your zip-code.");
        System.out.println("Enter 3 if you want to validate your ssn number.\n");
    }

}
