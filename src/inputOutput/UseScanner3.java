package inputOutput;

import java.util.Scanner;

/**
 * Created by Iju on 2024-06-03
 * 숫자 여러 개를 공백으로 받아서 처리하기 (split)
 * string 타입의 배열로 저장이 된다.
 */
public class UseScanner3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 한 줄 전체 입력받기
        System.out.println("두 개의 숫자를 공백으로 구분하여 입력 : ");
        String input = sc.nextLine();

        // 입력받은 문자열을 공백을 기준으로 나누기
        String[] parts = input.split(" ");

        // 각 부분을 정수로 변환하기
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[1]);

        // 결과 출력
        System.out.println("첫 번째 숫자 : " + num1);
        System.out.printf("두 번째 숫자: %d", num2);

        sc.close();
    }
}
