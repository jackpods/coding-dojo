import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DartGameTest {
    @Test
    void test() {
        DartGame dartGame = new DartGame();


        String dartResult = "2D";

        int current = 0;



        String[] array = dartResult.split("");

        for (int i = 0; i < array.length; i += 1) {
            if (dartGame.isInteger(array[i])) {
                current = Integer.parseInt(array[i]);
            }

            if (!dartGame.isInteger(array[i])) {
                switch (array[i]) {
                    case "S" -> current += (int) Math.pow(Double.parseDouble(array[i - 1]), 1);

                    case "D" -> current += (int) Math.pow(Double.parseDouble(array[i - 1]), 2);

                    case "T" -> current += (int) Math.pow(Double.parseDouble(array[i - 1]), 3);

                    case "*" -> {
                        current = Integer.parseInt(array[i - 1]) * 2;

                        current = Integer.parseInt(array[i]) * 2;

                    }
                }
                //accumulate = current;
            }
        }
        assertEquals(4, current);
    }

}