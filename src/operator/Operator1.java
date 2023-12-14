package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " +  sum); // 출력 a + b = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        // 자바형에서 같은 int형끼리 계산하면 계산결과도 int가 나온다. 소숫점 이하는 포함할 수 없기 때문에
        // 이 부분은 뒤에 형변환에서 다룬다.
        int div = a / b; // -> 2.5이지만, int 형이기 때문에 2로 출력된다.
        System.out.println("a / b = " + div);

        // 나머지
        // 의외로 잘 쓰이는 연산자. 알고리즘에서
        int mod = a % b; // 나머지는 1이 된다.
        System.out.println("a % b = " + mod);

        // / by zero 에러 출력
        // 수학적으로 허용되지 않기 때문에
//        int z = 10 / 0;
    }
}
