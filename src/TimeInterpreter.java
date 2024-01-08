/* W3-p1 */

import java.util.Scanner;

public class TimeInterpreter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the);
        int numTimes = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numTimes; i++) {
          //   System.out.print("Enter the time (HH:MM): ");
            String timeString = scanner.nextLine();

            if (timeString.isEmpty()) {
                System.out.println("Invalid input: Time cannot be empty.");
                continue;
            }

            String[] timeParts = timeString.split(":");
            int hours = Integer.parseInt(timeParts[0]);
            int minutes = Integer.parseInt(timeParts[1]);

            String interpretation = interpretTime(hours, minutes);
            System.out.println(interpretation);
        }
    }

    public static String interpretTime(int hours, int minutes) {
        // Handle hours
        String hourString = getHourString(hours);

        // Handle minutes
        if (minutes == 0) {
            return hourString + " o' clock";
        } else if (minutes == 1) {
            return "One minute past " + hourString; // Use "One" for 1 minute
        } else

        if (minutes == 15) {
            return

                    "quarter past " + hourString;
        } else

        if (minutes == 30) {
            return

                    "half past " + hourString;
        } else

        if (minutes == 45) {
            return

                    "quarter to " + getHourString(hours + 1);
        } else if (minutes < 30) {
            return minutes + " minutes past " + hourString; // Keep as number for other minutes
        } else {
            int remainingMinutes = 60 - minutes;
            return remainingMinutes + " minutes to " + getHourString(hours + 1);
        }
    }

    private static String getHourString(int hours) {
        switch (hours) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            default:
                return ""; // Should not happen due to constraints
        }
    }
}
