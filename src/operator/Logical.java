package operator;

/* 논리 연산자

- && : 연산자를 기준으로 좌측과 우측에 관계 연산자가 있을 경우 두 값이 모두 true 이면 true, 하나라도 false 이면 false 를 반환.
- & : 기본적인 연산은 &&와 같지만 좌측 연산 결과 값이 false 라고 하더라도 이 후의 연산을 모두 수행.
- || : 연산자를 기준으로 좌측과 우측에 관계 연산자가 있을 경우 두 값 중 하나라도 true 면 true, 둘 다 false 라면 false 를 반환한다.
- | : 기본적인 연산은 ||와 같지만 좌측 연산 결과 값이 true 라고 하더라도 이후의 연산을 모두 수행.


&&는 좌측의 연산 결과 값이 false 라면 이후의 연산은 수행하지 않고 false 를 반환.
|| 는 좌측의 연산 결과 값이 true 라면 이후의 연산은 수행하지 않고 true 를 반환.
 */

public class Logical {
    public static void main(String[] args) {
        // 논리 연산자
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);
        System.out.println(false && true);

        System.out.println(2 > 1 && 3 > 2);
        System.out.println(2 > 1 && 3 < 1);
        System.out.println(2 < 1 && 3 > 2);
        System.out.println(2 < 1 && 3 < 2);

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        int k1 = 100;
        int k2 = 200;
        System.out.println(++k1 > 100 && ++k2 > 200);
        System.out.println(k1 + " " + k2);

        k1 = 100;
        k2 = 200;
        // &&는 앞의 조건이 false면 뒤의 계산은 하지 않는다.
        System.out.println(++k1 < 100 && ++k2 > 200);
        System.out.println(k1 + " " + k2); // k2는 200

        k1 = 100;
        k2 = 200;
        // &는 앞의 조건이 false라도 뒤의 계산까지 다 한다.
        System.out.println(++k1 < 100 & ++k2 > 200);
        System.out.println(k1 + " " + k2);

        k1 = 100;
        k2 = 200;
        // ||는 앞이 참이면 뒤의 연산은 하지 않는다.
        System.out.println(++k1 > 100 || ++k2 > 200);
        System.out.println(k1 + " " + k2);

        k1 = 100;
        k2 = 200;
        // |는 앞이 참이어도 뒤의 연산을 끝까지 한다.
        System.out.println(++k1 > 100 | ++k2 > 200);
        System.out.println(k1 + " " + k2);

    }
}
