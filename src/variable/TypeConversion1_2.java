package variable;

/**
 * Created by Iju on 2024-05-31
 * *
 * 문자열 ↔ 숫자
 * *
 * 1. 문자열을 숫자로 형변환
 * - Integer.parseInt() : 문자열 → 정수
 * - Double.parseDouble() : 문자열 → 실수
 * *
 * 2. 숫자를 문자열로 형변환
 * - String.valueOf()
 * - Integer.toString() : 정수 → 문자열
 * - Double.toString() : 실수 → 문자열
 * *
 * 3. 문자를 정수형으로 형변환 (char → Integer)
 * - Character.getNumbericValue()
 */
public class TypeConversion1_2 {
    public static void main(String[] args) {
        // 문자열을 정수로 변환
        String str1 = "2";
        int num1 = Integer.parseInt(str1);
        System.out.println(num1); // 출력: 2

        // 문자열을 실수로 변환
        String str2 = "3.14";
        double num2 = Double.parseDouble(str2);
        System.out.println(num2); // 출력: 3.14

        // 정수를 문자열로 변환 1
        int num3 = 7;
        String str3 = Integer.toString(num3);
        System.out.println(str3); // 출력: "7"

        // 정수를 문자열로 변환 2
        int num4 = 7;
        String str4 = String.valueOf(num4);
        System.out.println(str4); // 출력: "7"

        // 실수를 문자열로 변환 1
        double num5 = 3.14;
        String str5 = Double.toString(num5);
        System.out.println(str5); // 출력: "3.14"

        // 실수를 문자열로 변환 2
        double num6 = 3.14;
        String str6 = String.valueOf(num6);
        System.out.println(str6); // 출력: "3.14"

        // 문자를 정수로
        String numberString = "78720646226947352489";
        char idx7 = numberString.charAt(7); // 특정 인덱스, 특정 위치의 문자
        int idx7toInt = Character.getNumericValue(idx7);
        System.out.println(idx7toInt);
    }
}
