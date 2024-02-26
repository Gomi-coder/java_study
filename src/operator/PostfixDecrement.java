package operator;

/* 후위형 증감 연산자

--, ++ : 자기 자신의 값을 하나 증가하거나 감소
기본적으로 전위형 증감 연산자와 같지만 전위형은 연산작업을 수행 후 값을 전달하지만,
후위형은 값을 전달한 후 연산을 수행한다.
 */

public class PostfixDecrement {
    public static void main(String[] args) {
        int k1 = 100;
        int k2 = ++k1;
        System.out.println(k1 + " " + k2);

        k1 = 100;
        k2 = k1++;
        System.out.println(k1 + " " + k2);
    }
}
