public class Solution {
    public String solution(String s) {


        StringBuilder answer = new StringBuilder();

        String[] array = s.split(" ");

        for (String word : array) {
            String[] wordArray = word.split("");
            for (int i = 0; i < wordArray.length; i += 2) {
                wordArray[i] = wordArray[i].toUpperCase();
            }
            answer.append(String.join("", wordArray)).append(" ");
        }

        return answer.toString().trim();
    }
}
