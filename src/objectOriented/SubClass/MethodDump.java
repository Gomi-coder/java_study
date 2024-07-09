package objectOriented.SubClass;

/**
 * Created by Iju on 2024-07-09
 */
public class MethodDump {
    public void method1() {
        System.out.println("1번 메서드");
    }

    public void method2() {
        method1();
        System.out.println("2번 메서드");
    }

    public void tripleAdd(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("연산 값 : " + result);
    }

    public int resultAdd(int a, int b) {
        return a + b;
    }

    /* 메서드의 Overloading
    - 클래스 내부의 모든 메서드들은 그 이름이 모두 달라야 한다
    - 객체 지향 프로그래밍 언어에서는 같은 이름으로 여러 개의 메서드를 만들어 사용하는 것을 지원.
        (개발자가 메서드 사용을 좀 더 편하게 할 수 있도록)
    - 메서드의 이름이 같을 경우 내부의 매개변수를 가지고 구분을 하게 됨.
    - 즉, 이름은 같지만 매개변수의 형태가 다를 경우 다른 매서드로 취급.
    */
    public int resultAdd(int a, int b, int c) {
        return a + b + c;
    }
}
