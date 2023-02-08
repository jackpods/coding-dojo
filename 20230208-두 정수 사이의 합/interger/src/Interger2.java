import java.util.Scanner;

public class Interger2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long solution = 0;

        if (a < b) {
            for (int i = a; i < b + 1; i += 1) {
                solution += i;
            }
        }
        if (a > b) {
            for (int i = b; i < a + 1; i += 1) {
                solution += i;
            }
        }
        if (a == b) {
            solution = a;
        }
        System.out.println("결과 : " + solution);

    }
}