import java.util.Scanner;

public class NumberLetterCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        int letterCount = countLetters(start, end);
        System.out.println("Total number of letters: " + letterCount);
    }

    public static int countLetters(int start, int end) {
        String[] numbers = new String[]{"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = new String[]{"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i < 20) {
                count += numbers[i].length();
            } else if (i < 100) {
                count += tens[i / 10].length();
                if (i % 10 != 0) {
                    count += numbers[i % 10].length() + 3; // Add "- " for hyphen and space
                }
            } else if (i == 100) {
                count += numbers[i].length();
            } else {
                System.out.println("Numbers above 100 are not supported.");
                return -1; // Indicate error
            }
        }

        return count;
    }
}
