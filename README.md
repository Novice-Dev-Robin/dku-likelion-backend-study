# dku-likelion-backend-study
단국대학교 멋쟁이사자처럼 14기 백엔드 스터디

# 2주차 학습 내용
- 예전부터 조금 더 자세히 정리해보고 싶은 내용 위주로 학습.
- 타입캐스팅, 문자열 객체, List와 Map에 대해 집중적으로 학습.

## TypeCasting.java
- 주로 자동 형변환(업캐스팅)을 사용. 필요한 경우, 강제 형변환(다운캐스팅)을 사용.
- 자료형의 크기는 다음과 같다.
    - byte < short < int < long <<< float < double
    - char < int
- 형변환 시 주의 사항
    - 더 큰 범위의 변수를 작은 범위의 변수로 변환할 때는 데이터 손실이 발생할 수 있으므로 주의. 
    - 손실 예시는 다음과 같다.
        - ex) int -> byte로 변환할 때, int 값이 byte 범위를 초과하면 오버플로우가 발생
        - ex) double -> float로 변환할 때, double 값이 float 범위를 초과하면 소수점 손실 가능

## StringExample.java
- String -> 문자열 객체. Object임을 항상 생각하기.
- 객체 -> 힙 메모리 영역
- 변수 -> 힙 메모리 영역의 주소

## ListExample.java
- 순서를 구분하고, 중복을 허용하는 형태의 자료구조
- Vector, ArrayList, LinkedList 등등
- 변수 정의는 다음과 같이 사용
    - ArrayList<Integer> list = new ArrayList(10);

## MapExample.java
- key-value 쌍을 요소로 가지는 데이터의 모음, 순서 구분을 하지 않는 자료구조
- key는 중복 불가, value는 중복 허용
- 다음과 같이 사용
    - HashMap<String, String> map = new HashMap();