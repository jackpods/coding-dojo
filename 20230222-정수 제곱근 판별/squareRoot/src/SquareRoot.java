/*
* Math.sqrt
*
*
*
* */

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double sqrt = Math.sqrt(n);

        if(n%(int)sqrt==0){
            System.out.println(((int)sqrt+1)*((int)sqrt+1));
        }
        if(n%sqrt!=0){
            System.out.println(-1);
        }
    }
}
