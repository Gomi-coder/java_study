package operator;

/* 비트 연산자

- & : 두 수를 2진수로 변환한 후 각 자리를 비교하여 둘 다 1일 경우만 1이 되는 연산자
- | : 두 수를 2진수로 변환한 후 각 자리를 비교하여 둘 중에 하나라도 1이면 1이 되는 연산자
- ^ : 두 수를 2진수로 변환한 후 각 자리를 비교하여 두 비트가 같으면 0, 다르면 1이 되는 연산자
*/

public class Bit {
    public static void main(String[] args) {

        System.out.printf("%32s %d\n", Integer.toBinaryString(100), 100);
        System.out.printf("%32s %d\n", Integer.toBinaryString(200), 200);
        System.out.printf("%32s %d\n", Integer.toBinaryString(100 & 200), 100 & 200);
        System.out.printf("%32s %d\n", Integer.toBinaryString(100 | 200), 100 | 200);
        System.out.printf("%32s %d\n", Integer.toBinaryString(100 ^ 200), 100 ^ 200);

    }
}
