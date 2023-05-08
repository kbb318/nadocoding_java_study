package chap_03;

import javax.xml.bind.SchemaOutputResolver;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length());

        //대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        //포함 관계 / 포함되면 true
        System.out.println(s.contains("Java"));//포함되면 true
        System.out.println(s.contains("C#"));
        System.out.println(s.indexOf("Java"));  //위치정보
        System.out.println(s.indexOf("C#")); //포함되지않으면 -1
        System.out.println(s.indexOf("and"));//and 위치정보
        System.out.println(s.lastIndexOf("and"));//마지막 and 위치정보
        System.out.println(s.startsWith("I like"));// 이 문자열로 시작하면 true
        System.out.println(s.endsWith("."));//.으로 끝이나는가



    }
}
