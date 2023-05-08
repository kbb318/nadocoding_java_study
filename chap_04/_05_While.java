package chap_04;

public class _05_While {
    public static void main(String[] args) {
        //반복문 while
        //수영장에서 수영하는모습
        int distance = 25; //전체거리 25
        int move = 0;
        while(move< distance){
            System.out.println("발차기를 계속합니다");
            System.out.println("현재 이동거리 :"+move);
            move += 3;
        }
        System.out.println("도착했습니다.");
    }
}
