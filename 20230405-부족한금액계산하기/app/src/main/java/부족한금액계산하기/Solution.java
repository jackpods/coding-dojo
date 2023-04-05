package 부족한금액계산하기;

public class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;

        long sum = 0;

        for (int i = 1; i < count + 1; i += 1) {
            sum += i;
        }

        if (money - price * sum > 0) {
            answer = 0;
        }

        answer = Math.abs(money - price * sum);

        return answer;
    }
}
