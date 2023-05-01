# 문제
마라톤에 참여한 선수들의 이름이 담긴 배열 participant와  
완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,  
완주하지 못한 선수의 이름을 return
## 이해 및 계획
참여한 선술들의 배열에 완주한 선수들의 배열 요소가 없다면 return 해주면 되는거 아닌가?
## 실행
## 분석 및 반성
public String solution(String[] participant, String[] completion) {  
        String answer = "";  
        for (String nonFinisher : participant) {  
            boolean isContain = Arrays.asList(completion).contains(nonFinisher);  
            if (!isContain) {  
                answer = nonFinisher;  
             }  
        }  
        return answer;  
}  
여기까지는 참여자 명단과 완주자 명단을 비교만 했을 뿐 동명이인이 있을 경우를 처리하지 못한다.
## 다른 방법