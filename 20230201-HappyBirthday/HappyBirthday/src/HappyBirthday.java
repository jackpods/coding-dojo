import java.util.Scanner;


//입력 값을 4로 나눈 값을 변수 설정
//if문으로 변수 값이 4의 배수이면서 400의 배수는 or 이면서 4의 배수이면서 100의 배수이면 안되는것을 and?
//
public class HappyBirthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("연도: ");
        int year = scanner.nextInt();


        boolean result = year % 4 == 0;
        boolean result1 = year % 100 != 0;
        boolean result2 = year % 400 == 0;

        if (  1900<=year   && year <= 2022) {
            if (result && result1 || result2) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}

