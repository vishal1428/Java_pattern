/*
arjit like to play with numbers. Once he decided to play a switching game. He had an array of numbers in the index of element is one of the prime factors of that element he wants to replace the element with the index itself. write the java program

First line contains size of array (2<=size<=100)

input:
6
12 11 4 8 4 10

output:
2
12 11 2 8 4 5


 */

import java.util.Scanner;

public class SwitchingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (isPrimeFactor(arr[i], i)) {
                arr[i] = i;
                count++;
            }
        }

        System.out.println(count);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static boolean isPrimeFactor(int number, int factor) {
        if (factor <= 1) { // Exclude 1 and negative factors
            return false;
        }

        return number % factor == 0 && isPrime(factor);
    }

    public static boolean isPrime(int num) {
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
