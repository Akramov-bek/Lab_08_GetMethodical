import java.util.Scanner;

/**
 * DevTest class to test input methods
 * @author Avazbek Akramov akramoak@mail.uc.edu
 */

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 /*

        // Test getNonZeroLenString
        String name = getNonZeroLenString(in, " Please enter your name: ");
        System.out.println("Hello, " + name + "!");

        // 2nd test for Library
        name = SafeInput.getNonZeroLenString(in, "Enter your name: ");
        System.out.println("Hello, " + name + "!");
*/
 /*
        double salary = getDouble(in, "Enter your salary: ");
        System.out.println("Your salary is: " + salary);

        double salary = SafeInput.getDouble(in, "Enter your salary: ");
        System.out.println("Your salary is: " + salary);

        double price = getRangedDouble(in, "Enter the price: ", .01, 10.01);
        System.out.println("The price is: " + price);

        price = SafeInput.getRangedDouble(in, "Enter the price: ", 0, 10);
        System.out.println("The price is: " + price);


        int favNum = getRangedInt(in, "Enter your fave num", 1, 10);
        System.out.println("Your fav num is: " + favNum);

        int faveNum = SafeInput.getRangedInt(in, "Enter your fave num", 1, 10);
        System.out.println("Your fav num is: " + favNum);

        boolean confirm = getYNConfirm(in, "Do you want to continue?");
        System.out.println("User confirmation: " + confirm);

        // 2nd test for Library
//        confirm = SafeInput.getYNConfirm(in, "Do you want to continue?");
//        System.out.println("User confirmation: " + confirm);
*/
        String email = getRegExString(in, "Enter your email: ", "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        System.out.println("Your email is: " + email);

//        // 2nd test for Library
//        email = SafeInput.getRegExString(in, "Enter your email: ", "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
//        System.out.println("Your email is: " + email);




    }
    // Method defs go here

    /**
     * @param pipe   - Scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter
     * @return - a non-empty String
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print(prompt);
            retString = pipe.nextLine();
            if (retString.isEmpty()) {
                System.out.println("You must enter at least one character. Please try again.");
            }
        } while (retString.isEmpty());

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
     * any double from the user
     * @param pipe   - Scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter
     * @return - any double
     */
    public static double getDouble(Scanner pipe, String prompt) {
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
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
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

    /**
     * Get a double with a specified range
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

    /**
     * Get a yes/no confirmation from the user
     *
     * @param pipe   - Scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter
     * @return - true for Y/y, false for N/n
     */
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
    /**
     * Get a string that matches the provided regular expression
     *
     * @param pipe   - Scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter and the RegEx
     * @param regEx  - regular expression the input must match
     * @return - a string that matches the regular expression
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retString = "";
        boolean done = false;

        do {
            System.out.print(prompt + "[" + regEx +"] : ");
            retString = pipe.nextLine();
            if (retString.matches(regEx))
            {
                done = true;
            }
            else
            {
                System.out.println("Your input does not match the required format: " + regEx + " Please try again.");
            }
        } while (!done);

        return retString;
    }
}