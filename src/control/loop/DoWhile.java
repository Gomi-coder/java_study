package control.loop;
import java.util.Scanner;

/**
 * Created by Iju on 2024-06-14
 * *
 * 코드의 일부분을 반복할 경우 사용
 * 반복 조건이 결정되어 있을 때 사용
 * *
 * do{
 *     코드
 * } while(조건식);
 * *
 * - 반복 횟수를 결정하지 못하고 반복할 조건이 있을 경우 사용
 * - 코드를 수행하고 마지막에 반복할 조건을 검사하므로,
 *   조건이 처음부터 거짓이라고 하더라도 코드는 한 번은 반드시 수행됨.
 */
public class DoWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        do{
            a *= a;
            System.out.printf("제곱 연산 후 : %a\n", a);
        } while(a < 100);

        // 사용자에게 입력을 받고 그 숫자가 100보다 작을 경우,
        // 계속 입력을 받아 숫자를 출력하시오.
        int num;
        do{
            num = sc.nextInt();
            System.out.printf("num is %d\n", num);
        }while(num < 100);

        sc.close();
    }
}
