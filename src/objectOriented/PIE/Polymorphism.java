package objectOriented.PIE;

import objectOriented.SubClass.PolySub;
import objectOriented.SubClass.PolySuper;

/**
 * Created by Iju on 2024-07-26
 * *
 * [참조변수를 통한 객체 접근]
 * 클래스로부터 객체를 생성하고 생성된 객체의 주소 값을 참조 변수에 넣어 줄 때,
 * 참조 변수의 타입에 따라 생성된 객체에 접근할 수 있는 영역은 달라진다.
 * *
 * [메서드의 Overriding]
 * - 부모 클래스가 가지고 있는 메서드를 자식 클래스에서 다시 구현한 것
 * - 메서드 Overriding을하고 부모 클래스의 메서드를 호출하고자 할 때는 super를 이용
 */
public class Polymorphism {
    public static void main(String[] args) {
        PolySub c1 = new PolySub();

        c1.superV1 = 100;
        c1.superMethod();

        c1.subV1 = 300;
        c1.subMethod();

        c1.superMethod2();


        PolySuper super1 = new PolySuper();

        super1.superV1 = 200;
        super1.superMethod();

        super1.superMethod2();
    }
}
