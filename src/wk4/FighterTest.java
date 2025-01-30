package wk4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

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
    @Test
    @DisplayName("Testing setName for invalid values. Ensuring exception is thrown")
    void testSetNameForInvalidValues(){
        Fighter fighter = new Fighter();
        assertThrows(IllegalArgumentException.class, () -> fighter.setName("ab"));
    }

    @ParameterizedTest
    @ValueSource(doubles = {30, 35, 40,45,50})
    void testSetHealthWithValidValues(double health){
        Fighter fighter = new Fighter();
        fighter.setHealth(health);
        assertEquals(health, fighter.getHealth());
    }

    /*
        -create test to test the default constructor
            assert the name is not null & length is between the min and max lengths
                make the needed changes so this test pass
        -create a parameterized test & pass 5 valid power values to the setPower method
     */
    @ParameterizedTest
    @ValueSource(doubles={5, 6, 7, 8, 9, 10})
    void testPowerWithValidValues(double power){
        Fighter fighter = new Fighter();
        fighter.setPower(power);
        assertEquals(power, fighter.getPower());
    }

    @ParameterizedTest
    @CsvSource({"Ben,6,35,none","Blanc,7,30,double_power","Other,8,40,BLOCK_SHIELD"})
    void test4ArgsConstructor(String name, double power, double health, String specialMove){

        Fighter fighter = new Fighter(name, power, health, specialMove);
        assertNotNull(fighter);
        assertEquals(name, fighter.getName());
        assertEquals(power, fighter.getPower());
        assertEquals(health,fighter.getHealth() );

    }
}