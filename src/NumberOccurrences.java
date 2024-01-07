/*
Write a programme to accept N number of and I should print number of occurrence of each number.

SAMPLE INPUT:
5
10 20 30 10 10

OUTPUT:
10 3
20 1
30 1
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOccurrences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        printOccurrences(array);
    }

    public static void printOccurrences(int[] array) {
        Map<Integer, Integer> occurrencesMap = new LinkedHashMap<>();

        // Count occurrences
        for (int num : array) {
            occurrencesMap.put(num, occurrencesMap.getOrDefault(num, 0) + 1);
        }

        // Print occurrences
        System.out.println("Number Occurrences:");
        for (Map.Entry<Integer, Integer> entry : occurrencesMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
