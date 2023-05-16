import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution(){
        Solution solution = new Solution();

        int result = solution.solution(4);

        assertEquals(2,result);
    }
}