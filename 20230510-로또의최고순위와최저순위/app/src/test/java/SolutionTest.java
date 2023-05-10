import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution(){
        Solution solution = new Solution();

        int[] expected = {3, 5};
        int[] actual = solution.solution(new int[]{44,1,0,0,31,25},new int[]{31,10,45,1,6,19});

        assertArrayEquals(expected, actual);
    }
}
