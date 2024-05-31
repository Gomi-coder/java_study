package variable;

/**
 * Created by Iju on 2024-05-31
 */

class Parent {
    void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child display");
    }

    void show() {
        System.out.println("Child show");
    }
}

public class TypeConversion2_Example {
    public static void main(String[] args) {
        Parent p = new Child(); // 업캐스팅
        p.display(); // 출력: Child display

        if (p instanceof Child) {
            Child c = (Child) p; // 다운캐스팅
            c.show(); // 출력: Child show
        }
    }
}
