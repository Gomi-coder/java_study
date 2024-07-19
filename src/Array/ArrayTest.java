package Array;

/**
 * Created by Iju on 2024-07-19
 * ******
 * 배열의 생성
 * - 자료형 [] 배열명 = new 자료형[개수];
 * - 자료형 배열명 [] = new 자료형[개수];
 * - 참조 변수를 선언할 때 []의 위치는 관계가 없음.
 * - 자바에서는 []가 중간에 들어가는 것을 더 많이 사용
 * ******
 * 배열의 초기화
 * - 배열은 선언과 동시에 초기화를 할 수 있다.
 * - 배열에 넣어주는 데이터의 개수만큼 자동으로 배열이 생성됨.
 * - int [] array = {1, 2, 3, 4, 5}; // 5개짜리 배열 생성.
 * ******
 * 배열의 접근
 * - 만들어진 변수의 순서대로 인덱스 번호가 붙게 됨.
 * - array[0]은 첫 번째 변수, array[1]은 두 번째 변수에 접근.
 * - []안의 숫자를 첨자라고 부름.
 * ******
 * 다차원 배열
 * - 1차원 배열과 같은 방법으로 접근
 * - 첨자를 배열의 차수만큼 작성해서 접근을 함.
 */

public class ArrayTest {
    public static void main(String[] args) {
        int[] a1 = new int[10];
        int a2[] = new int[10];

        // 배열의 개수
        System.out.println("a1의 개수: " + a1.length);
        System.out.println("a2의 개수: " + a2.length);

        // 배열 초기화
        int[] a3 = {1, 2, 3};
        System.out.println("a3의 개수: " + a3.length);

        // 배열 접근, 출력
        for (int i = 0; i < a3.length; i++)
            System.out.printf("a[%d] = %d\n", i, a3[i]);

        // 2차원 배열
        int[] a4[] = new int[3][5];
        int a5[][] = new int[3][5];
        System.out.println("a4의 개수: " + a4.length);
        System.out.println("a4[0]의 개수: " + a4[0].length);

        // 2차원 배열의 초기화
        int[][] a6 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // 2차원 배열 출력
        for(int i = 0; i < a6.length; i++)
            for(int j = 0; j <a6[i].length; j++)
                System.out.printf("a6[%d][%d] = %d\n", i, j, a6[i][j]);
    }

}
