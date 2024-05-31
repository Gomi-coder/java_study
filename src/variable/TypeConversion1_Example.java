package variable;

/**
 * Created by Iju on 2024-05-31
 */
public class TypeConversion1_Example {
    public static void main(String[] args) {
        // 문자열을 숫자로 변환
        String strNum = "42";
        int intNum = Integer.parseInt(strNum);
        System.out.println("String to int: " + intNum); // 출력: String to int: 42

        String strDouble = "3.14";
        double doubleNum = Double.parseDouble(strDouble);
        System.out.println("String to double: " + doubleNum); // 출력: String to double: 3.14

        // 숫자를 문자열로 변환
        int num1 = 7;
        String str1 = Integer.toString(num1);
        System.out.println("Int to String: " + str1); // 출력: Int to String: 7

        double num2 = 2.718;
        String str2 = Double.toString(num2);
        System.out.println("Double to String: " + str2); // 출력: Double to String: 2.718

        // 다른 방법으로 숫자를 문자열로 변환
        String str3 = String.valueOf(num1);
        System.out.println("Int to String using valueOf: " + str3); // 출력: Int to String using valueOf: 7

        String str4 = String.valueOf(num2);
        System.out.println("Double to String using valueOf: " + str4); // 출력: Double to String using valueOf: 2.718
    }
}

