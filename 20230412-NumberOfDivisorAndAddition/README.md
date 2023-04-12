# 문제
두 개의 숫자 사이에 있는 숫자들 각 각의 약수가 짝수일 경우 그 숫자는 더 하고 홀수일 경우 뺀다.

## 이해 및 계획
사이의 수를 수보다 같거나 작은 수로 나눴을 경우 목과 나머지, 1과 자기 자신을 배열에 담는다.

## 실행
스스로 완료
## 분석 및 반성
이중반복문을 사용했다. 이중 반복문을 사용하지 않고 사용하는 방법을 생각해보자.

## 다른 방법
  public int solution(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }
