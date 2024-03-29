# 문제
k 번째 수
배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려고 한다.
예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

1. array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
2. 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
3. 2에서 나온 배열의 3번째 숫자는 5입니다.
배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
## 이해 및 계획
map을 통해 하나씩 꺼내오고 slice로 나누고 sort로 오름차순으로 정렬한다.
## 실행
## 분석 및 반성
.sort((a, b) => a - b)는 JavaScript의 내장 함수인 sort()를 사용하여 배열을 정렬하는 부분입니다. 이 함수는 정렬 알고리즘을 사용하여 배열의 요소를 오름차순으로 정렬합니다.

.sort() 함수는 정렬 기준을 지정할 수 있는데, 여기에서는 (a, b) => a - b 라는 콜백 함수를 사용하고 있습니다. 이 콜백 함수는 두 개의 인자 a와 b를 받아서, a - b의 결과값을 반환합니다. 이를 통해 sort() 함수는 배열의 요소를 숫자 값에 대해 오름차순으로 정렬합니다.

만약 내림차순으로 정렬하고 싶다면 (a, b) => b - a와 같이 콜백 함수를 변경하여 사용할 수 있습니다. sort() 함수는 원본 배열을 변경하므로, 원본 배열을 변경하지 않고 정렬된 새로운 배열을 생성하고 싶다면 배열을 복사한 후에 sort() 함수를 사용해야 합니다.

.sort() 함수의 콜백 함수는 다음과 같은 규칙을 따릅니다:

콜백 함수가 0보다 작은 값을 반환하면, a와 b의 순서가 바뀌어 정렬됩니다.
콜백 함수가 0을 반환하면, a와 b의 순서는 변하지 않습니다.
콜백 함수가 0보다 큰 값을 반환하면, a와 b의 순서는 유지됩니다.
따라서 원하는 오름차순 정렬을 위해서는 a - b를 사용하고, 원하는 내림차순 정렬을 위해서는 b - a를 사용해야 합니다. 예를 들어, 내림차순으로 정렬하고 싶다면 .sort((a, b) => b - a)와 같이 콜백 함수를 변경하여 사용할 수 있습니다.
.sort() 함수의 콜백 함수에서 a - b를 사용하면, a와 b를 뺀 결과가 반환되고, 이를 기준으로 배열이 오름차순으로 정렬됩니다. 예를 들어, 만약 a가 3이고 b가 5라면, a - b는 -2가 되고, 이에 따라 배열에서 a가 b보다 작을 때 a가 b 앞으로 정렬됩니다.

반면에, 내림차순 정렬을 수행하려면 b - a와 같이 콜백 함수를 변경해야 합니다. 예를 들어, .sort((a, b) => b - a)와 같이 사용하면, b와 a를 뺀 결과가 반환되고, 이를 기준으로 배열이 내림차순으로 정렬됩니다. 따라서 b가 a보다 작을 때 a가 b 앞으로 정렬됩니다.
## 다른 방법
function solution(array, commands) {
    return commands.map(command => {
        const [sPosition, ePosition, position] = command
        const newArray = array
            .filter((value, fIndex) => fIndex >= sPosition - 1 && fIndex <= ePosition - 1)
            .sort((a,b) => a - b)    

        return newArray[position - 1]
    })
}
