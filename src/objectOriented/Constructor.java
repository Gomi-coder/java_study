package objectOriented;

/**
 * Created by Iju on 2024-07-25
 * *
 * [생성자]
 * java 클래스에서 객체를 생성할 때 자동으로 호출되는 메서드를 의미
 * return type이 없음.
 * 메서드의 이름은 클래스의 이름과 동일
 * 객체를 생성할 때 반드시 수행되어야 하는 코드가 있거나 초기화의 작업을 하는데 사용됨.
 * public 클래스명(매개변수){//...}
 * *
 * *
 * [생성자의 Overloading]
 * 1. default 생성자
 * 매개 변수가 없는 생성자를 뜻함.
 * 생성자를 클래스에 만들지 않으면 매개 변수가 없는 생성자가 자동으로 만들어 짐.
 * 내부에는 소스 코드가 없다.
 * *
 * 2. 매개 변수가 있는 생성자
 * 매개 변수가 있는 생성자를 만들 경우 default 생성자가 생성되지 않음.
 * 매개 변수의 형태를 다르게 하여 여러 개의 생성자를 생성할 수 있음.
 * 객체를 생성할 때 선택 가능.
 * */
public class Constructor {
     public static void main(String[] args){
         new Constructor();
         new Constructor(10);
         new Constructor(7, 9);
     }

    // default 생성자(매개변수가 없는 것)
    public Constructor(){
         System.out.println("Default 생성자");
    }

    // 매개변수가 있는 생성자
    public Constructor(int a){
         System.out.printf("%d를 넘겨 받은 생성자\n", a);
    }

    public Constructor(int a, int b){
         System.out.printf("%d, %d를 넘겨 받은 생성자\n", a, b);
    }
}
