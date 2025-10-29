public class PrettyHeader
{
    public static void main(String[] args) {
        createPrettyHeader("Message Centered Here");
    }

    public static void createPrettyHeader(String message) {
        int width = 60;
        int messageLength = message.length();
        int padding = (width - 3 - messageLength) / 2; // Calculate the padding for centering the message

        // Top line of stars
        printStars(width);

        // Middle line with the message centered
        System.out.print("***");
        printSpaces(padding);
        System.out.print(message);
        printSpaces(width - 3 - messageLength - padding);
        System.out.println("***");

        // Bottom line of stars
        printStars(width);
    }

    public static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
}
