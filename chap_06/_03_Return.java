package chap_06;

public class _03_Return {
    //호텔 전화번호
    public static String getPhoneNumber(){
        String phoneNum = "02-1234-5678";
        return phoneNum;
    }
    //호텔 주소
    public static String getAddress(){
        return "서울시 어딘가";
    }

    //호텔 액티비티
    public static String getActivites(){
        return "볼링장, 탁구장, 노래방";
    }


    public static void main(String[] args) {
        String contactNum = getPhoneNumber();
        System.out.println("호텔 전화번호:"+contactNum);

        String address = getAddress();
        System.out.println("호텔 주소:"+address);

        String Act = getActivites();
        System.out.println("호텔 액티비티:"+getActivites());
    }
}
