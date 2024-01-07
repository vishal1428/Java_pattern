/*
Write a program that reads a string a word in the string contains consecutive repeated characters then replace all the consecutive repeated characters by a numerical n followed by that repeating character where n is a number of times that character repeated


 */

import java.util.Scanner;

public class Wrap_it_out {
    public static void main(String...a) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String result = replaceConsecutiveRepeats(inputString);

        System.out.println("Modified String: " + result);
    }

    private static String replaceConsecutiveRepeats(String input) {
        StringBuilder modifiedString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int count = 1;

            while (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
                count++;
                i++;
            }

            if (count > 1) {
                modifiedString.append(count).append(currentChar);
            } else {
                modifiedString.append(currentChar);
            }
        }

        return modifiedString.toString();
    }
}
