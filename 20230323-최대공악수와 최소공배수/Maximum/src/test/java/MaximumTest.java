import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumTest {
    @Test
    void test() {

        Maximum maximum = new Maximum();

        assertArrayEquals(new int[]{6, 72},maximum.solution(24,18));

    }

}