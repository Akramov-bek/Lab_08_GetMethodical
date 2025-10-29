import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCost = 0.0;

        boolean moreItems = true;

        while (moreItems) {
            double itemPrice = SafeInput.getRangedDouble(scanner, "Enter the price of the item", 0.50, 10.00);
            totalCost += itemPrice;

            moreItems = SafeInput.getYNConfirm(scanner, "Do you have more items to add?");
        }

        System.out.printf("Total cost of items: $%.2f", totalCost);
    }
}
