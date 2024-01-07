import java.util.Scanner;

public class Vowel_counter {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String inputString = a.nextLine();

        String output = countNformat(inputString);

        System.out.println(output);
    }

    private static String countNformat(String input) {
        int[] vowelCount = new int[100]; // #Note - Out of Bound Error in Array Length

        for (char ch : input.toLowerCase().toCharArray()) {
            if ("aeiou".contains(Character.toString(ch))) {
                vowelCount[ch - 'a']++;
            }
        }

        StringBuilder output = new StringBuilder();

        for (char vowel : "aeiou".toCharArray()) {
            int index = vowel - 'a';
            int count = vowelCount[index];

            output.append(vowel).append(count).append(" ");
        }

        return output.toString().trim();
    }
}
