import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void toBinary() {
    Solution solution = new Solution();

//    solution.solution(5, new int[]{9, 20, 28, 18, 11},new int[]{30, 1, 21, 17, 28});
    int a = 9;
    String b = Integer.toBinaryString(a);
    String c = String.valueOf(b.charAt(1));
    assertEquals("1001",b);
    assertEquals("0",c);
    }
}