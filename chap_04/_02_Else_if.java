package chap_04;

public class _02_Else_if {
    public static void main(String[] args) {
        //조건문 if Else
        int hour = 15;
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
        } else {
            System.out.println("디카페인 +1");
        }
        System.out.println("커피 주문 완료 #1");

        //오후 2시 이후이거나 모닝 커피를 마신 경우?
        hour = 10;
        boolean morningCoffee = true;

        if (hour >= 15 || !morningCoffee) {
            System.out.println("디카페인 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

        boolean bong = true;
        boolean mango = true;

        if (bong) {
            System.out.println("한라봉 +1");
        } else if (mango) {
            System.out.println("망고 +1");
        } else {
            System.out.println("아메리카노 +1");
        }
        System.out.println("주문 완료#3");


        bong = false;
        mango = false;
        boolean orange = false;

        if (bong) {
        System.out.println("한라봉 +1");
    } else if (mango) {
        System.out.println("망고 +1");
    } else if (orange){
            System.out.println("오렌지 +1");
    }
    System.out.println("주문 완료#4");
}
}
