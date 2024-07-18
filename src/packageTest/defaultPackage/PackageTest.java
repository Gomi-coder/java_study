package packageTest.defaultPackage;

//import packageTest.Package1.PClass1;
//import packageTest.Package1.PClass2;
import packageTest.Package1.*;


/**
 * Created by Iju on 2024-07-18
 *  패키지의 정의?
 *  - 자바 프로그램을 작성할 때 소스 코드 파일이 너무 많으면 관리가 힘들어짐.
 *  - 많은 소스코드들을 개발자 나름대로의 기준을 삼아 나눠서 관리하기 위한 방법.
 *  - 자바에서는 패키지를 폴더 단위로 구분
 *  - 같은 패키지에 있는 클래스는 자유롭게 사용 가능
 *  - 패키지가 다른 클래스의 경우 import를 통해 코드에 포함시켜주면 사용 가능.
 *  !!정리!!
 *  - 패키지? 자바 클래스를 작성할 때 클래스를 폴더 별로 나누어 관리하는 것
 *  - 압축파일 형태로 제공할 수도 있다.
 *  ************
 *  기본 패키지?
 *  - 제공되어지는 모든 패키지 중에서 java.lang 패키지는 import없이도 사용 가능.
 *  - java.lang 안에는 자바 프로그램을 만들고 실행시키기 위한 가장 기본적인 클래스들과 가장 중요한 클래스들이 있음.
 *  - 자바는 수십 개의 패키지를 제공
 *  - 클래스를 사용하는 목적에 따라 나누어 제공
 *  - 이러한 패키지에 들어 있는 클래스들을 사용함으로써 프로그램 작성.
 *  ************
 */
public class PackageTest {
    public static void main(String[] args){
        PClass1 p1c1 = new PClass1();
        PClass2 p1c2 = new PClass2();

        p1c1.method1();
        p1c2.method1();

        packageTest.Package2.P2Class1 p2c1 = new packageTest.Package2.P2Class1();
        packageTest.Package2.P2Class2 p2c2 = new packageTest.Package2.P2Class2();
    }
}
