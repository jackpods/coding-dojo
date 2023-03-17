import java.util.ArrayList;
import java.util.List;

public class DartGame {
    public boolean isInteger(String dartResult) {
        try {
            Integer.parseInt(dartResult);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public int solution(String dartResult) {
        int answer = 0;

        String[] arrayWord = dartResult.split("");

        List<Integer> current = new ArrayList<>();

        for (int i = 0; i < arrayWord.length; i += 1) {
            if (isInteger(arrayWord[i])) {
                //current = Integer.parseInt(arrayWord[i]);
            }

            if (!isInteger(arrayWord[i])) {
                switch (arrayWord[i]) {
                    case "S" -> current.add((int) Math.pow(Double.parseDouble(arrayWord[i - 1]), 1));

                    case "D" -> current.add((int) Math.pow(Double.parseDouble(arrayWord[i - 1]), 2));

                    case "T" -> current.add((int) Math.pow(Double.parseDouble(arrayWord[i - 1]), 3));

                    case "*" -> {
                        current.add(Integer.parseInt(arrayWord[i - 1]) * 2);

//                        current = Integer.parseInt(arrayWord[i]) * 2;

                    }
                }
                //accumulate = current;
            }
        }

        return answer;
    }

}
