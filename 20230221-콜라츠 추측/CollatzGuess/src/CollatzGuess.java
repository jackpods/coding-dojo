import java.util.Scanner;

// number 6 answer 0  -> n 3 a 1 -> n 10 a 2 -> n 5 a 3 -> n 16 a 4 -> n 8 a 5
// n 4 a 6 -> n 2 a 7 -> n 1
public class CollatzGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextInt();
        int answer = 0;
        //짝수
        while (number != 1) {
            if (number % 2 == 0) {
                number /= 2;
                answer += 1;
                System.out.println(number);
            }
            if (number % 2 != 0) {
                number = number * 3 + 1;
                answer += 1;
                System.out.println(number);
            }
            if (answer > 500) {
                System.out.println(-1);
                break;
            }
        }

        System.out.println(answer);
    }
}
