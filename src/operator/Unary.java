package operator;

/* 단항 연산자

- ! : true false false true로
- ~ : 숫자의 비트를 0은 1로, 1은 0으로
- +, - : 숫자의 부호를 결정
- ++, -- : 값을 1 증가시키거나 감소 시키는 연산자 (전위형)
- (cast) : 값의 타입을 변경할 때 사용
* */

public class Unary {
    public static void main(String[] args) {

        boolean bool3 = true;
        System.out.println("bool3 : " + bool3);
        System.out.println("!bool3 : " + !bool3);

        int i1 = 100;
        // 숫자를 이진수로 변환 후 문자열 형태로 전달
        System.out.printf("i1 : %32s\n", Integer.toBinaryString(i1));
        System.out.printf("~i1 : %32s\n", Integer.toBinaryString(i1));

        // 양수 값을 음수로 전환하는 방법
        // 2의 보수의 방법: 100의 절대값을 2진수로 구하고 비트 다 뒤집고 +1
        System.out.println(~i1); // 실행결과 : -101
        System.out.println(~i1 + 1); // 실행결과 : 100

        // 부호 연산자
        System.out.println(+i1);
        System.out.println(-i1);

        // 증감 연산자
        System.out.println("++i1 : " + ++i1);
        System.out.println(i1);

        System.out.println("--i1 : " + --i1);
        System.out.println(i1);

        // 캐스트
        i1 = 214712458;
        // short short3 = i1; // Error
        short s1 = (short) i1;
        long l1 = i1;
        System.out.println(l1);
        System.out.println(s1); // 엉뚱한 값 출력 됨.

    }
}
