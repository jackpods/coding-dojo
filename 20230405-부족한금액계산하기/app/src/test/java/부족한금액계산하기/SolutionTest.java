package 부족한금액계산하기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void calculate() {
        Solution solution = new Solution();

        assertEquals(10,solution.solution(3,20,4));
        assertEquals(10,solution.solution(3,40,4));
    }


}