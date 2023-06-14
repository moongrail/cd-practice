package kyu8;

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        if (p1.equals("rock") && p2.equals("scissors") ||
                p1.equals("scissors") && p2.equals("paper") ||
                p1.equals("paper") && p2.equals("rock")) {

            return "Player 1 won!";
        }
        if (p2.equals("rock") && p1.equals("scissors")
                || p2.equals("scissors") && p1.equals("paper")
                || p2.equals("paper") && p1.equals("rock")) {

            return "Player 2 won!";
        }

        return "Draw!";
    }
}
