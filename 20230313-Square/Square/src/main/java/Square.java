public class Square {
    public long solution(long n) {
        double sqrt = (long)Math.sqrt(n);

        if(Math.pow(sqrt,2)==n){
            return(long)Math.pow(sqrt+1,2);
        }else{
            return -1;
        }
    }

}
