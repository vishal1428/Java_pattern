import java.util.Scanner;

public class Assignment_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter the number: ");
        long n = scanner.nextLong();

        // Calculate the sum of factors
        long sum = calculateSumOfFactors(n);

        // Print the result
        System.out.println("Sum of factors of " + n + " is: " + sum);

        scanner.close();
    }

    // Function to calculate the sum of factors for a given number
    private static long calculateSumOfFactors(long n) {
        long sum = 0;

        // Iterate through numbers from 1 to the given number
        for (long i = 1; i <= n; i++) {
            if (n % i == 0) {
                // If i is a factor, add it to the sum
                sum += i;
            }
        }

        return sum;
    }
}


