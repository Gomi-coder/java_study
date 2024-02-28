public class Main {
    /**
     * `public`선언 : main메소드는 프로그램의 진입점(entry point)이 되기 위해 외부에서 접근할 수 있어야 하므로
     * <p>
     * `static`은 메소드나 변수가 클래스 수준에 속함을 나타냄.
     * 즉, 클래스에 종속되어 객체의 생성과 상관없이 호출할 수 있다.
     * `main` 메소드는 프로그램이 시작될 때 객체의 생성 없이 호출되어야 하므로 `static`으로 선언.
     * <p>
     * `void` : 메소드가 반환하는 값의 타입. 반환 값이 없음.
     * `void main` : `main`메소드는 프로그램이 시작될 때 호출되는 진입점이므로 반환할 값이 없음.
     *
     * @param args : main 메소드의 매개변수.
     *             프로그램을 실행할 때 커맨드 라인에서 전달되는 인수를 저장하는 배열.
     *             주로 프로그램 실행 시 필요한 설정값이나 입력값 등을 전달할 때 사용됨.
     *             배열의 이름은 args이며 배열의 요소는 문자열이라는 의미.
     * <p>
     * `public static void main`의 의미 :
     *      이 프로그램은 외부에서 접근할 수 있고,
     *      객체의 생성 없이 호출될 수 있는,
     *      반환값이 없는 진입점 메소드이며,
     *      이 메소드는 문자열 배열을 매개변수로 받는다.
     */
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }
    }
}