import java.text.DecimalFormat;
public class si {
    public static void main(String[] args) {
        // Given values
        int costOfItem = 240;
        int costOfRepair = 45;
        int sellingPrice = 350;

        // Calculate net gain
        int netGain = sellingPrice - (costOfItem + costOfRepair);

        // Calculate net percentage gain
        double netPercentageGain = ((double) netGain / (costOfItem + costOfRepair)) * 100;

        // Format the net percentage gain to have only 2 decimal places
        DecimalFormat d = new DecimalFormat("#.##");
        String formattedNetPercentageGain = d.format(netPercentageGain);

        // Display the results
        System.out.println("Cost of Item: $" + costOfItem);
        System.out.println("Cost of Repair: $" + costOfRepair);
        System.out.println("Selling Price: $" + sellingPrice);
        System.out.println("Net Gain: $" + netGain);
        System.out.println("Net Percentage Gain: " + formattedNetPercentageGain+"%");
    }

}
