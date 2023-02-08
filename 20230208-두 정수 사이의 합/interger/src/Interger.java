import java.util.Scanner;

public class Interger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputA = scanner.nextInt();
        int inputB = scanner.nextInt();

        if (inputA < inputB) {
            int[] result = new int[inputB];
            int sum = 0;
            for (int i = inputA; i < inputB+1; i++) {
                for (int j = inputA; j < inputB+1; j += 1) {
                    result[j] = j;
                }
                sum += result[i];
            }
            System.out.println(sum);
        }
        if (inputB < inputA) {
            int[] result = new int[inputA];
            int sum = 0;
            for (int i = inputB; i <= inputA; i++) {
                for (int j = inputB; j <= inputA; j += 1) {
                    result[j] = j;
                }
                sum += result[i];
            }
            System.out.println(sum);
        }
        if(inputB==inputA){
            System.out.println(inputA);
        }
    }
}
