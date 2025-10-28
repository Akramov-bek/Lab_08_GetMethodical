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
            if (!retString.isEmpty())
            {

                System.out.println("You must enter at least one character. Please try again.");
            }
        }while(retString.isEmpty());
        return retString;
    }

    /**
     *
     * @param pipe   - Scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter
     * @return - any integer
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retInt = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print(prompt);
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                pipe.nextLine(); // consume newline
                done = true;
            } else // Not a number
            {
                trash = pipe.nextLine();
                System.out.println("Illegal number: " + trash + ". Please enter a valid number.");
            }
        } while (!done);

        return retInt;

    }
    /**
     * get any double from the user
     * @param pipe   - Scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter
     * @return - any double
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print(prompt);
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // consume newline
                done = true;
            } else // Not a number
            {
                trash = pipe.nextLine();
                System.out.println("Illegal number: " + trash + ". Please enter a valid number.");
            }
        } while (!done);

        return retVal;

    }
    /**
     * Read an integer within an inclusive range [low, high].
     * Repeats until the value is in range.
     *
     * @param pipe   - Scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter
     * @param low    - inclusive lower bound
     * @param high   - inclusive upper bound
     * @return - an integer within [low, high]
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print(prompt + " (" + low + "-" + high + "): ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine(); // consume newline
                if (retVal < low && retVal > high) {
                    System.out.println("Illegal number: " + retVal + ". Please enter a valid number.");
                } else {
                    done = true;
                }
            } else // Not a number
            {
                trash = pipe.nextLine();
                System.out.println("Illegal number: " + trash + ". Please enter a valid number.");
            }
        } while (!done);

        return retVal;
    }

    /**
     * Read an integer within an inclusive range [low, high].
     * Reuses getInt for validation of numeric input and repeats until the value is in range.
     *
     * @param pipe   - Scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter
     * @param low    - inclusive lower bound
     * @param high   - inclusive upper bound
     * @return - an integer within [low, high]
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print(prompt + " (" + low + "-" + high + "): ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // consume newline
                if (retVal < low || retVal > high)
                {
                    System.out.println("Your input is out of range. Please try again.");
                } else
                {
                    done = true;
                }
            } else // Not a number
            {
                trash = pipe.nextLine();
                System.out.println("Illegal number: " + trash + ". Please enter a valid number.");
            }
        } while (!done);

        return retVal;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String response = "";
        boolean retVal = false;
        boolean done = false;

        do {
            System.out.print(prompt + " (Y/N): ");
            response = pipe.nextLine().toUpperCase();
            if (response.equals("Y"))
            {
                retVal = true;
                done = true;
            }
            else if (response.equals("N"))
            {
                retVal = false;
                done = true;
            }
            else
            {
                System.out.println("Invalid response. Please enter Y or N.");
            }
        } while (!done);

        return retVal;
    }
}
