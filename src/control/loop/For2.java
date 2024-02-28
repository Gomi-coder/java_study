package control.loop;

/**
 * Created by Iju on 2024-02-28
 */
public class For2 {
    public static void main(String[] args) {
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         * */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(1 + j + (i * 3) + " ");
            }
            System.out.println();
        }
    }
}
