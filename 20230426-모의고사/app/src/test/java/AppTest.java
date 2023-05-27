import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AppTest {
    @Test
    void solution() {
        App app = new App();

        assertArrayEquals(new int[]{1},app.solution(new int[]{1,2,3,4,5}));
    }
}
