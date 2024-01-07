

import java.util.HashMap;
import java.util.Scanner;

public class AnagramChecker {

    public static boolean isAnagram(String str1, String str2) {
        HashMap<Character, Integer> charCounts = new HashMap<>();

        // Create a normalized string with only alphanumeric characters
        String normalizedStr1 = normalizeString(str1);
        String normalizedStr2 = normalizeString(str2);

        // Count character frequencies in the first normalized string
        for (char c : normalizedStr1.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Decrement counts for characters in the second normalized string
        for (char c : normalizedStr2.toCharArray()) {
            if (!charCounts.containsKey(c) || charCounts.get(c) == 0) {
                return false; // Character not found or count is zero
            }
            charCounts.put(c, charCounts.get(c) - 1);
        }

        // Check if all counts have become zero
        for (int count : charCounts.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    private static String normalizeString(String str) {
        return str.toLowerCase().replaceAll("[^a-z0-9]", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine()      ;//"Rome wasn't built in a day!";
        String str2 =    sc.nextLine()    ; //"But laid in two years, man.";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " is an anagram of " + str2);
        } else {
            System.out.println(str1 + " is not an anagram of " + str2);
        }
    }
}
