package inputOutput;

import java.util.Scanner;

/**
 * Created by Iju on 2024-05-23
 * 코딩 테스트에서 자주 사용되는 입력 받기 연습
 * 1. next() 와 nextLine()의 차이
 * 2. 문자열과 정수를 혼합하여 입력 받기
 * 3. 정수 여러 개 공백을 기준으로 입력 받기
 */
public class UseScanner2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // next() 사용
        System.out.println("Enter a word:");
        String word = sc.next();
        System.out.println("You entered (next): " + word);

        // nextLine() 사용
        sc.nextLine(); // 다음 nextLine() 호출 전 입력 버퍼 비우기 (필수)
        System.out.println("Enter a line of text:");
        String line = sc.nextLine();
        System.out.println("You entered (nextLine): " + line);

        ///////////////////////////////////////////////////
        // 문자열과 정수를 공백을 기준으로 입력 받은 후 출력하기
        //////////////////////////////////////////////////
        System.out.println("Enter a string and an integer separated by a space:");
        String userInputString = sc.next(); // 문자열 입력 받기
        int userInputInt = sc.nextInt(); // 정수 입력 받기

        System.out.println("String: " + userInputString);
        System.out.println("Integer: " + userInputInt);

        /////////////////////////////////////////////////
        // 숫자 여러 개 공백을 기준으로 입력 받아 배열에 넣기
        ////////////////////////////////////////////////
        System.out.println("Enter numbers separated by spaces:");
        String inputLine = sc.nextLine(); // 한 줄을 통째로 문자열로 입력 받기

        // 입력된 문자열을 공백을 기준으로 분할하여 배열로 저장
        String[] numbersAsString = inputLine.split("\\s+");

        // 각 숫자들을 정수로 변환하여 사용
        for (String numberAsString : numbersAsString) {
            int number = Integer.parseInt(numberAsString);
            System.out.println("Number: " + number);
        }

        sc.close();
    }
}
