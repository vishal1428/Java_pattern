/* Unique Words assignment w3 -p1 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int uniqueWordCount = countUniqueWordsWithAnagrams(str);
        System.out.println( uniqueWordCount);
    }

    public static int countUniqueWordsWithAnagrams(String str) {
        Map<String, Integer> wordCounts = new HashMap<>();
        StringBuilder word = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                word.append(Character.toLowerCase(c)); // Convert to lowercase
            } else if (word.length() > 0) {
                String normalizedWord = word.toString().trim(); // Remove leading/trailing spaces
                String sortedWord = sortString(normalizedWord); // Sort characters to group anagrams

                wordCounts.put(sortedWord, wordCounts.getOrDefault(sortedWord, 0) + 1);
                word = new StringBuilder(); // Reset for the next word
            }
        }

        // Add the last word if any
        if (word.length() > 0) {
            String normalizedWord = word.toString().trim(); // Remove leading/trailing spaces
            String sortedWord = sortString(normalizedWord); // Sort characters to group anagrams

            wordCounts.put(sortedWord, wordCounts.getOrDefault(sortedWord, 0) + 1);
        }

        return wordCounts.size(); // Return the total count of unique words
    }

    private static String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars); // Sort the characters
        return new String(chars);
    }
}
