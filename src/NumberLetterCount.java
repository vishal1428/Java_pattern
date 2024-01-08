/* w3 - p1
* if the number 1 to 5 are written out in words: one, two , three, four, five , then there are 3+3+5+4+4 = 19 letters usd in total.
* if all the numbers rom x1 to x2 (1= x1 <= x2 <= 1000) inclusive were written out in words, how many letters would be used ? Write a program to find the count of letters given x1 and x2.
*
* Note: Do not count spaces or Hypens. for example, 342(three hundred and forty-two) contains 23 letters and 115 (one-hundred and fifteen ) contains 20 letters. The use of "and" when writing out numbers is in compliance with british usage.
*
* Input:
* Two integer X1 and X2 1<= x1 <= x2 <= 1000;
*
* output:
* A single digit number that will be the total number of letters when all numbers between X1 and X2 were written out in words.
*
* Example:
* input:
* 1 5
*
* output:
* 19
*
* */
import java.util.Scanner;

public class NumberLetterCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X1 and X2 (space-separated): ");
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();

        int totalLetters = 0;
        for (int i = x1; i <= x2; i++) {
            String wordRepresentation = getWordRepresentation(i);
            totalLetters += countLetters(wordRepresentation);
        }

        System.out.println("Total number of letters: " + totalLetters);
    }

    public static String getWordRepresentation(int number) {
        if (number == 1000) {
            return "onethousand";
        }

        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        int hundred = number / 100;
        int ten = (number % 100) / 10;
        int unit = number % 10;

        StringBuilder result = new StringBuilder();

        if (hundred > 0) {
            result.append(units[hundred]).append("hundred");
            if (ten > 0 || unit > 0) {
                result.append("and");
            }
        }

        if (ten == 1) {
            result.append(units[10 + unit]);
        } else {
            result.append(tens[ten]).append(units[unit]);
        }

        return result.toString();
    }

    public static int countLetters(String word) {
        return word.length();
    }
}
