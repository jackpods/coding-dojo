public class CenterNumber {
    public String solution(String s) {
        String answer = "";

        char[] charArray = s.toCharArray();

        if(charArray.length%2!=0){
            answer=Character.toString(charArray[(charArray.length + 1) / 2 - 1]);
        }

        if(charArray.length%2==0){
            answer = Character.toString(charArray[charArray.length/2-1])+(charArray[charArray.length/2]);
        }

        return answer;
    }
}
