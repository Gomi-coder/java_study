package control.loop;

/**
 * for(초기식; 조건식; 증감식){
 * 코드
 * }
 * - for문을 사용하기 위해서는 변수가 필요함.
 * - 변수 값이 어떻게되는지에 따라 반복 여부를 결정.
 * - 반복 여부를 결정할 때 사용하는 변수를 제어 변수라고 부름.
 * - 초기식을 먼저 수행하고 조건식을 통해 검사한 후 조건식이 참이면 코드를 수행하고 증감식을 수행.
 * - 초기식 → 조건식 → 코드 → 증감식 → 조건식 → 코드 → 증감식 → ...
 */
public class For1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("안녕하세요");
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(i + 1);
        }

        // 2중 for문
        for (int k = 2; k < 10; k++) {
            for (int i = 0; i < 9; i++) {
                System.out.printf("%d * %d = %d\n", k, i + 1, 2 * (i + 1));
            }
        }
    }
}
