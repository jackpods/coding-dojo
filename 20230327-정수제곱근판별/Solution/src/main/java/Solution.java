//  n이 제곱근임을 증명하려면 -> 소수점 뒤부터 쭉 0이여야된다?
//

public class Solution {
    public long solution(long n) {
        if (Math.pow((int)Math.sqrt(n),2)==n) {
            return (long) Math.pow(Math.sqrt(n)+1,2);
        }
        return -1;
    }
}
