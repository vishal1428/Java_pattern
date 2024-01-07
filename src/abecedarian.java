import java.util.Scanner;

public class abecedarian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter strings separated by commas: ");
        String inputLine = scanner.nextLine();
        String[] inputs = inputLine.split(","); // Split input by commas

        if (inputs.length != n) {
            System.out.println("Number of inputs does not match the specified count.");
            scanner.close();
            return;
        }

        for (int i = 0; i < inputs.length; i++) {
            String input = inputs[i].trim(); // trim to remove leading/trailing whitespaces

            if (isAbecedarian(input)) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }

            // Insert a comma after each print except for the last one
            if (i < inputs.length - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }

    private static boolean isAbecedarian(String str) {
        str = str.toLowerCase(); // Convert to lowercase for case-insensitive comparison

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                return false; // If any character is greater than the next one, it's not abecedarian
            }
        }

        return true; // If all characters are in ascending order, it's abecedarian
    }
}
