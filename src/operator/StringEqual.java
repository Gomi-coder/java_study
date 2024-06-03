package operator;

import java.util.Objects;

/**
 * Created by Iju on 2024-06-03
 * ****
 * 문자열 비교에 대한 Java의 특성
 * ****
 * Java에서는 문자열을 비교할 때 == 연산자를 사용하면 안 된다.
 * == 연산자는 객체의 참조를 비교함.
 * 따라서 문자열 값이 같더라도 == 연산자는 false를 반환할 수 있다.
 * ****
 * 결론 : 문자열 값을 비교할 때는 String.equals() 메서드를 사용.
 * String.equals() 메서드는 null 안정성을 제공하면서 정확하게 값을 비교.
 */

public class StringEqual {
    public static void main(String[] args) {
        // StringEqual 클래스의 인스턴스 생성
        StringEqual stringEqual = new StringEqual();

        // solution1 메서드 호출
        int result1 = stringEqual.solution1("<", "=", 5, 10);
        System.out.println("Result of solution1: " + result1); // 출력: 1

        // solution2 메서드 호출
        int result2 = stringEqual.solution2(">", "=", 5, 10);
        System.out.println("Result of solution2: " + result2); // 출력: 0

        // 추가 테스트
        int result3 = stringEqual.solution1(">", "", 15, 10);
        System.out.println("Result of solution1: " + result3); // 출력: 1

        int result4 = stringEqual.solution2("<", "", 15, 10);
        System.out.println("Result of solution2: " + result4); // 출력: 0
    }

    // 메서드 1
    public int solution1(String ineq, String eq, int n, int m) {
        boolean answer;
        if (Objects.equals(eq, "=")) {
            answer = (Objects.equals(ineq, "<")) ? (n <= m) : (n >= m);
        } else {
            answer = (Objects.equals(ineq, "<")) ? (n < m) : (n > m);
        }
        return answer ? 1 : 0;
    }

    // 메서드 2
    public int solution2(String ineq, String eq, int n, int m) {
        boolean answer;
        if (eq.equals("=")) {
            answer = (ineq.equals("<")) ? (n <= m) : (n >= m);
        } else {
            answer = (ineq.equals("<")) ? (n < m) : (n > m);
        }
        return answer ? 1 : 0;
    }

}
