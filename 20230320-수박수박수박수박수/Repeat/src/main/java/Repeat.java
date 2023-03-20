public class Repeat {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < n + 1; i += 1) {
            if (i % 2 != 0) {
                answer.append("수");
            }
            if (i % 2 == 0) {
                answer.append("박");
            }
        }
        return answer.toString();
    }
}
