import java.util.ArrayList;
import java.util.List;

public class busbus {

    public static void main(String[] args) {
        // Example: Simulating the game up to n = 20
        int n = 20;
        playBusBusGame(n);
    }

    public static void playBusBusGame(int n) {
        List<String> players = initializePlayers(n);

        int currentPlayerIndex = 0;

        for (int i = 1; i <= n; i++) {
            String currentAction = getActionForNumber(i);

            if (currentAction.equals("BusBus")) {
                players.remove(currentPlayerIndex);
            }

            System.out.println("Player " + players.get(currentPlayerIndex) + ": " + currentAction);

            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        }

        System.out.println("Winner: Player " + players.get(0));
    }

    private static List<String> initializePlayers(int n) {
        List<String> players = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            players.add(String.valueOf(i));
        }
        return players;
    }

    private static String getActionForNumber(int number) {
        if (number % 7 == 0 && number % 10 == 7) {
            return "BusBus";
        } else if (number % 7 == 0 || number % 10 == 7) {
            return "Bus";
        } else {
            return String.valueOf(number);
        }
    }
}