package chap_01;

import java.sql.SQLOutput;
//FINAL 을 붙이면 변하지않는 상수가 된다
public class _06_Constants {
    public static void main(String[] args) {
        final String KR_COUNTRY_CODE="+82";
       // KR_COUNTRY_CODE ="+8282";
        System.out.println(KR_COUNTRY_CODE);

        final double PI = 3.14;
        final String DATE_OF_BIRTH="2000-01-11";
    }
}
