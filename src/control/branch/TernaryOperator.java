package control.branch;
import java.util.Scanner;

/**
 * Created by Iju on 2024-06-03
 * * 삼항 연산자
 * variable = Expression1 ? Expression2 : Expression3
 * Expression1 조건이 true일 경우 variable = Expression2
 * Expression1 조건이 false일 경우 variable = Expression3
 * *
 * - 조건항? 항1 : 항2
 * - 조건항의 결과 값이 true면 항1, false면 항2를 반환.
 *
 */
public class TernaryOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] numList = sc.nextLine().split(" ");
        int a = Integer.parseInt(numList[0]), b = Integer.parseInt(numList[1]);
        int c;

        // 일반 if-else문
        if (a > b) {
            c = a - b;
        } else{
            c = b - a;
        }
        System.out.println(c);

        // 삼항 연산자 사용
        int d = (a > b) ? a - b : b - a;
        System.out.println(d);

        sc.close();
    }
}
