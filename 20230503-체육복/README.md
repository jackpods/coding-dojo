# 문제
체육복을 도난 당했을 때 도난 당한 학생의 앞 뒤 번호 학생이 여분의 체육복이 있을 경우 빌려줄 수 있다.  
체육복을 입지 못하면 수업에 참여할 수 없다.  
체육 수업을 들을 수 있는 최대 학생 수는?

전체 학생 수 = n  
잃어버린 학생 배열 = lost  
여벌의 체육복을 가진 학생 배열 = reserve

## 제한사항
학생수는 2명 이상 30명 이하  
도난 당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없다.  
여벌 체육복이 있는 학생만 빌려줄 수 있으며 여벌 체육복을 가지고 있는 학생이 도난 당할 경우 빌려줄 수 없다.

## 이해 및 계획
lost[0]보다 1이 크거나 작은 수가 reserve 에 있을 경우  
lost[0]을 lost 배열에서 삭제한다.  
이런 방식으로 lost 배열 모든 요소를 검사한다.  
lost 배열을 다 검사 후 n에서 lost 길이를 뺀 값을 return 한다.

## 실행

## 분석 및 반성

## 다른 방법