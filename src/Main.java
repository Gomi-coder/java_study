public class Main {
    public static void main(String[] args) {
        // TODO : learn Java's annotation
        // 한 줄 짜리 주석
        /*
        여러 줄 짜리 주석
        */

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
    }
}