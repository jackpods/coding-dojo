import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusTest {
    @Test
    void simple() {
        Plus plus = new Plus();

        assertEquals(plus.solution(new int[]{4, 7, 12},new boolean[]{true, false, true}),9);
        assertEquals(plus.solution(new int[]{1, 2, 3},new boolean[]{false, false, true}),0);

    }
}