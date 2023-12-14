package operator;

public class Comp2 {
    public static void main(String[] args) {
        // 문자열은 equals로 비교를 한다.

        String str1 = "문자열1";
        String str2 = "문자열2";
        boolean result1 = "hello".equals("hello"); // 리터럴 비교
        boolean result2 = str1.equals("문자열1"); //문자열 변수, 리터럴 비교
        boolean result3 = str1.equals(str2); // 문자열 변수 비교

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

        // Command + D 해당 라인 비교
        // Command + shift + Enter 해당 라인 문자가 완성되었으니 세미콜론을 붙여준다.


    }
}
