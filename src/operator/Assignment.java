package operator;

/* 배정 대입 연산자 (복합 대입 연산자)

=, +=, -=, *=, /= %=, <<=, >>=, ^=, &=, !=
 */

public class Assignment {
    public static void main(String[] args) {
        int k1 = 100;
        int k2 = 100;
        System.out.println((k1 += 2) + " " + (k2 = k2 + 2));
        System.out.println((k1 /= 2) + " " + (k2 = k2 / 2));

    }
}
