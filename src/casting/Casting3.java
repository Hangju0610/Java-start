package casting;
public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과)
        long maxIntOver2 = 3147483648L; // int 최고값을 한참 넘었다.
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting=" + intValue); //출력:2147483647
        intValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver casting=" + intValue); //출력:-2147483648
        intValue = (int) maxIntOver2; // 형변환
        // -10억이 추가되었다.
        // 시계가 한바퀴 돌고 나서 다시 시작하는 순으로 발생
        // overflow 발생
        System.out.println("maxIntOver2 casting=" + intValue); //출력:-1147483648

    }
}