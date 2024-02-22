import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        // TODO : learn Java's annotation
        // 한 줄 짜리 주석
        /*
        여러 줄 짜리 주석
        */

        ///////////////////////////////////////////
        // TODO : how to print
        // ( ) 안의 내용을 출력하고 줄바꿈
        System.out.println("안녕하세요");
        System.out.println("반갑습니다");

        // ( ) 안의 내용을 출력. 줄바꿈 없음.
        System.out.print("오늘 날씨는 ");
        System.out.print("흐림");

        // 커서 위치 다음 줄로 옮기기
        System.out.println();
        System.out.println("줄바꿈 확인");

        // 숫자 출력 : 따옴표로 묶지 않아도 출력할 수 있음
        System.out.println(100);

        ///////////////////////////////////////////
        // TODO : 출력 서식을 가진 출력문
        // 정수 출력
        System.out.printf("정수 : %d\n", 100);
        System.out.printf("정수 : %d %d\n", 200, 300);
        // 자리수 채우기
        System.out.printf("%10d\n", 10);
        System.out.printf("%010d\n", 10);
        // 정수 범위 확인
        System.out.printf("%d ~ %d\n", -2147483648, 2147483647);
        // Error
        // System.out.printf("%d ~ %d\n", -2147483649, 2147483648);
        // 더 많은 숫자를 수용할 수 있게 더 넓은 기억 공간 잡기
        System.out.printf("%d ~ %d\n", -2147483649L, 2147483648L);
        System.out.printf("%d ~ %d\n", -9223372036847758081L, 9223372036847750807L);

        // 문자 찍기 (문자 한 개 => 작은 따옴표)
        System.out.printf("%c", 'a');

        // 실수 찍기
        System.out.printf("%f\n", 123.456);
        // 정수 부분은 제어가 되지 않음. 소수점 부분만 제어가 됨.
        System.out.printf("%2.2f\n", 123.456);
        System.out.printf("%.2f\n", 123.456);

        // 문자열
        System.out.printf("%s", "문자열 출력");
        System.out.printf("%s %d\n", "문자열과 정수열 섞어서 출력", 200);

        ///////////////////////////////////////////
        // TODO : 변수와 자료형 공부
        // 논리형(boolean)
        boolean bool1 = true;   // 참
        boolean bool2 = false;  // 거짓
        System.out.println("bool1 : " + bool1);
        System.out.println("bool2 : " + bool2);

        // 문자형
        char char1 = 65;
        char char2 = 'A';
        System.out.println("char1 : " + char1);
        System.out.println("char2 : " + char2);

        // 정수형
        byte byte1 = -128;
        byte byte2 = 127;
        System.out.println("byte1 : " + byte1);
        System.out.println("byte2 : " + byte2);

        short short1 = -32768;
        short short2 = 32767;
        System.out.println("short1 : " + short1);
        System.out.println("short2 : " + short2);

        int int1 = -2147483648;
        int int2 = 2147483637;
        System.out.println("int1 : " + int1);
        System.out.println("int2 : " + int2);

        long long1 = -922337203684775808L;
        long long2 = 922337203684775807L;
        System.out.println("long1 : " + long1);
        System.out.println("long2 : " + long2);

        // 실수형
        float float1 = -12.34f;
        float float2 = 12.34f;
        System.out.println("float1 : " + float1);
        System.out.println("float2 : " + float2);

        double double1 = 12.34;
        double double2 = -12.34;
        System.out.println("double1 : " + double1);
        System.out.println("double2 : " + double2);

        // 문자열
        String str0 = "안녕하세요";
        System.out.println("str : " + str0);

        ///////////////////////////////////////////
        // TODO : 표준 입출력
//        try {
//            /*
//            int a1 = System.in.read();
//            // CR과 LF 때문에 입력을 두 번 더 받아야 함.
////          System.in.read();
////          System.in.read();
//            System.out.println("a1 : " + a1);
//
//            int a2 = System.in.read();
//            System.out.println("a2 : " + a2);
//             */
//            InputStreamReader ir = new InputStreamReader(System.in);
//            BufferedReader br = new BufferedReader(ir);
//
//            String str = br.readLine();
//            System.out.println(str);
//
//            char c1 = (char) System.in.read();
//            System.out.println("c1 : " + c1);
//        } catch (Exception e) {
//        }
        ///////////////////////////////////////////
        // TODO : learn 연산자, 우선 순위
        // 최우선 연산자
        int a1 = 1 + 2 * 3;
        System.out.println(" 1 + 2 * 3 = " + a1);

        int a2 = (1 + 2) * 3;
        System.out.println("(1 + 2) * 3 = " + a2);

        // 단항 연산자
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

        // 산술 연산자
        System.out.println("100 + 200 = " + (100 + 200));
        System.out.println("100 - 200 = " + (100 - 200));
        System.out.println("100 * 200 = " + (100 * 200));
        System.out.println("100 / 200 = " + (100 / 200));
        System.out.println("100 % 200 = " + (100 % 200));

        // 문자열 + 숫자형 혹은 숫자형 + 문자형
        // 문자열과 숫자형이 만나면 뒤 숫자형이 문자열로 바뀜(문자열과 더하기 때문.)
        System.out.println("100" + 200 + 300); //100200300이 출력
        System.out.println(100 + 200 + "300"); // 300300이 출력

        // 시프트 연산자
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

        // 관계 연산자
        System.out.println("100 > 10 : " + (100 > 10));
        System.out.println("100 < 10 : " + (100 < 10));
        System.out.println("100 >= 10 : " + (100 >= 10));
        System.out.println("100 <= 10 : " + (100 <= 10));
        System.out.println("100 != 10 : " + (100 != 10));

        // 비트 연산자
        System.out.printf("%32s %d\n", Integer.toBinaryString(100), 100);
        System.out.printf("%32s %d\n", Integer.toBinaryString(200), 200);
        System.out.printf("%32s %d\n", Integer.toBinaryString(100 & 200), 100 & 200);
        System.out.printf("%32s %d\n", Integer.toBinaryString(100 | 200), 100 | 200);
        System.out.printf("%32s %d\n", Integer.toBinaryString(100 ^ 200), 100 ^ 200);

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

        // 삼항연산자
        int k3 = 10 > 20 ? 100 : 200;
        System.out.println(k3);

        // 배정대입연산자
        k1 = 100;
        k2 = 100;
        System.out.println((k1 += 2) + " " + (k2 = k2 + 2));
        System.out.println((k1 /= 2) + " " + (k2 = k2 / 2));

        // 후위형 증감연산자
        k1 = 100;
        k2 = ++k1;
        System.out.println(k1 + " " + k2);

        k1 = 100;
        k2 = k1++;
        System.out.println(k1 + " " + k2);
    }
}