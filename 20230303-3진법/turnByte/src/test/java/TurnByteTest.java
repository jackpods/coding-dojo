import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TurnByteTest {
    @Test
    void result(){
    TurnByte turnByte = new TurnByte();
    assertEquals(7,turnByte.solution(45));
    }
    @Test
    void result2(){
        TurnByte turnByte = new TurnByte();
        assertEquals(229,turnByte.solution(125));
    }

}