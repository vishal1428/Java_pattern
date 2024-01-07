/*
WRITE A PROGRAM THAT TAKES N NUMBERS AS INPUT
Find the average of the area and the number of elements that are above the average.

input:
4
74 21 55 96

output:
61
74 96
 */

import java.util.Scanner;

public class AverageAndAbove {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of numbers: ");
        int numNumbers = scanner.nextInt();

        int[] numbers = new int[numNumbers];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < numNumbers; i++) {
            numbers[i] = scanner.nextInt();
        }

        int average = calculateAverage(numbers);
        int aboveAverageCount = countAboveAverage(numbers, average);

        System.out.println("Average: " + average);
        System.out.println("Numbers above average: " + aboveAverageCount);

        // Print elements above average
        System.out.print("Elements above average: ");
        for (int num : numbers) {
            if (num > average) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // Add a newline at the end
    }

    public static int calculateAverage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static int countAboveAverage(int[] numbers, int average) {
        int count = 0;
        for (int num : numbers) {
            if (num > average) {
                count++;
            }
        }
        return count;
    }
}
