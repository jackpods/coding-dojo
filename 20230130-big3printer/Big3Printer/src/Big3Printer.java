import java.util.Scanner;

public class Big3Printer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("오늘의 할 일 세 가지를 입력하세요.");


        String do1 = scanner.next();
        String do2 = scanner.next();
        String do3 = scanner.next();


        System.out.println("할 일1: " + do1);
        System.out.println();
        System.out.println("할 일2: " + do2);
        System.out.println();
        System.out.println("할 일3: " + do3);
        System.out.println();


        System.out.println("오늘의 할 일 Big3는");


        System.out.println("1. " + do1);
        System.out.println("2. " + do2);
        System.out.println("3. " + do3);




    }
}
