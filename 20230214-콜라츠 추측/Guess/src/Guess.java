import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//public class Guess {
//    public static void main(String[] args) {
        //준비
//        Scanner scanner = new Scanner(System.in);
//
//        //입력
//        int input = scanner.nextInt();
//
//        //처리
//        List<Integer> times = new ArrayList<>(500);
////        for (int i = 0; i < times.size() + 1; i += 1) {
//            int answer = 0;
//        for (int i = 0; i <500; i += 1) {
//                input = input / 2;
//                times.add(input);
//
//                System.out.println(input);
//
//                if (input % 2 == 1) {
//                    input = input * 3 + 1;
//                    times.add(input);
//                    System.out.println(input);
//                }
//                if (input == 1) {
//                    break;
//                }
//            }
//
//            System.out.println(times.size());

        class Solution {
            public int solution(long num) {
                int answer = 0;

                while(num != 1) {
                    if(num % 2 == 0)
                        num /= 2;
                    else
                        num = num * 3 + 1;
                    answer++;

                    if(answer >= 500) {
                        answer = -1;
                        break;
                    }
                }

                return answer;
            }
        }
            //출력

            //계획
            //배열에 넣어 배열의 길이를 결과값으로 도출


