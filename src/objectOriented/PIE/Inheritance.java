package objectOriented.PIE;

import objectOriented.SubClass.ForInheritanceClass1;

/**
 * Created by Iju on 2024-07-26
 * [상속]
 * - 클래스를 만들 때 다른 클래스가 가지고 있는 메서드 혹은 변수를 가져와서 사용하는 방법 중 하나
 * - 참조와는 달리 메서드와 변수를 물려받아 자기 자신 것처럼 사용
 * - 기존에 만든 클래스에 새로운 기능을 추가하거나 이미 만들어진 메서드를 다시 구현할 경우 사용
 * - 기존에 만들어진 클래스를 직접 손대지 않고 추가 혹은 수정 가능
 * - 자바는 다중 상속 지원 안 함 (단일 상속만 지원)
 * - 자바는 상속을 위한 코드를 작성하지 않으면(개발자가 직접 상속 x할 경우) object라는 클래스를 자동으로 상속
 * - 물려주는 쪽을 부모 클래스(Super Class)
 * - 받는 쪽을 자식 클래스(Sub Class)
 * - class 클래스이름 extends 부모클래스
 */
public class Inheritance {
    public static void main() {
        ForInheritanceClass1 c1 = new ForInheritanceClass1();
        c1.v1 = 100;
        c1.method1();

        c1.v2 = 200;
        c1.method2();

        c1.method3();
    }
}
