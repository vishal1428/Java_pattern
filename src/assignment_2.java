import java.util.Scanner;
public class assignment_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter the second number (b): ");
        int b = sc.nextInt();

        boolean result = checkValues(a, b);

        System.out.println("Result: " + result);

    }

    static boolean checkValues(int a, int b) {
        return (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6);
    }
}
