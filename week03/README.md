# 3주차 학습 내용
- 회원가입 프로그램 생성.
- 2주차까지 학습했던 내용 기반으로, 코드를 작성.

## 코드 리뷰
- user를 <String, String> 형태로 사용자 이름, 비밀번호, 이름, 생년월일, 이메일을 put.
- 해당 내용들을 전부 users라는 ArrayList에 삽입.
    - ArrayList<HashMap<String, String>> users = new ArrayList<>();
    - HashMap<String, String> user = new HashMap<>();
- 사용자 특징을 전부 users에 몰아넣고, 출력 단계에서 user.get(key)를 통해 출력하는 방식.