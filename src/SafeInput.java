import java.util.Scanner;

public class SafeInput
{
    /**
     * Get a non-zero length string from the user
     * @param pipe - Scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter
     * @return - a non-empty String
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do {
            System.out.print(prompt);
            retString = pipe.nextLine();
            if (retString.isEmpty())
            {

                System.out.println("You must enter at least one character. Please try again.");
            }
        }while(retString.isEmpty());
        return retString;
    }
}
