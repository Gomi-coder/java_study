package objectOriented.SubClass;

/**
 * Created by Iju on 2024-07-26
 */
public class PolySub extends PolySuper {
    public int subV1;

    public PolySub() {
        super(100); // 호출할 부모 클래스의 생성자 선택
        System.out.println("자식 클래스의 생성자");
    }

    public void subMethod() {
        System.out.println("PolySub의 메서드 - subV1: " + subV1);
    }

    public void superMethod2() {
        System.out.println("자식 클래스에서 Overriding한 클래스");
        super.superMethod2();
    }
}
