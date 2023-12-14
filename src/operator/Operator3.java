package operator;

public class Operator3 {
    public static void main(String[] args) {
        // 연산자 우선순위
        // 일반적인 수학 우선순위와 같다.
        // 괄호를 적극적으로 사용해서 구분해놓자.
        int sum1 = 1 + 2 * 3; // 1 + (2 * 3)
        int sum2 = (1 + 2) * 3;
        System.out.println("sum1 = "+ sum1);
        System.out.println("sum2 = "+ sum2);
    }
}
