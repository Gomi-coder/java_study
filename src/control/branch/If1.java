package control.branch;

// TODO : 분기문 - If
public class If1 {
    public static void main(String[] args) {
        int a = 10;

        // if
        if (a < 20) {
            System.out.println("a는 20보다 작습니다.");
        }

        if (a < 10) {
            System.out.println("a는 10보다 작다.");
        }

        // if-else
        if (a < 1) {
            System.out.println("a는 1보다 작습니다.");
        } else {
            System.out.println("a는 1보다 크거나 같습니다.");
        }

        a = 30;
        // 중첩 if
        if (a < 1) {
            System.out.println("a는 1보다 작습니다.");
        } else if (a < 10) {
            System.out.println("a는 1보다 크거나 같지만 10보단 작습니다.");
        } else if (a < 20) {
            System.out.println("a는 10보다 크거나 같지만 20보단 작습니다.");
        } else {
            System.out.println("a는 20보다 크거나 같습니다.");
        }
    }
}
