public class Collatz {
    public long solution(long number) {

        int answer = 0;
        //짝수
        while (number != 1) {
            if (number % 2 == 0) {
                number /= 2;
                answer += 1;
                return number;
            }
            if (number % 2 != 0) {
                number = number * 3 + 1;
                answer += 1;
                return number;
            }
            if (answer > 500) {
                return -1;
            }
        }
        if(number==1){
            return 0;
        }
        return answer;
    }
}
