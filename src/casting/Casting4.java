package casting;

public class Casting4 {

    public static void main(String[] args) {

        int div1 = 3 / 2;
        // int와 int로 계산했기 때문에 int가 나온다
        System.out.println("div1 = " + div1); //1

        // int와 int로 계산했기 때문에 int가 나온다
        double div2 = 3 / 2;
        System.out.println("div2 = " + div2); //1.0

        // double와 int로 계산했기 때문에 double가 나온다
        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3); //1.5

        // double과 int로 계산했기 때문에 double이 나온다.
        // 명시적 형변환 사용
        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4); //1.5

        int a = 3;
        int b = 2;
        // 이때 a앞에 double을 붙여줬기 때문에 double이 나온다.
        // 명시적 형변환 사용
        double result = (double) a / b;

        System.out.println("result = " + result); //1.5
    }
}
