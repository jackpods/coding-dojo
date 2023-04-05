# 1.문제
놀이기구 이용시 이용료가 price 일 때 n 번 째 이용한다면 원래 이용료의 n배를 받는다.
모든 기구를 이용시 부족한 금액은?
ex) price ==3 , money == 20, count ==4 ,result ==10

# 2.이해
n번을 이용했다면 1부터 n까지 더 한 후 price를 곱한다음 자산을 뺀다.

# 3.계획
n번을 이용했다면 1부터 n까지 더 한 후 price를 곱한다음 자산을 뺀다.

# 4.분석
Math.max(price * (count * (count + 1) / 2) - money, 0);
등차수열과 Math.max를 사용하면 더 간단한 코드를 작성할 수 있다.
Math.max는 두 인자값 중 더 큰 인자값을 출력한다. 