import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution(){
        Solution solution = new Solution();

        assertEquals("TrY HeLlO WoRlD",solution.solution("try hello world"));
    }
}