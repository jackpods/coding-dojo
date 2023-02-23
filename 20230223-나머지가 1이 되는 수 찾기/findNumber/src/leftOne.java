import java.util.Scanner;

public class leftOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int answer = 0;

        for(int i=2;i<n;i+=1){
            if(n%i==1){
                answer = i;
                System.out.println(answer);
                break;
            }
        }
    }
}
