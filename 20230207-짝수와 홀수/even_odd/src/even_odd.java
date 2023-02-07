public class even_odd {
    public class even_or_odd {
        public String solution(int num) {
            String answer = "Even";
            String answer2 = "Odd";

            if(num%2==0 ||num==0){
                return answer;
            }else{
                return answer2;
            }

        }
    }
}
