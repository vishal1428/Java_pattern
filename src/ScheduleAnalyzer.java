/*
Shivani does scheduling for ignite training program she wants to optimize the schedule for coming week in a way that all batches get same number of lab and Zone hours.

Thought that she has to find out count of lab hours and zone hours each badge is getting a day

Input sepcs:
The first line will contain name of batch.
Second line in container string having 40 characters( L for Labs, Z for zones, S for sessions) Assuming eight hours in a day and five days in a week.

output specs:
batch name
Day once count of lab hours and zone hours for that batch.
Print "Inavlid Input" if input is inavlid

SAMPLE INPUT:
A3
        LLLLSSZZZZSSLLLLLLLLSSZZZZSSLLLLLLLLSSZZ

OUTPUT:
A3
Monday: 4L 2Z
Wednesday: 4L 2Z
Tuesday: 4L 2Z
Friday: 4L 2Z
Thrusday: 4L 2Z
*/
public class ScheduleAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the batch name: ");
        String batchName = scanner.nextLine();

        System.out.print("Enter the schedule string (40 characters): ");
        String scheduleString = scanner.nextLine();

        if (scheduleString.length() != 40) {
            System.out.println("Invalid Input");
            return;
        }

        batchName = batchName.substring(0,2);

        int[] labHoursPerDay = new int[5];
        int[] zoneHoursPerDay = new int[5];
        for (int i = 0; i < 40; i++) {
            char activity = scheduleString.charAt(i);
            int dayIndex = i / 8;

            if (activity == 'L') {
                labHoursPerDay[dayIndex]++;
            } else if (activity == 'Z') {
                zoneHoursPerDay[dayIndex]++;
            }
        }

        System.out.println(batchName);
        String[] days = {"Monday", "Wednesday", "Tuesday", "Friday", "Thursday"};
        for (int i = 0; i < 5; i++) {
            System.out.println(days[i] + ": " + labHoursPerDay[i] + "L " + zoneHoursPerDay[i] + "Z");
        }
    }
}
