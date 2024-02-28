package control.branch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 숫자 두 개와 연산자(+,-,*,/)를 입력 받아 그에 맞는 연산을 수행한 후 결과를 출력하는 프로그램.
 * 1. BufferedReader를 사용하여 라인 단위 입력을 받기.
 * 2. 입력받은 문자열을 숫자로 변환하는 것은 Integer.parseInt를 사용.
 * 3. switch~case문 사용.
 */
public class SwitchCase2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("두 개의 정수와 연산자를 입력 하세요 (띄어쓰기로 구분) : ");
        String[] input = reader.readLine().split(" ");
        int flag1 = Integer.parseInt(input[0]), flag2 = Integer.parseInt(input[1]);
        char op = input[2].charAt(0);

        int result = 0;
        switch (op) {
            case '+':
                result = flag1 + flag2;
                break;
            case '-':
                result = flag1 - flag2;
                break;
            case '*':
                result = flag1 * flag2;
                break;
            case '/':
                result = flag1 / flag2;
                break;
        }

        System.out.printf("%d %c %d = %d", flag1, op, flag2, result);
    }
}
