import java.util.Scanner;

public class String_Letter_Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading a character and a sentence from the user on the same line
        System.out.print("Enter a character followed by a space and then a sentence: ");
        String input = scanner.nextLine();

        // Extracting the character and the sentence from the input
        char targetChar = input.charAt(0);
        String sentence = input.substring(2); // Assuming the character and space take the first two positions

        // Counting the occurrences of the character in the sentence
        int charCount = countCharacterOccurrences(targetChar, sentence);

        // Displaying the result
        System.out.println("The character '" + targetChar + "' occurs " + charCount + " times in the sentence.");
    }

    // Function to count the occurrences of a character in a string
    private static int countCharacterOccurrences(char target, String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                count++;
            }
        }
        return count;
    }
}
