package objectOriented.SubClass;

/**
 * Created by Iju on 2024-07-09
 */
public class ForVariableClass {
    // 클래스의 맴버 변수
    public int a;

    public void method1(){
        // 지역 변수와 맴버 변수명이 같음.
        int a = 20;

        // 동일 클래스의 맴버 변수 자유롭게 접근 가능.
        System.out.println("클래스의 맴버 변수 a : " + this.a);

        System.out.println("메서드1의 지역 변수 a : " + a);
    }

    public void method2(){
        int a = 30;
        System.out.println("메서드2의 지역 변수 a : " + a);
    }
}
