package objectOriented;

/**
 * Created by Iju on 2024-06-03
 * *
 * 1. 클래스와 객체
 * - 클래스틑 객체의 청사진. 즉, 클래스는 데이터와 메서드를 정의
 * - 객체는 클래스의 인스턴스. 클래스를 통해 생성된 실체.
 * *
 * 2. 메서드
 * - 클래스 내에 정의된 함수.
 * - Java에서는 메서드가 객체에 속함.
 * - `static`메서드는 클래스에 속하며 객체를 생성하지 않고도 호출할 수 있음.
 * - 인스턴스 메서드는 객체의 메서드이기 때문에 객체를 생성한 후에 호출.
 * *
 * 참고 *
 * Java에서는 메서드를 호출할 때 반드시 메서드가 속한 클래스의 인스턴스를 생성하거나,
 * 해당 메서드가 `static` 메서드여야 한다.
 * *
 * ***메서드와 함수의 차이***
 * - 메서드는 클래스 내부에 정의된 함수.
 * - Java에서는 모든 함수가 클래스 내부에 정의되므로, 모든 함수는 메서드
 * - 함수는 독립적으로 존재할 수 있는 코드 블럭.
 * - C나 Python에서는 함수가 클래스에 존재하지 않고도 존재할 수 있음.
 */

public class ClassObjectMethod {
    // 인스턴스 메서드
    public int example1(String str, int n, int m){
        // 메서드 내용
        if (str.equals("yes")){
            return n;
        } else{
            return m;
        }
    }

    // 정적 메서드(Static Method)
    // 클래스에 속하며, 객체를 생성하지 않고도 호출할 수 있음.
    public static int example2(String str, int n, int m){
        if (str.equals("yes")){
            return m;
        } else {
            return n;
        }
    }

    public static void main(String[] args){
        // ClassObjectMethod 클래스의 인스턴스 생성
        ClassObjectMethod classObjectMethod = new ClassObjectMethod();

        // 인스턴스 메서드 호출
        int result1 = classObjectMethod.example1("no", 1, 2);
        System.out.println(result1);

        // 정적 메서드는 클래스 이름으로 호출
        int result2 = example2("no", 1, 2);
        System.out.println(result2);

        /* *결론!!
         * 인스턴스 메서드는 객체를 생성한 후에 호출해야 함.
         * 정적 메서드는 객체를 생성하지 않고 클래스 이름으로 호출할 수 있다.
         * Java에서는 메서드와 함수가 동일하게 사용되며,
         * 클래스 내부에 정의된 모든 함수는 메서드이다.
         */
    }
}
