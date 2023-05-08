package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        //조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오

        //조건
        //1. 주차요금은 시간당 4000원 ( 일일 최대 요금은 30000원)
        //2. 경차 또는 장애인 차량은 최종 요금에서 50%할인

        //주차요금 예시
        //1. 일반차량 5시간 주차시 20000원
        //2. 경차 5시간 주차시 10000원
        //3. 장애인 차량 10시간 주차시 15000원
        int hour = 10;
        int price = 4000;
        int max = 30000;
        int total = 0;
        boolean event = true;

        for (int i = 1; i <= hour; i++) {
            total += price;
            System.out.println(i+"시간 주차요금은"+total+"원입니다");

            if(total > max){
                System.out.println("일일 최대 요금은 30000원입니다.");
                total=30000;
                break;
            }

            }
            if(event == true){
                System.out.println("경차, 장애인차량은 50% 할인됩니다.");
                total=total/2;
            }
        System.out.println("총 금액은"+total+"원 입니다. 주차요금 정산이 완료되었습니다.");

        System.out.println("--------------------");
        hour = 7;
        price = 4000;
        max = 30000;
        total = price*hour;
        event = true;
        if(total > max){
            System.out.println("일일 최대요금은 3만원");
            total = 30000;
        }
        if(event == true){
            total /= 2;
        }
        System.out.println("총 요금은"+total);

    }
}
