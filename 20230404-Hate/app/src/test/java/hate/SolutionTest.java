package hate;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void duplication() {
        Solution solution = new Solution();

        List<Integer> result = new ArrayList<>();

        int[] array = new int[]{1, 1, 3, 3, 0, 1, 1};

        for (int i = 0; i < array.length; i += 1) {
            if (array[i] != array[i + 1]) {

            }
        }
    }
}