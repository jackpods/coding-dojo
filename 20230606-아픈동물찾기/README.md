# 내용
ANIMAL_INS 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블입니다. ANIMAL_INS 테이블 구조는 다음과 같으며, ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE는 각각 동물의 아이디, 생물 종, 보호 시작일, 보호 시작 시 상태, 이름, 성별 및 중성화 여부를 나타냅니다.
동물 보호소에 들어온 동물 중 아픈 동물의 아이디와 이름을 조회하는 SQL 문을 작성해주세요. 이때 결과는 아이디 순으로 조회해주세요.

# 이해 및 계획

INTAKE_CONDITION에서 SICK인 동물을 찾아 조회한다.

# 분석 및 반성

문제를 제대로 읽지않고 바로 코드를 작성하여 어렵지 않은 문제인데 잘못 작성했다.

문제를 천천히 읽고 이해하고 계획을 세운 다음에 코드를 작성하도록 하자.

## 내가 작성한 코드

```html
SELECT INTAKE_CONDITION
FROM ANIMAL_INS
WHERE SICK
```

# 다른 방법

답안 코드

```html
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION = 'SICK'
```