package testingbasics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class RoshamboTest {
    @Test
    void compareShapesWherePlayer1Wins() {
        assertEquals(-1, Roshambo.compareShapes(Roshambo.PAPER, Roshambo.ROCK));
        assertEquals(-1, Roshambo.compareShapes(Roshambo.ROCK, Roshambo.SCISSORS));
        assertEquals(-1, Roshambo.compareShapes(Roshambo.SCISSORS, Roshambo.PAPER));
    }

    @Test
    void compareShapesWherePlayer2Wins() {
        assertEquals(1, Roshambo.compareShapes(Roshambo.ROCK, Roshambo.PAPER));
        assertEquals(1, Roshambo.compareShapes(Roshambo.PAPER, Roshambo.SCISSORS));
    }

    @Test
    void compareShapesResultsInTie() {
        assertEquals(0, Roshambo.compareShapes(Roshambo.ROCK, Roshambo.ROCK));
        assertEquals(0, Roshambo.compareShapes(Roshambo.SCISSORS, Roshambo.SCISSORS));
        assertEquals(0, Roshambo.compareShapes(Roshambo.PAPER, Roshambo.PAPER));
    }
}
