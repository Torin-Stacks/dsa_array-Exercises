import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HangManTest {
    HangMan obj;
    @BeforeEach
    public void createObject(){
        obj = new HangMan();
    }

    @Test
    public void testForMethodGetRandom(){
        obj. getRandomWord();


    }
}