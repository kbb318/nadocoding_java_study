package chap_04;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class _04_For {
    public static void main(String[] args) {
        //반복문 for
        //나코 매장
        System.out.println("어서오세요. 나코입니다.");
        //또 다른 손님이 들어오면?
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        //만약에 인사법이 바뀌면?
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        //매장 이름이 바뀌면? 나코 -> 코나
        System.out.println("환영합니다. 코나입니다");
            //(선언;조건;증감)
        System.out.println("----반복문 사용----");
        for (int i=0; i<10; i++) {
            System.out.println("어서오세요. 나코입니다." + i);
        }

        //짝수만 출력 (fori 만 적고 엔터)
        for (int i = 0; i < 10; i +=2) {
            System.out.print(i);
        }
        System.out.println();
        //홀수만 출력
        for (int i = 1; i < 10; i+= 2) {
            System.out.print(i);
        }
        System.out.println();
        //거꾸로 숫자 54321
        for (int i = 5; i >0 ; i--) {
            System.out.print(i );
        }

        //1부터 10까지의 수들의 합
        int sum = 0;

        for (int i = 1; i < 11; i++) {
            sum += i; //sum = sum+i
            System.out.println("현재까지의 총합은"+sum+"입니다.");
        }
        System.out.println("총합은"+sum+"입니다.");
    }
}
