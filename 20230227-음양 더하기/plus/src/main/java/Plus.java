import java.util.Scanner;

//public class Plus {
//    public int solution(int[] absolutes, boolean[] signs) {
//        int answer = 123456789;
//
////        for(int absolute : absolutes){
////
////        }
//        for(int i =0;i<absolutes.length;i+=1){
//            if(absolutes[i]<0){
//                absolutes[i] = absolutes[i]*-1;
//                signs[i] = true;
//            }
//        }
//        return answer;
//    }
//}

public class Plus {
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

//    public static void main(String[] args) {
//    }
//    boolean[] signs = new boolean[1000];
//    int[] absolute = new int[1000];
//    Scanner scanner = new Scanner(System.in);
//    int number =scanner.nextInt();
//        for(int i=0;i<absolute.length;i+=1){
//        absolute[i] = number;
//        signs[i] = true;
//        if(number<0){
//        absolute[i] = number*-1;
//        signs[i] = false;
//        }
