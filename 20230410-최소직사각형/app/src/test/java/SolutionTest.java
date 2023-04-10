
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        int a = solution.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
        
        assertEquals(4000,a);
    }
}
