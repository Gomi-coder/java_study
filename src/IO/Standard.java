package IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Standard {
    public static void main(String[] args) {
        // TODO : 표준 입출력
        try {
            /*
            int a1 = System.in.read();
            // CR과 LF 때문에 입력을 두 번 더 받아야 함.
//          System.in.read();
//          System.in.read();
            System.out.println("a1 : " + a1);

            int a2 = System.in.read();
            System.out.println("a2 : " + a2);
             */
            InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(ir);

            String str = br.readLine();
            System.out.println(str);

            char c1 = (char) System.in.read();
            System.out.println("c1 : " + c1);
        } catch (Exception e) {
        }
    }
}
