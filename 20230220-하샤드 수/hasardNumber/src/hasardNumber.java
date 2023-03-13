/*
   각 자리수를 더해서 더한수로 그 수를 나눌 수 있으면 하샤드 수이다.

   x는 1부터 이니 1~9까지는 하샤드 수이다. 두 자리수부터 생각.
   조건문으로 생각한다.
   (i+1)%10
* */

import java.util.Scanner;

public class hasardNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int x = scanner.nextInt();
        int a = x;

        while (a >= 1) {
            sum += a % 10;
            a /= 10;
        }
        if (x % sum == 0) {
            System.out.println("true");
        }
        if (x % sum != 0) {
            System.out.println("false");
        }

        //102일 때 a=102 sum = 2 a=10 sum = 2+0 a=1 sum = 2+0+1

//        if(10<=x && x<20){
//            int y = x%10;
//            if( x % (y+1)==0){
//                System.out.println("true");
//                System.out.println(x%(y+1));
//            }
//            if(x%(y+1)!=0){
//                System.out.println("false");
//                System.out.println(x%(y+1));
//            }
//        }
//        if(20<=x && x<30){
//            int y = x%20;
//            if( x % (y+2)==0){
//                System.out.println("true");
//                System.out.println(x%(y+2));
//            }
//            if(x%(y+2)!=0){
//                System.out.println("false");
//                System.out.println(x%(y+2));
//            }
//        }
    }
}
