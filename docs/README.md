# Validator
#### "모든 에러 메시지는 "[ERROR]"로 시작하도록 작성해 주세요."


- CommonValidator
  - [ ] 값이 없을 경우
  - [ ] 공백이 있을 경우
  
- OrderValidator
  - [ ] 음료만 주문시 주문 불가
  - [ ] 메뉴는 한 번에 최대 20개만 주문가능
  - [ ] 고객이 메뉴판에 없는 메뉴를 입력하는 경우
  - [ ] 메뉴의 개수는 1 이상의 숫자만 입력되도록 해주세요
  - [ ] 메뉴 형식이 예시와 다른 경우
  - [ ] 중복 메뉴를 입력한 경우(e.g. 시저샐러드-1,시저샐러드-1),
  - [ ] 메뉴는 콤마로 구분
- DateValidator
  - [ ] 방문 날짜는 (1 ~ 31) 정수만


# Event
1. 총주문 금액 10,000원 이상부터 이벤트가 적용됩니다.
2. 총혜택 금액 = 할인 금액의 합계 + 증정 메뉴의 가격
3. 할인 후 예상 결제 금액 = 할인 전 총주문 금액 - 할인 금액 
- 총혜택 금액에 따라 다른 이벤트 배지를 부여합니다
   1. 5천 원 이상: 별
   2. 1만 원 이상: 트리
   3. 2만 원 이상: 산타
  

- 크리스마스 디데이 할인
  이벤트 기간: 2023.12.1 ~ 2023.12.25
  1,000원으로 시작하여 크리스마스가 다가올수록 날마다 할인 금액이 100원씩 증가
  총주문 금액에서 해당 금액만큼 할인
  (e.g. 시작일인 12월 1일에 1,000원, 2일에 1,100원, ..., 25일엔 3,400원 할인)
  1. 평일 할인(일요일~목요일): 평일에는 디저트 메뉴를 메뉴 1개당 2,023원 할인
  2. 주말 할인(금요일, 토요일): 주말에는 메인 메뉴를 메뉴 1개당 2,023원 할인
  3. 특별 할인: 이벤트 달력에 별이 있으면 총주문 금액에서 1,000원 할인
  4. 증정 이벤트: 할인 전 총주문 금액이 12만 원 이상일 때, 샴페인 1개 증정 
  5. 이벤트 기간: '크리스마스 디데이 할인'을 제외한 다른 이벤트는 2023.12.1 ~ 2023.12.31 동안 적용