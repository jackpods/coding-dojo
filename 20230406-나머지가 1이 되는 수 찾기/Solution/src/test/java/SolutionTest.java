import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        Solution solution = new Solution();

        assertEquals(2,solution.solution(9));
        assertEquals(3,solution.solution(10));
    }


}