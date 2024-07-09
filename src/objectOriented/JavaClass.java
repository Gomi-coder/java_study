package objectOriented;

import objectOriented.SubClass.ForJavaClass;

/**
 * Created by Iju on 2024-07-09
 * 클래스의 설계 방법
 * 1. 클래스에 대한 문법
 *     - class 클래스이름
 *     - { } 사이에 클래스의 내용을 작성
 *     - 맴버 변수와 맴버 메서드를 가진다.
 * *
 * 2. 객체의 생성 및 접근
 *     - new 클래스이름();
 *     - new를 통해 객체를 생성하면 생성된 객체의 메모리의 주소 값을 넘겨준다.
 *     - 이 주소값을 변수에 받아 두었다가 이후에 사용할 때 이 주소값을 이용하여 접근.
 *     - 주소값을 담는 변수를 가르켜 참조 변수라고 부름.
 *     - 참조 변수를 통해 멤버에 접근할 때는 "참조변수.멤버"라고 기술하여 사용.
 */
public class JavaClass {
    public static void main(String[] args){
        // 객체 생성, 객체에 접근하기 위한 주소값을 담는 참조 변수
        ForJavaClass c1 = new ForJavaClass();

        // 맴버의 접근
        c1.setVa(100);
        c1.vaa = 300;
        // 현재 forJavaClass가 JavaClass와 다른 패키지에 있음.
        // va 변수는 접근 제어가자 default → 직접 접근 불가
        // vaa 변수는 접근 제어자가 public → 직접 접근 가능
        System.out.println(c1.getVa());
        System.out.println(c1.vaa);

        c1.setVa(1000);
        System.out.println(c1.getVa());

        ForJavaClass c2 = new ForJavaClass();
        c2.setVa(200);
        System.out.println(c2.getVa());

        c2.setVa(2000);
        System.out.println(c2.getVa());

        // c1은 1000 유지
        System.out.println(c1.getVa());
    }
}
