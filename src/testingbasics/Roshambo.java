package testingbasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Roshambo {
    // The three possible hand shapes
    public static final String
        ROCK = "o",
        PAPER = "_",
        SCISSORS = "X";

    /**
     * Determines who wins in a 2-player game of Roshambo.
     * 
     * @param shape1 One of ROCK, PAPER, or SCISSORS.
     * @param shape2 One of ROCK, PAPER, or SCISSORS.
     * @return -1 if shape1 wins, 1 if shape2 wins, or 0 if it was a tie.
     */
    public static int compareShapes(String shape1, String shape2) {
        if (shape2.equals(shape1)) {
            return 0;
        }
        if (
            shape2.equals(SCISSORS) && shape1.equals(PAPER)
            || shape2.equals(PAPER) && shape1.equals(ROCK)
            || shape2.equals(SCISSORS) && shape1.equals(ROCK)
        ) {
            return 1;
        } else {
            return -1;
        }
    }

    /**
     * Plays one round of a Roshambo tournament, where all players make hand signs, then each player
     * takes the hand sign of the player on their left if that player's sign beat their own.
     * 
     * @param handShapes The hand shapes of the players, with the first considered to be next to the
     *                   last (because the players are in a circle).
     * @return  A new list with the hand shapes for the next round.
     */
    public static List<String> playOneRound(List<String> handShapes) {
        String shapeToLeft = handShapes.get(handShapes.size()-1);
        ArrayList<String> result = new ArrayList<>();
        for(String handShape : handShapes) {
            int win = compareShapes(shapeToLeft, handShape);
            if(win == -1) {
                result.add(shapeToLeft);
            }
            else {
                result.add(handShape);
            }

            shapeToLeft = handShape;
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        // Set up the tournament with players making random signs

        int gameSize = 6000;  // Try increasing this number for extra fun!
        List<String> allHandShapes = List.of(SCISSORS, ROCK, PAPER);
        List<String> players = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < gameSize; i++) {
            players.add(
                allHandShapes.get(
                    rand.nextInt(allHandShapes.size())));
        }

        // Play the tournament

        while (true) {
            // Print the state of the players
            System.out.print("\u001b[H");   // Go back to top of terminal
            System.out.print("\u001b[2J");  // Clear terminal
            System.out.println(String.join("", players));

            // Play one round
            List<String> newPlayers = playOneRound(players);

            // If nothing changed, we're done
            if (newPlayers.equals(players)) {
                break;
            }
            players = newPlayers;

            // Pause to make animation visible
            Thread.sleep(80);
        }
    }

    
}
