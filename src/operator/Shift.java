package operator;

/* 시프트 연산자
- << : 비트를 왼쪽으로 이동시켜주는 연산
- >> : 비트를 오른쪽으로 이동시켜주는 연산 (부호 유지)
- >>> : 비트를 오른쪽으로 이동시켜주는데 무조건 0으로 채워짐.
*/

public class Shift {
    public static void main(String[] args) {
        // 오른쪽 시프트는 나누기 2의 효과가 있다.
        // 오른쪽 시프트 3번은 나누기 8(2 * 2 * 2)의 효과가 있다.
        System.out.printf("%32s %d\n", Integer.toBinaryString(100), 100); // 정수 100을 이진수로 출력
        System.out.printf("%32s %d\n", Integer.toBinaryString(100 >> 1), 100 >> 1);
        System.out.printf("%32s %d\n", Integer.toBinaryString(100 >> 2), 100 >> 2);

        System.out.println();

        // 우측 시프트는 곱하기 2의 효과가 있다.
        System.out.printf("%32s %d\n", Integer.toBinaryString(200), 200);
        System.out.printf("%32s %d\n", Integer.toBinaryString(200 << 1), 200 << 1);
        System.out.printf("%32s %d\n", Integer.toBinaryString(200 << 2), 200 << 2);

        System.out.println();

        System.out.printf("%32s %d\n", Integer.toBinaryString(-100), -100);
        System.out.printf("%32s %d\n", Integer.toBinaryString(-100 >> 1), -100 >> 1);
        // 암호화 모듈 등 특별한 상황에서 사용.
        System.out.printf("%32s %d\n", Integer.toBinaryString(-100 >>> 1), -100 >>> 1);

    }
}
