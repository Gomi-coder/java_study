package IO;

import java.util.Scanner;

/**
 * Created by Iju on 2024-05-23
 *
 * 1. 대문자 ↔ 소문자 변환
 * 2. 문자열을 n번 반복하여 출력
 */
public class Print3 {
    public static void main(String[] args) {
        String str = "Hello World";

        // 문자열을 대문자로 변환
        String upperCaseStr = str.toUpperCase();
        System.out.println("대문자로 변환: " + upperCaseStr);

        // 문자열을 소문자로 변환
        String lowerCaseStr = str.toLowerCase();
        System.out.println("소문자로 변환: " + lowerCaseStr);

        ///////////////////////////////////////////////////
        // 문자열을 n번 반복하여 출력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 문자열을 n번 반복해서 출력
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }

        // 반복문이 끝나면 개행 문자로 줄 바꿈
        System.out.println();

        sc.close();
    }
}
