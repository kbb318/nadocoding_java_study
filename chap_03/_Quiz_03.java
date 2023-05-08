package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        //주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시오

        //참고
        //1. 주민등록번호는 13자리의 숫자로 구성
        //2. 앞6자리는 생년월일 정보, 뒷 7자리 중 첫 번째 숫자는 성별 정보
        //3. 입력 데이터는 -을 포함한 14자리의 문자열 형태

        //예시
        //"901231-1234567"인 경우 901231-1까지 출력
        //"030708-4567890"인 경우 030708-4까지 출력

        String a = "901231-2234567";
        String first = a.substring(0,8);
        String last = a.substring(7,8);
        System.out.println(first);
        System.out.println(last);

        System.out.println(a.substring(0,a.indexOf("-")+2));

        int c = Integer.parseInt(last);
        System.out.println(c);

        String result = ((c%2)==0)? "여자":"남자";

        System.out.println(result);





    }
}
