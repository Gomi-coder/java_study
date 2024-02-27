package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BufferedReader와 InputStreamReader를 사용하여 콘솔 입력 받기.
 */
public class UseBufferedReader {
    public static void main(String[] args) throws IOException {
        // BufferedReader 기본 사용
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 정수 한 개 입력 받기.
        System.out.println("나이를 입력하세요 : ");
        int age = Integer.parseInt(reader.readLine());

        System.out.println("당신의 나이는 " + age + "살");

        // 문자 한 개 입력 받기.
        System.out.println("문자 한 개를 입력하세요 : ");
        char chr = (char) reader.read();
        System.out.println("입력한 문자는 " + chr);

        // 문자 7개 입력 받기.
        System.out.println("문자 7개를 입력하세요.");
        char[] characters = new char[7];
        for (int i = 0; i<7; i++){
            characters[i] = (char) reader.read();
            // 개행 문자 \n 제거
            reader.readLine();
        }

        // 문장 여러 줄 입력 받기.
        String[] sentences = new String[3];
        System.out.println("문장 세 개를 입력하세요.");
        for (int i = 0; i<3; i++){
            sentences[i] = reader.readLine();
        }

        // 입력 받은 문장 출력.
        System.out.println("입력한 문장은 ");
        for (String sentence : sentences){
            System.out.println(sentence);
        }
    }
}
