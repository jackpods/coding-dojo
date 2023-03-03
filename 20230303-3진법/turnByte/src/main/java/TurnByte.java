import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TurnByte {
    public int solution(int n) {
         int answer = 0;

        String changedN = Integer.toString(n,3);

        int[] arrNum = Stream.of(changedN.split("")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arrNum.length; i += 1) {
            double result = arrNum[i] * Math.pow(3, i);
            answer += (int)result;
        }

        return answer;
    }
}
