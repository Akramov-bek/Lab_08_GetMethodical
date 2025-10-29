import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int birthYear = getRangedInt(scanner, "Enter the year of birth (1950-2015): ", 1950, 2015);
        int birthMonth = getRangedInt(scanner, "Enter the month of birth (1-12): ", 1, 12);
        int birthDay = getRangedInt(scanner, "Enter the day of birth: ", 1, 31); // Day validation might need further logic based on month
        int birthHours = getRangedInt(scanner, "Enter the hour of birth (1-24): ", 1, 24);
        int birthMinutes = getRangedInt(scanner, "Enter the minute of birth (1-59): ", 1, 59);

        System.out.println("Birth date and time:");
        System.out.println("Year: " + birthYear);
        System.out.println("Month: " + birthMonth);
        System.out.println("Day: " + birthDay);
        System.out.println("Time: " + String.format("%02d", birthHours) + ":" + String.format("%02d", birthMinutes));

        scanner.close();
    }

    public static int getRangedInt(Scanner scanner, String prompt, int min, int max) {
        int input;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                scanner.next();
                System.out.print(prompt);
            }
            input = scanner.nextInt();
        } while (input < min || input > max);
        return input;
    }
}
