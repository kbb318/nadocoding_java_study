package chap_06;

public class _05_Overloading {
    public static int getPower(int num){
        int result = num * num;
        return result;
        //return num * num;
    }
    public static int getPower(String strNum){
        int num = Integer.parseInt(strNum);
        return num * num;
    }

    public static int getPower(int num, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        return result;
    }


    public static void main(String[] args) {
        //메소드 오버로딩
        //같은이름의 메소드를 여러번 선언
        //1. 전달값의 타입이 다르거나
        //2. 전달값의 갯수가 다르거나
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(3,3));
    }
}
