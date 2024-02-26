package variable;

// TODO : 변수와 자료형 공부
public class DataType {
    public static void main(String[] args) {
        // 논리형(boolean)
        boolean bool1 = true;   // 참
        boolean bool2 = false;  // 거짓
        System.out.println("bool1 : " + bool1);
        System.out.println("bool2 : " + bool2);

        // 문자형
        char char1 = 65;
        char char2 = 'A';
        System.out.println("char1 : " + char1);
        System.out.println("char2 : " + char2);

        // 정수형
        byte byte1 = -128;
        byte byte2 = 127;
        System.out.println("byte1 : " + byte1);
        System.out.println("byte2 : " + byte2);

        short short1 = -32768;
        short short2 = 32767;
        System.out.println("short1 : " + short1);
        System.out.println("short2 : " + short2);

        int int1 = -2147483648;
        int int2 = 2147483637;
        System.out.println("int1 : " + int1);
        System.out.println("int2 : " + int2);

        long long1 = -922337203684775808L;
        long long2 = 922337203684775807L;
        System.out.println("long1 : " + long1);
        System.out.println("long2 : " + long2);

        // 실수형
        float float1 = -12.34f;
        float float2 = 12.34f;
        System.out.println("float1 : " + float1);
        System.out.println("float2 : " + float2);

        double double1 = 12.34;
        double double2 = -12.34;
        System.out.println("double1 : " + double1);
        System.out.println("double2 : " + double2);

        // 문자열
        String str0 = "안녕하세요";
        System.out.println("str : " + str0);

    }
}
