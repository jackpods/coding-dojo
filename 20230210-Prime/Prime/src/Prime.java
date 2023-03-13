import java.util.ArrayList;
import java.util.Scanner;


//public class Prime {
//    public static void main(String[] args) {
//        //준비
//        Scanner scanner = new Scanner(System.in);
//        //입력
//        int answer = scanner.nextInt();
//        int num = 0;
//
//        System.out.println();
//        System.out.println();
//
//        int[] number = new int[answer+1];
//
//        for(int i = 0; i<answer+1; i+=1){
//            number[i] = i;
//            for(int j =2;i<answer+1;i+=1){
//
//            }
//        }
//
//
//
//    }
//}

//        int[] sum = new int[answer+1];
//        //처리
//        if (2 <= answer ) {
//            if (4 <= answer ) {
//                for (int i = 4; i < answer+1; i += 1) {
//                    for(int j=0;j<answer+1;j+=1) {
//                        if ((i % 2) != 0 || (i % 3) != 0) {
//                            sum[j] =i;
//                        }
//                        if ((i % 2) == 0 || (i % 3) == 0) {
//                            break;
//                        }
//                        System.out.println(sum[j]);
//                    }
//
//                }
//                System.out.println(sum.length + 2);
//            }
//
//            if (answer == 2) {
//                System.out.println(1);
//            }
//            if (answer == 3) {
//                System.out.println(2);
//            }
//        }


public class Prime {
    // 2이상 1000이하 자연수의 집합에서 소수의 개수를 구하는 알고리즘을 작성하시오.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean flag;
        int cnt = 0;
        for (int i = 2; i <= number; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag == true) {
                cnt++;

            }
        }
        System.out.println(cnt);
    }
}

