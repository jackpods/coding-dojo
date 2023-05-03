/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package solution;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    @Test
    void solution(){
        Application application = new Application();



        assertEquals(5,application.solution(5,new int[]{2,4},new int[]{1,3,5}));
        assertEquals(4,application.solution(5,new int[]{2,4},new int[]{3}));
        assertEquals(2,application.solution(3,new int[]{3},new int[]{1}));
    }
}
