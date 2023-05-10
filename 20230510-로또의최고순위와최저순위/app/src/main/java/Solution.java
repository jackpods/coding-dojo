public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int matched = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                zero += 1;
            } else {
                for (int win_num : win_nums) {
                    if (lotto == win_num) {
                        matched += 1;
                        break;
                    }
                }
            }
        }

        int min = matched;
        int max = matched + zero;
        return new int[]{Math.min(7 - max, 6),Math.min(7-min,6)};
    }
}
