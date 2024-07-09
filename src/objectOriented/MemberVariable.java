package objectOriented;

import objectOriented.SubClass.ForVariableClass;

/**
 * Created by Iju on 2024-07-09
 * ******
 * 클래스의 맴버 변수
 * - 클래스에서 선언되어 같은 클래스 내부라면 자유롭게 접근하여 사용할 수 있는 변수
 * - 중복된 이름으로 선언될 수 없다.
 * - 다른 클래스에서 접근하기 위해서는 "." 연산자를 이용.
 * *
 * 지역 변수
 * - 메서드 내부에서 선언된 변수
 * - 선언된 메서드 내부에서만 사용이 가능
 * - 클래스의 맴버 변수와 지역 변수의 이름이 동일할 경우 지역 변수가 우선이 됨.
 * - 클래스의 맴버 변수를 접근하기 위해서는 this를 이용.
 */
public class MemberVariable {
    public static void main(String[] args){
        ForVariableClass c1 = new ForVariableClass();

        c1.a = 100;
        System.out.println("c1.a = " + c1.a);

        c1.method1();
        c1.method2();
    }
}
