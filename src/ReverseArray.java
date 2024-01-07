

/* User
jAVA PROGRAM TO GET A SIZE OF ARRAY AND PRINT THE REVERSE ORDER */

import java.util.Scanner;
public class ReverseArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Array in reverse order:");
        printReverseArray(array);
    }

    public static void printReverseArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
