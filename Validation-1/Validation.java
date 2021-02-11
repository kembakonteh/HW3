
/**
 * Write a description of class Validation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Validation
{
    public static boolean validateZip(String zip){
        if(zip.matches("[0-9]+") && zip.length() == 5)
            return true;
        else{
            return false;
        }
    }
    
    public static boolean validateSSN(String ssn){
        if(ssn.matches("[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]"))
            return true;
        else{
            return false;
        }
    }
    
}
