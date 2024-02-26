package operator;

/* 최우선 연산자

- . : 메모리에 생성된 객체의 멤버에 접근 / 특정 매개체의 하위에 접근할 때 사용
- [ ] : 배열에서 요소에 접근하고자 할 때 사용
- ( ) : 수식에서 연산의 우선 순위를 조정하고자 할 때 사용
*/

public class HighestPriority {
    public static void main(String[] args) {
        int a1 = 1 + 2 * 3;
        System.out.println(" 1 + 2 * 3 = " + a1);

        int a2 = (1 + 2) * 3;
        System.out.println("(1 + 2) * 3 = " + a2);
    }
}
