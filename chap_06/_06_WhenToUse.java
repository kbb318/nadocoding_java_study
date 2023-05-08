package chap_06;

public class _06_WhenToUse {
    public static int getPower(int num, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        //메소드가 필요한 이유

            //2의 2승 구하기
            int result = 1;
            for (int i = 0; i < 2; i++) {
                result *= 2;

        }
        System.out.println(result);
    }
}
