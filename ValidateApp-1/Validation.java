
/**
 * This is the validation class that is linked with the main class or the validateApp class. This class has no main 
 * method and does not interacter with the user. In other words, this is the supplier class. This class returns two
 * boolean data types zip and ssn. This class only validates nothing else. Both methods in this class make use of the 
 * maches method from the regex class.  
 *
 * @author (Kemba Konteh)
 * @version (CSC142 01/29/18)
 */
public class Validation
{
    /**
     * This is the method that validates the zipcode. 
     *
     * @param  zip is passed in as the only parameter. Returns argument to the calling program.
     * 
     * @return    zip.matches("[0-9]+") && zip.length()==5 is being returned. Entries outside of this range will be false.
     */

    public static boolean validateZip(String zip){
        return (zip.matches("[0-9]+") && zip.length() == 5);  // Any entry that falls outside of this range will be false.
    }

    /**
     * This is the method that validates the SSN.
     *
     * @param  ssn is passed in as the only papameter. Returns argument to the calling program.
     * @return    ssn.matches("[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]") is returned. Anything outside range will be false. 
     */

    public static boolean validateSSN(String ssn){
        return ssn.matches("[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]");
    }

    
}
