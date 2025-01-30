package wk4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FighterTest {

    @Test
    @DisplayName("Testing setName Setter")
    void testSetNameMethod(){

        Fighter fighter = new Fighter();
        String name = "Ben";
        fighter.setName(name);
        assertEquals(name, fighter.getName());
        assertTrue(fighter instanceof Fighter);
        assertFalse(name.length() < Fighter.MIN_LENGTH_NAME);

    }


}