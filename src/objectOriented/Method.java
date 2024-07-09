package objectOriented;

import objectOriented.SubClass.MethodDump;

/**
 * Created by Iju on 2024-07-09
 * 맴버 메서드
 * - 클래스 내에서 개발자가 만드는 소스 코드의 단위
 * - 클래스가 가지고 있는 기능들을 정의할 때 사용
 * - 개발자는 프로그래밍을 할 때 작성되는 소스 코드를 메서드 내부에 작성해야 함.
 * - 메서드는 클래스에서의 작업의 단위
 * *
 * 메서드 작성 문법
 * - [접근 제한자] [리턴 타입] 메서드 이름 ([매개 변수]) { 소스 코드 }
 * - 접근 제한자 : 같은 클래스 내부가 아닌 외부에서 접근하고자 할 때 제한을 두는 부분
 * - 리턴 타입 : 메서드의 코드를 수행한 후 값을 사용한 부분에 전달할 때 전달해주는 값의 타입.
 * - 매개 변수 : 메서드를 사용하는 부분에서 이 메서드에 값을 전달해주고자 할 때 매개변수를 통해 값을 사용.
 * *
 */
public class Method {
    public static void main(String[] args){
        MethodDump c1 = new MethodDump();
        c1.method1();

        c1.method2();

        c1.tripleAdd(100, 200, 800);

        int result = c1.resultAdd(298, 406);
        System.out.println("리턴 받은 값 : " + result);

        c1.resultAdd(487, 690, 354);
    }
}
