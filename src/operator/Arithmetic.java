package operator;

/* 산술 연산자

- +, -. *, / : 일반적인 4 칙 연산
- % : 나머지를 구하는 연산자
 */

public class Arithmetic {
    public static void main(String[] args) {

        System.out.println("100 + 200 = " + (100 + 200));
        System.out.println("100 - 200 = " + (100 - 200));
        System.out.println("100 * 200 = " + (100 * 200));
        System.out.println("100 / 200 = " + (100 / 200));
        System.out.println("100 % 200 = " + (100 % 200));

        // 문자열 + 숫자형 혹은 숫자형 + 문자형
        // 문자열과 숫자형이 만나면 뒤 숫자형이 문자열로 바뀜(문자열과 더하기 때문.)
        System.out.println("100" + 200 + 300); //100200300이 출력
        System.out.println(100 + 200 + "300"); // 300300이 출력

    }
}
