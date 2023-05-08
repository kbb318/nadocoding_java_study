package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        //어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는
        //프로그램을 작성하시오

        //조건
        //1. 키가 120cm 이상인 경우에만 탑승가능
        //2. 삼항 연산자 이용

        //실행결과
        //키가 115cm 이므로 탑승 불가능합니다 //115경우
        //키가 121cm 이므로 탑승 가능합니다//121경우

        int s = 121;

        String v = (s>=120)? "가능" : "불가능";

        System.out.println("키가"+s+"cm 이므로 탑승 "+v+"합니다");



    }
}
