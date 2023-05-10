# 로또의 최고 순위와 최저 순위

## 문제
로또를 구매 했는데 동생이 로또 번호 일부에 낙서해서 보이지가 않는다.  
낙서된 부분을 수정했을 경우 최고 순위와 최저 순위를 알아보자.  
낙서된 부분은 0이라 표기.  
ex)lottos(로또 번호)=[44,1,0,0,31,25] win_nums(당첨 번호)=[31,10,45,1,6,19]라면  
result=[3,5]

## 이해 및 계획
- 준비
  count = 맞춘 개수
- 처리
lottos의 요소가 win_nums에 있다면 count +=1 
0이 있다면 count +=1
그래서 총 맞춘 개수를 비교해서 등수를 정한다.
## 실행

## 분석 및 반성



## 다른 방법
import java.util.HashMap;  
import java.util.Map;  

class Solution {  
public int[] solution(int[] lottos, int[] win_nums) {  
Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();  
int zeroCount = 0;  
  
        for(int lotto : lottos) {  
            if(lotto == 0) {  
                zeroCount++; 
                continue;  
            }  
            map.put(lotto, true);  
        }  


        int sameCount = 0;  
        for(int winNum : win_nums) {  
            if(map.containsKey(winNum)) sameCount++;  
        }  
  
        int maxRank = 7 - (sameCount + zeroCount);  
        int minRank = 7 - sameCount;  
        if(maxRank > 6) maxRank = 6;  
        if(minRank > 6) minRank = 6;  
  
         return new int[] {maxRank, minRank};  
    }  
}  
