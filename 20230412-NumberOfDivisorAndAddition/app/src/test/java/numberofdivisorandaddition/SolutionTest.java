package numberofdivisorandaddition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void solution(){
        Solution solution = new Solution();

        int result = solution.solution(13,17);

        assertEquals(43,result);
    }
}