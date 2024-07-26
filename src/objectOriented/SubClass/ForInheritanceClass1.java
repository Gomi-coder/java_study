package objectOriented.SubClass;

/**
 * Created by Iju on 2024-07-26
 */
public class ForInheritanceClass1 extends ForInheritanceClass2{
    public int v1;

    public void method1() {
        System.out.println("ForInheritance의 변수 v1 : " + v1);
    }

    public void method3(){
        v2 = 1000;
        method2();
    }
}
