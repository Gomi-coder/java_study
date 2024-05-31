package variable;

/**
 * Created by Iju on 2024-05-31
 */

/* 2. 참조하는 변수 유형의 형변환
 * - 업캐스팅(Upcasting) : 자동으로
 * - 다운캐스팅(Downcasting)
 * */
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches");
    }
}

public class TypeConversion2 {
    public static void main(String[] args) {
        // 업캐스팅 (Upcasting)
        Animal animal = new Dog(); // 업캐스팅
        animal.sound(); // 출력: Dog barks

        // 다운캐스팅 (Downcasting)
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // 다운캐스팅
            dog.fetch(); // 출력 : Dog fetches
        }
    }
}
