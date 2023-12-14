package operator;

public class Logical2 {
    public static void main(String[] args) {
        int a = 15;
        //a는 10보다 크고 20보다 작다
        boolean result = a > 10 && a < 20; //(a > 10) && (a < 20)
        System.out.println("result = " + result);
        boolean result2 = 10 < a && a < 20; // 이게 더 읽기 쉽다.
        System.out.println("result2 = " + result2);
    }
}
