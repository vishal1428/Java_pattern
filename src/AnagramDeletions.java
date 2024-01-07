import java.util.HashMap;

public class AnagramDeletions {

    public static void minDeletionsAndPrintChars(String str1, String str2) {
        HashMap<Character, Integer> charCounts = new HashMap<>();
        StringBuilder sb1 = new StringBuilder(str1); // Create sb1 with str1's content
        StringBuilder sb2 = new StringBuilder();
        int deletions = 0;

        // Count character frequencies in str1
        for (char c : str1.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Decrement counts for characters in str2, counting deletions
        for (char c : str2.toCharArray()) {
            if (charCounts.containsKey(c) && charCounts.get(c) > 0) {
                charCounts.put(c, charCounts.get(c) - 1);
                sb2.append(c);
            } else {
                deletions++;
            }
        }

        // Remove remaining characters from sb1 that need deletion
        for (char c : charCounts.keySet()) {
            for (int i = 0; i < charCounts.get(c); i++) {
                sb1.deleteCharAt(sb1.lastIndexOf(Character.toString(c))); // Convert char to String
                deletions++;
            }
        }

        // Print the characters to be removed and the count
        System.out.println(sb1.toString() + " " + sb2.toString() + " " + deletions);
    }

    public static void main(String[] args) {
        String str1 = "cde";
        String str2 = "abc";
        minDeletionsAndPrintChars(str1, str2);
    }
}
