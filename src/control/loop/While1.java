package control.loop;
import java.util.Scanner;

/**
 * Created by Iju on 2024-05-29
 * *
 * - 코드의 일부분을 반복할 경우 사용
 * - 반복 조건이 결정되어 있을 때 사용
 * *
 * while(조건식){
 *     코드
 * }
 * *
 * - 반복 횟수를 결정하지 못하고 반복할 조건이 있을 경우 사용
 * - 조건식을 먼저 검사하고 수행 여부를 결정하기 때문에,
 *   조건식이 처음부터 거짓이라면 코드는 단 한번도 수행되지 않는다.
 */
public class While1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while(a < 100){
            a += 10;
            System.out.printf("a is %d\n", a);
        }

        // 1부터 숫자를 하나씩 증가시켜 2, 3, 5로 나누어 떨어지지 않는 수 100개 출력.
        int cnt = 0;
        int num = 1;
        while(cnt < 100) {
            if (!(num % 2 == 0 || num % 3 == 0 || num % 5 == 0)){
                System.out.printf("%d : %d\n", cnt +1, num);
                cnt ++;
            }
            num ++;
        }

        sc.close();
    }
}
