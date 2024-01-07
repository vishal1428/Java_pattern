/*
User
here is an program for Unique Average, Given an array of integers find the average of all the elements counting only the unique occurrences of each element this means that if an element occurs multiple time then you must only use it only once while calculating the average.
Input Specification:
First like will contain 'n' Indicating the size of the array.
output: The integer average of all the elements counting only the unique occurrences

smaple Input:
4
1 1 2 3

output:
2
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int uniqueAverage = calculateUniqueAverage(array);
        System.out.println("Unique Average: " + uniqueAverage);
    }

    public static int calculateUniqueAverage(int[] array) {
        Set<Integer> uniqueElements = new HashSet<>();

        int sum = 0;
        for (int element : array) {
            if (uniqueElements.add(element)) {
                // If the element is unique, add it to the set and sum
                sum += element;
            }
        }

        // Calculate and return the unique average
        return sum / uniqueElements.size();
    }
}
