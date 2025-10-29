import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ssnPattern = "^\\d{3}-\\d{2}-\\d{4}$";
        String ssn = SafeInput.getRegExString(scanner, "Enter your SSN (e.g. 123-45-6789)", ssnPattern);

        String ucMNumberPattern = "^(M|m)\\d{5}$";
        String ucMNumber = SafeInput.getRegExString(scanner, "Enter your UC Student M number (e.g. M12345)", ucMNumberPattern);

        String menuChoicePattern = "^[OoSsVvQq]$";
        String menuChoice = SafeInput.getRegExString(scanner, "Enter a menu choice [O, S, V, or Q] using pattern", menuChoicePattern);

        System.out.println("SSN: " + ssn);
        System.out.println("UC Student M Number: " + ucMNumber);
        System.out.println("Menu Choice: " + menuChoice);
    }
}
