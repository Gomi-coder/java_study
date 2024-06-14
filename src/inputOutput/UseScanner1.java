package inputOutput;

import java.util.Scanner;

/**
 * Scanner 클래스를 사용하여 콘솔 입력 받기
 */
public class UseScanner1 {
    public static void main(String[] args) {
        // scanner의 기본 사용
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요 : ");

        //문장 입력 받기.
        String name = scanner.nextLine();
        System.out.println("안녕하세요, " + name + "님!");

        // 정수 n 입력 받기
        System.out.println("정수의 개수를 입력하세요 : ");
        int n = scanner.nextInt();

        // 정수를 n번 입력 받기.
        int[] numbers = new int[n];
        System.out.println(n + "개의 정수를 입력하세요.");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 입력 받은 n개의 정수들 출력하기.
        System.out.println("입력한 정수들은 : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // 문자 한 개 입력 받기
        System.out.println("문자 한 개를 입력하세요 : ");
        char character = scanner.next().charAt(0);
        System.out.println("입력한 문자는 " + character + "입니다.");

        scanner.close();
    }
}
