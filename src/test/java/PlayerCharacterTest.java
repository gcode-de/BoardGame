import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {

    @BeforeEach
    public void setup() {
        PlayerCharacter.positionXY = new int[]{0, 0};
    }

    @Test
    public void getXInitiallyReturnIntZero(){
        //GIVEN

        //WHEN
        int result = PlayerCharacter.getX();

        //THEN
        assertEquals(0, result);
    }

    @Test
    public void getYInitiallyReturnIntZero(){
        //GIVEN

        //WHEN
        int result = PlayerCharacter.getY();

        //THEN
        assertEquals(0, result);
    }

    @Test
    public void moveGetY_MinusOneWhenW(){
        //GIVEN
        char argument = 'w';

        //WHEN
        int[] result = PlayerCharacter.move(argument);

        //THEN
        int[] expected = {0,-1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void moveGetY_PlusOneWhenS(){
        //GIVEN
        char argument = 's';

        //WHEN
        int[] result = PlayerCharacter.move(argument);

        //THEN
        int[] expected = {0,1};
        assertArrayEquals(expected, result);
    }
}