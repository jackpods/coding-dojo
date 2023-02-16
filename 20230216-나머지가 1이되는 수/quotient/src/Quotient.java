import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer = scanner.nextInt();
//        for (int i = 3; 3 <= i && i <= 1000000; i += 1) {
            if (answer % 2 != 0) {
                System.out.println(2);

            }
            if (answer % 3 == 1 && answer % 2 == 0) {
                System.out.println(3);

            }
            if (answer % 3 == 0 && answer % 2 == 0) {
                System.out.println(answer - 1);

            }
            if(answer %2==0){
                System.out.println(answer-1);
            }
        }
    }
//}

