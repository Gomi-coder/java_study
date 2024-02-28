package control.branch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 숫자를 입력 받아서 입력 받은 숫자가 3의 배수인지 아닌지 판단하여 출력하는 프로그램.
 * 1. BufferedReader를 사용하여 라인 단위 입력 받기.
 * 2. 입력 받은 문자열을 숫자로 변환하는 것은 Integer.parseInt사용.
 */
public class If3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("숫자를 입력하세요 : ");
        int n = Integer.parseInt(reader.readLine());

        if ((n % 3 == 0) && n != 0)
            System.out.println("3의 배수 입니다.");
        else
            System.out.println("3의 배수가 아닙니다.");
    }
}
