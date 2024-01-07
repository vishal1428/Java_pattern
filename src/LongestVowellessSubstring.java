import java.util.Scanner;

public class LongestVowellessSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking a string as input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Finding the longest vowelless substring
        String longestVowellessSubstring = findLongestVowellessSubstring(inputString);

        // Displaying the result
        System.out.println("Longest vowelless substring: " + longestVowellessSubstring);
    }

    // Function to find the longest vowelless substring
    private static String findLongestVowellessSubstring(String str) {
        int maxLength = 0;
        int currentLength = 0;
        int start = 0;
        int currentStart = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                currentLength = 0;
                currentStart = i + 1;
            } else {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    start = currentStart;
                }
            }
        }

        return str.substring(start, start + maxLength);
    }

    // Function to check if a character is a vowel
    private static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}
