package objectOriented.SubClass;

/**
 * Created by Iju on 2024-07-26
 */
public class PolySuper {
    public int superV1;

    public PolySuper() {
        System.out.println("PolySuper의 생성자");
    }

    public PolySuper(int a) {
        System.out.println("부모 클래스의 생성자2번, a is " + a);
    }

    public void superMethod() {
        System.out.println("SuperClass의 메서드 - superV1: " + superV1);
    }

    public void superMethod2() {
        System.out.println("superClass의 메서드2");
    }
}
