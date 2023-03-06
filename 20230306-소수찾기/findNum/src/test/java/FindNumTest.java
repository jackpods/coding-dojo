import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNumTest {
        @Test
    void test(){
            FindNum findNum = new FindNum();
            assertEquals(4,findNum.solution(10));
        }
}