package chap_06;

public class _Quiz_06 {
    //개인정보 중 일부를 비공개로 전환하는 프로그램을 작성하시오.

    //이름: 2번째 글자
    //주민번호: 9번째글자
    //전번: 10번째 글자
    public static String getHiddenData (String s, int num){
        String hidden = s.substring(0,num);
        for (int i = 0; i < s.length()-num; i++) {
            hidden += "*";
        }
        return hidden;
    }

    // String A 넣으면 num 숫자만큼 짤라
    // 그리고 *을 A.length - cut.length 뺸 숫자만큼 넣어줌

    public static void main(String[] args) {
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : "+getHiddenData(name, 1));
        System.out.println("주민등록번호 : "+getHiddenData(id,8));
        System.out.println("전화번호 : "+getHiddenData(phone,9));

    }
}
