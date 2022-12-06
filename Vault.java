/**
 * This is a project to simulate a vault. 
 *
 * @author Patrick Zhou
 * @version v1.0.0
 */

public class Vault {
    // declare and initialize instance variables. (pw for password), (attemptct for attempt count)
    private String pw;
    private int attemptct=0;
    // constructor for Vault
    public Vault(String psstr) {
        pw = psstr;
    }
    // tostring method to gethint
    public String getHint(String psstr) {
        // initialize local variables for a return string and a boolean that checks whether a character exists
        String returnstring="";
        boolean exists;
        // check if the number of attempts is used
        if (attemptct!=6) {
            // iterate through the passed string
            for (int i=0;i<psstr.length();i++) {
                // check whether or not the passed string character index equals password index character
                if (psstr.charAt(i)==pw.charAt(i)) {
                    // add if this is true
                    returnstring+=psstr.charAt(i);
                } else {
                    // if it does not equal, check whether character exists by iterating through password
                    exists=false;
                    for (int j=0;j<pw.length();j++) {
                        // checking code
                        if (psstr.charAt(i)==pw.charAt(j)) {
                            exists=true;
                        }
                    }
                    // if it exists, use exclamation mark for missplaced
                    // if it doesn't exist, use hashtag if it does not exist at all.
                    if (exists) {
                        returnstring+="!";
                    } else {
                        returnstring+="#";
                    }
                }
            }
            // increment attempt count
            attemptct++;
        } else {
            // code for if there are too many attempts. 
            returnstring="Too many attempts. ";
        }
        // returning the result. 
        return returnstring;
    }
}