package control.branch;

import java.util.Scanner;

/**
 * 사용자에게 숫자를 입력받아 짝수인지 홀수인지 0인지를 구분하는 프로그램을 작성.
 */
public class If2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int n = scanner.nextInt();

        if(n%2 == 0)
            System.out.println("짝수");
        else if(n%2 == 1)
            System.out.println("홀수");
        else
            System.out.print("0");
    }
}
