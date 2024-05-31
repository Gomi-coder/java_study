package variable;

/**
 * Created by Iju on 2024-05-31
 * *
 * Java의 데이터 형 변환
 * 값의 변수 유형을 다른 유형으로 변환하는 과정.
 * *
 * 크게 두 가지로 나눌 수 있음,
 * 1. 기본 변수 유형의 형변환
 * - 일치적 형변환(자동 형변환)
 * - 하부 형변환(강제 형변환)
 * *
 * 2. 참조하는 변수 유형의 형변환
 * - 업캐스팅(Upcasting) : 자동으로
 * - 다운캐스팅(Downcasting)
 */
public class TypeConversion1 {
    public static void main(String[] args) {
        /* 1. 기본 데이터 유형의 형변환
         * - 일치적 형변환(자동 형변환)
         * - 하부 형변환(강제 형변환)
         */
        // 자동 형변환
        int a = 10;
        double b = a; // int에서 double로 자동 형 변환
        System.out.println(b); // 출력 : 10.0

        // 강제 형변환
        double aa = 10.5;
        int bb = (int) aa; //double에서 int로 강제 형 변환
        System.out.println(bb); // 출력 : 10
    }
}
