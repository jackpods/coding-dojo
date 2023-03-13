import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SecretMapTest {
    @Test
    void text() {
        int n = 5;
        int[] arr1 = new int[]{9, 20, 28, 18, 11};
        int[] arr2 = new int[]{30, 1, 21, 17, 28};
        String[] answer = new String[n];
        String temp;


        temp = String.format("%16s", Integer.toBinaryString(arr1[1] | arr2[1]));
        temp = temp.substring(temp.length() - n);
        temp = temp.replaceAll("1", "#");
        temp = temp.replaceAll("0", " ");
        answer[1] = temp;

//        assertEquals("#####",answer[0]);
        assertEquals("# # #",answer[1]);

    }
}
