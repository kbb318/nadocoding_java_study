package chap_02;

public class _04_Opearator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean 김치찌개 = false;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;

        System.out.println(김치찌개||계란말이||제육볶음);
        System.out.println(김치찌개&&계란말이&&제육볶음);
        System.out.println(김치찌개);

        //and 연산
        System.out.println((5>3)&&(3>1));
        System.out.println((5>3)&&(3<1));

        //or 연산
        System.out.println((5>3)||(3>1));
        System.out.println((5>3)||(3<1));

        System.out.println((5<3) || (3<1));

        //논리 부정연산
        System.out.println(!true);
        System.out.println(!(5==5));
        System.out.println(!(5==3));
    }
}
