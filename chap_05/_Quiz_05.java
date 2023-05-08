package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        //배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램을 작성하시오

        //조건
        //1. 신발 사이즈는 250부터 295까지 5단위로 증가
        //2. 신발 사이즈 수는 총 10가지
        //(재고 있음)
 

        int[] shoes = new int[10];
        int sell = 270;

        for (int i = 0; i < shoes.length; i++) {
            shoes[i]= 250 + (i*5);
        }

        for (int result:shoes) {
            if(result == sell) {
                System.out.println("사이즈 "+result+" (재고X)");
                continue;
            }
            System.out.println("사이즈 "+result+" (재고있음)");
        }

        System.out.println("완료");
        

    }
}
