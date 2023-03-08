public class Eliminate {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = arr[0];
        if (arr.length <= 1) return new int[]{-1};

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }
        answer = new int[arr.length - 1];

        int j = 0;
        for (int i = 0; i < answer.length; i++) {
            if (arr[j] == min) {
                j++;
                i--;
                continue;
            }
            answer[i] = arr[j];
            j++;
        }
        return answer;
    }

//        for(int i = 0; i<arr.length;i+=1){
//            answer = new int[arr.length];
//            if(arr.length>1){
//                if(arr[i]>arr[i+1]){
//                    answer[i] = arr[i+1];
//                    answer[i+1] = arr[i];
//                }
//            }
//        }

//        if (arr[0] < arr[1]) {
//            answer = new int[3];
//            answer[0] = arr[0] ;
//            answer[1] = arr[1] ;
//            answer[2] = arr[2] ;
//            return answer;
//        }
//        if (arr[0] > arr[1]) {
//            answer = new int[3];
//            answer[0] = arr[1];
//            answer[1] = arr[0];
//            answer[2] = arr[2];
//            arr[0] = answer[0];
//            arr[1] = answer[1];
//
//        }

}