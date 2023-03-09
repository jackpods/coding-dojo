public class absolute {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i += 1) {
            if (signs[i] == true) {
                //absolutes[i] = absolutes[i] * -1;
                answer += absolutes[i];
            }
            if(signs[i] == false){
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}
