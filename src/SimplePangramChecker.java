import java.util.Scanner;

public class SimplePangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading a line from the user
        System.out.print("Enter a line to check for pangram: ");
        String input = scanner.nextLine();

        // Checking if the line is a pangram
        boolean isPangram = checkPangram(input);

        // Displaying the result
        if (isPangram) {
            System.out.println("The line is a pangram.");
        } else {
            System.out.println("The line is not a pangram.");
        }
    }

    // Function to check if a line is a pangram
    private static boolean checkPangram(String line) {
        // Converting the line to lowercase
        String lowercaseLine = line.toLowerCase();

        // Checking if all letters are present
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (lowercaseLine.indexOf(letter) == -1) {
                return false;
            }
        }

        return true;
    }
}
