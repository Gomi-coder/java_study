package operator;

/* 관계 연산자

- > : 좌측의 값이 우측의 값보다 크면 true, 작거나 같으면 false
- < : 좌측의 값이 우측의 값보다 작으면 true, 크거나 같으면 false
- >= : 좌측의 값이 우측의 값보다 크거나 같으면 true, 작으면 false
- <= : 좌측의 값이 우측의 값보다 작거나 같으면 true, 크면 false
- == : 좌측의 값과 우측의 값이 같으면 true, 다르면 false
- != : 좌측의 값과 우측의 값이 다르면 true, 같으면 false
*/

public class Relation {
    public static void main(String[] args){

        // 관계 연산자
        System.out.println("100 > 10 : " + (100 > 10));
        System.out.println("100 < 10 : " + (100 < 10));
        System.out.println("100 >= 10 : " + (100 >= 10));
        System.out.println("100 <= 10 : " + (100 <= 10));
        System.out.println("100 != 10 : " + (100 != 10));

    }
}
