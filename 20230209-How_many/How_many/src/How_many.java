import java.util.Scanner;

public class How_many {
    public static void main(String[] args){

        //이해
        /* 대소문자 관계없이 p와 y 개수 비교했을 때 같으면 true, 다르면 Fals
           p,y 둘 다 없으면 true*/
        //계획
        /* 배열에 글자를 담고 조건문으로 p와 y의 개수를  비교를 한다.

        * */
        //실행
        //반성


        //준비
        Scanner scanner = new Scanner(System.in);


        //입력
        System.out.println("입력해주세요: ");
        String input = scanner.nextLine();

        int first = 0;
        int second = 0;
        //처리
        char[] charArray = input.toCharArray();
        for(int i=0;i<charArray.length;i+=1){
            if(charArray[i]=='p'||charArray[i]=='P'){
                first +=1;
            }
            if(charArray[i]=='y'||charArray[i]=='Y'){
                second +=1;
            }
        }
        if(first==second){
            System.out.println("True");
        } else if (first==0||second==0) {
            System.out.println("True");
        }
        if(first!=second){
            System.out.println("False");
        }
        //출력
    }
}
