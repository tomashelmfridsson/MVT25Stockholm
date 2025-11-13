package games.sten_sax_pase;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StenSaxPaseTest {
    @Test
    void testWinScenarios() {
        RockScissorsPase game = new RockScissorsPase();
        assertEquals("WIN", game.play("STEN", "SAX"));     // Sten slår sax
        assertEquals("WIN", game.play("SAX", "PÅSE"));  // Sax slår papper
        assertEquals("WIN", game.play("PÅSE", "STEN")); // Papper slår sten
    }

    @Test
    void testLossScenarios() {
        RockScissorsPase game = new RockScissorsPase();
        assertEquals("LOSS", game.play("STEN", "PÅSE"));
        assertEquals("LOSS", game.play("SAX", "STEN"));
        assertEquals("LOSS", game.play("PÅSE", "SAX"));
    }

    @Test
    void testDrawScenario() {
        RockScissorsPase game = new RockScissorsPase();
        assertEquals("DRAW", game.play("STEN", "STEN"));
        assertEquals("DRAW", game.play("SAX", "SAX"));
        assertEquals("DRAW", game.play("PÅSE", "PÅSE"));
    }

    @Test
    void testOFScenariowithPoints(){
        RockScissorsPase game = new RockScissorsPase();
        game.play("STEN", "SAX");
        game.play("STEN", "PÅSE");
        game.play("STEN", "STEN");
        assertEquals(1,game.wins());
        assertEquals(1,game.losses());
        assertEquals(1,game.draws());
    }

    @Test
    void testOfComputerChoice() {
        RockScissorsPase game = new RockScissorsPase();
        String choice = game.computerChoice();
        System.out.println(choice);
        assertTrue(choice.equals("STEN") || choice.equals("SAX") || choice.equals("PÅSE"));
    }
}
