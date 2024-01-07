import java.util.Scanner;

public class Assignment_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input M
        System.out.print("Enter the starting number (M): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input for M. Please enter a valid integer.");
            return;
        }
        int m = scanner.nextInt();

        // Input N
        System.out.print("Enter the ending number (N): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input for N. Please enter a valid integer.");
            return;
        }
        int n = scanner.nextInt();

        // Check if inputs are correct
        if (m > n) {
            System.out.println("Invalid input. M should be less than or equal to N.");
            return;
        }

        // Print prime numbers between M and N
        System.out.print("Prime numbers between " + m + " and " + n + ": ");
        boolean isFirstPrimePrinted = false;
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                if (isFirstPrimePrinted) {
                    System.out.print(",");
                } else {
                    isFirstPrimePrinted = true;
                }
                System.out.print(i);
            }
        }

        scanner.close();
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}



/* import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input N
        System.out.print("Enter the value for N: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input for N. Please enter a valid integer.");
            return;
        }
        int n = scanner.nextInt();

        // Check if input is greater than zero
        if (n <= 0) {
            System.out.println("Invalid input. N should be greater than zero.");
            return;
        }

        // Print Fibonacci series up to N terms
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }

    // Function to calculate Fibonacci number at a given position
    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
*/