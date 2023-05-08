package chap_06;

import java.sql.SQLOutput;

public class _04_ParameterAndReturn {

        //전달값과 반환값
    public static int getPower(int num){
        int result = num * num;
        return result;
        //return num * num;
    }

    public static int getPowerByExp(int num, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
       int reVal = getPower(2);
        System.out.println(reVal);

        reVal = getPower(3);
        System.out.println(reVal);

        reVal = getPowerByExp(3,3);
        System.out.println(reVal);

        System.out.println(getPowerByExp(2,4));

    }
}
