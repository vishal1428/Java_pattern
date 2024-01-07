import java.util.Scanner;
public class automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;

        // Convert the number and its square to strings
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);

        // Check if the square ends with the original number
        if (squareStr.endsWith(numStr)) {
            System.out.println(num + " is an Automorphic number.");
        } else {
            System.out.println(num + " is not an Automorphic number.");
        }


    }
}
