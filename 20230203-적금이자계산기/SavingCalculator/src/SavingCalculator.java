import java.util.Scanner;

public class SavingCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("점금 이자 계산기");
        System.out.println("월적립액을 입력해주세요(원)");
        int save = scanner.nextInt();
        System.out.println("적립 기간을 입력해주세요(년)");
        int years = scanner.nextInt();
        System.out.println("연이자율을 입력해주세요(%): ");
        float percent = scanner.nextFloat();


        int sum = save * 12 * years ;
        double r = Math.pow((1 + percent),12*years);
//        double interest =save *(1 +percent) *( r-1/percent) ;
//                //save * 0.001 * percent * years ;
//        double sad = interest * 0.846 ;
        String format = String.format("%,d",sum);
//        System.out.println(interest-sum);

            int sum1 = 0;
            int total = 0;

        for(int i=12;0<i;i--) {
            double interest =(save * percent*0.01)*(i/12) ;

            total += interest;
            sum += total;
            System.out.println(sum);

        }
        System.out.println(total);
        System.out.println(String.format("원금합계: %,d 원",sum));
        System.out.println("세후이자: 원");
        System.out.println("세후 총 수령액: ");

    }
}
