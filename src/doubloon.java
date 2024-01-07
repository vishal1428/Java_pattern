import java.util.Scanner;

public class doubloon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a word: ");
            String input = sc.nextLine();
            if (isDoubloon(input)) {
                System.out.println("True, This is a doubloon");
            } else {
                System.err.println("False, This is not a doubloon");
            }
        }

        sc.close();
    }

    // checks if every letter appears exactly twice in a word
    public static boolean isDoubloon(String s) {
        String l = s.toLowerCase();

        for (int i = 0; i < l.length(); i++) {
            char currentChar = l.charAt(i);
            int count = 0;

            for (int j = 0; j < l.length(); j++) {
                if (currentChar == l.charAt(j)) {
                    count++;
                }
            }

            if (count != 2) {
                return false;
            }
        }

        return true;
    }
}
