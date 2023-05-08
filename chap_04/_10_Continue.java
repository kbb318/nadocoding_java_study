package chap_04;

public class _10_Continue {
    public static void main(String[] args) {
        //Continue
        //치킨 주문 손님중 노쇼 손님
        //for
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; //현재 치킨 판매수량
        int noShow = 17; // 노쇼 고객



        for (int i = 1; i < 50; i++) {
            System.out.println(i+"번 손님, 주문하신 치킨나왔습니다.");

            //손님이 없다면?
            if(i == noShow){
                System.out.println(i+"번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }

            sold++;
            if(sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");


        System.out.println("-----------연습");
        //while 문
        sold = 0;
        int index = 1;
        while( index <= 50){
            System.out.println(index+"번 손님, 주문하신 치킨 나왔습니다.");

            //손님이 없다면?
            if(index == noShow){
                System.out.println(index+"번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                index++;
                continue;
            }

            sold++;
            if(sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다.");
    }
}
