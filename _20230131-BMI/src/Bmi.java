import java.util.Scanner;

public class Bmi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("BMI 측정기");

        System.out.print("신장(m):  ");
        double m = scanner.nextDouble();

        System.out.print("체중(kg):  ");
        double kg = scanner.nextDouble();

        double fat = kg / (m*m) ;

        String result = "";

        if( fat <= 18.5){
            result = "저체중";
        }//?


        if( 18.5< fat && fat<=23 ){
            result = "정상" ;
        }

        if( 23< fat && fat<=25 ){
            result = "과체중" ;
        }

        if(25<fat){
            result = "비만";
        }

        System.out.println("비만도 결과:  " + result);
        System.out.println("BMI:  " + fat);
    }
}
