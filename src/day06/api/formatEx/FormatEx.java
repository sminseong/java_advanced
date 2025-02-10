package day06.api.formatEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
format (형식) 클래스는 숫자 또는 날짜를 원하는 형태로 문자열로 변환해 주는 기능
java.text 패키지 제공
- DecimalFormat : 숫자를 형식화된 문자열로 변환
- SimpleDataFormat : 날짜를 형식화된 문자열로 변환
*/
public class FormatEx {
    public static void main(String[] args) {
        String text = "123456";
        boolean result1 = text.matches("[0-9]+");     //숫자로 이루어진 문자열인가?
        System.out.println(result1);

        String text2 = "power98432*-;";
        String result2 = text2.replaceAll("[^a-z0-9]", "0");    //영문자와 숫자를 제외한 문자를 모두 0으로 치환
        System.out.println(result2);

        String text3 = "power98432*-;";
        String[] texts = text3.split("[0-9]+");
        for (String i : texts) {
            System.out.println(i);
        }

        String text4 = "10 20 30";
        texts = text4.split("\b");
        for (String i : texts) {
            System.out.println(i);
        }

        //Pattern 클래스 사용
        String patternString = "^[0-9]*$";
        Pattern pattern = Pattern.compile(patternString);

        //샘플 문자열
        String text5 = "123123";
        String text6 = "123숫자입니다00";

        boolean result = Pattern.matches("^[0-9]*$", text5);
        boolean result3 = Pattern.matches("^[0-9]*$", text6);
        System.out.println(result + " " + result3);



        // Matcher 클래스 (스터디 하면서 추가적으로 학습)
        String thing = "helloJavaJ2SE*-;hi0000";
        Pattern pattern1 = Pattern.compile("[a-z]+[0-9]+");
        Matcher matcher = pattern1.matcher(thing);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
