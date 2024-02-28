package control.branch;

/**
 * if 문과 다른 점 : 수식이나 변수의 값을 확인하여 값에 해당하는 부분으로 바로 이동
 *                  => 비교하는데까지 걸리는 작업량이 많지 않다.
 * <p/>
 * 수식이나 변수의 값이 정수일 경우에만 사용이 가능.
 */
public class SwitchCase1 {
    public static void main(String[] args) {
        int a = 2;

        switch (a){
            case 1 :
                System.out.println("1입니다.");
                break;
            case 2:
                System.out.println("2입니다.");
                break;
            case 3:
                System.out.println("3입니다.");
                break;
            default :
                System.out.println("1,2,3이 아닙니다.");
                break;
        }
    }
}
