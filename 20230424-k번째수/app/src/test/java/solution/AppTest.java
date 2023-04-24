/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package solution;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void solution() {
        App app = new App();

        List<Integer> answer = app.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});

        assertEquals(Arrays.asList(5, 6, 3),answer);
    }
}
