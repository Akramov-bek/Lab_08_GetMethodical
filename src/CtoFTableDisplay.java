public class CtoFTableDisplay {
    public static void main(String[] args)
    {

        // Table header
        System.out.printf("%-10s | %-10s%n", "Celsius", "Fahrenheit");
        System.out.println("---------------------------");

        // Loop from -100°C to 100°C
        for (int c = -100; c <= 100; c++) {
            double f = CtoF(c); // call the method
            System.out.printf("%-10d | %-10.2f%n", c, f);
        }
    }

    /**
     * Converts Celsius to Fahrenheit
     * Formula: F = C * 9/5 + 32
     * @param celsius the Celsius temperature
     * @return equivalent Fahrenheit temperature
     */
    public static double CtoF(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }
}
