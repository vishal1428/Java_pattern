/*
Get in a airy size and elements and replace the even numbers in the array by corresponding index value


 */

import java.util.Scanner;

public class ReplaceEvenWithIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        replaceEvenWithIndex(array);

        System.out.println("Array after replacing even numbers with corresponding indices:");
        printArray(array);
    }

    public static void replaceEvenWithIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = i;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
