import java.util.Scanner;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading a string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Capitalizing the first letter of each word
        String result = capitalizeFirstLetter(input);

        // Displaying the result
        System.out.println("Result: " + result);
    }

    // Function to capitalize the first letter of each word in a string
    private static String capitalizeFirstLetter(String input) {
        StringBuilder result = new StringBuilder();

        // Splitting the input into words
        String[] words = input.split("\\s+");

        // Capitalizing the first letter of each word
        for (String word : words) {
            if (!word.equals(word.toUpperCase())) {
                // If the word is not already in uppercase
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
            } else {
                // If the word is already in uppercase
                result.append(word);
            }

            result.append(" "); // Adding space between words
        }

        // Trimming the trailing space and returning the result
        return result.toString().trim();
    }
}
