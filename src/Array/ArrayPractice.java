package Array;

import java.util.Scanner;

/**
 * Created by Iju on 2024-07-19
 */
public class ArrayPractice {
    public static void main(String[] args) {
        // main 메서드는 `static`메서드이므로,
        // `non-static`메서드를 호출하기 위해 인스턴스를 생성해야 함.
        ArrayPractice arrayPractice = new ArrayPractice();

        // 클래스의 인스턴스를 통해 메서드 호출 가능.
        arrayPractice.getScore1();
        arrayPractice.getScore2(5);
        arrayPractice.getScore3(3, new String[]{"국어", "영어", "수학"});
    }

    // 배열을 쓰지 않을 경우
    void getScore1() {
        Scanner scanner = new Scanner(System.in);

        // 학생들의 점수를 담을 변수 선언
        int kor1, kor2, kor3;
        int eng1, eng2, eng3;
        int math1, math2, math3;

        // 점수 입력 받기
        System.out.print("1번 학생 국어 점수: ");
        kor1 = scanner.nextInt();
        System.out.print("1번 학생 영어 점수: ");
        eng1 = scanner.nextInt();
        System.out.print("1번 학생 수학 점수: ");
        math1 = scanner.nextInt();

        System.out.print("2번 학생 국어 점수: ");
        kor2 = scanner.nextInt();
        System.out.print("2번 학생 영어 점수: ");
        eng2 = scanner.nextInt();
        System.out.print("2번 학생 수학 점수: ");
        math2 = scanner.nextInt();

        System.out.print("3번 학생 국어 점수: ");
        kor3 = scanner.nextInt();
        System.out.print("3번 학생 영어 점수: ");
        eng3 = scanner.nextInt();
        System.out.print("3번 학생 수학 점수: ");
        math3 = scanner.nextInt();

        int sum1 = kor1 + eng1 + math1;
        int sum2 = kor2 + eng2 + math2;
        int sum3 = kor1 + eng2 + math3;

        int avg1 = sum1 / 3;
        int avg2 = sum2 / 3;
        int avg3 = sum3 / 3;

        int total = sum1 + sum2 + sum3;
        int avg = (avg1 + avg2 + avg3) / 3;

        System.out.printf("1번 학생: %d %d %d %d %d\n", kor1, eng1, math1, sum1, avg1);
        System.out.printf("2번 학생: %d %d %d %d %d\n", kor2, eng2, math2, sum2, avg2);
        System.out.printf("3번 학생: %d %d %d %d %d\n", kor3, eng3, math3, sum3, avg3);

        System.out.printf("전체 점수 합: %d, 전체 평균: %d\n", total, avg);
    }

    // 1차원 배열을 사용할 경우
    public void getScore2(int studentCnt) {
        Scanner scanner = new Scanner(System.in);

        // 과목 별 점수를 담을 변수 선언
        int[] kor = new int[studentCnt];
        int[] eng = new int[studentCnt];
        int[] math = new int[studentCnt];

        // 총점 및 평균
        int[] total = new int[studentCnt];
        int[] avg = new int[studentCnt];

        for (int i = 0; i < studentCnt; i++) {
            System.out.printf("%d번째 학생 국어 점수: ", i + 1);
            kor[i] = scanner.nextInt();
            System.out.printf("%d번째 학생 영어 점수: ", i + 1);
            eng[i] = scanner.nextInt();
            System.out.printf("%d번째 학생 수학 점수: ", i + 1);
            math[i] = scanner.nextInt();

            total[i] = kor[i] + eng[i] + math[i];
            avg[i] = total[i] / 3;
        }

        int allTotal = 0;
        int allAvg = 0;
        int avgTmp = 0;

        for(int i = 0; i< studentCnt; i++){
            allTotal += total[i];
            avgTmp += avg[i];
        }

        allAvg = avgTmp / studentCnt;

        for(int i = 0; i< studentCnt; i++)
            System.out.printf("%d번 학생: %d %d %d %d %d\n", i+1, kor[i], eng[i], math[i], total[i], avg[i]);
    }
    
    // 2차원 배열을 사용할 경우
    void getScore3(int studentCnt, String [] subject){
        Scanner scanner = new Scanner(System.in);

        // 학생의 과목별 점수
        int [][] scoreInfo = new int[studentCnt][subject.length];

        int [] total = new int[studentCnt];
        int [] avg = new int[studentCnt];

        for(int i = 0; i<studentCnt; i++){
            total[i] = 0;
            for(int j = 0; j<subject.length; j++){
                System.out.printf("%d번째 학생 %s 점수: ", i+1, subject[i]);
                scoreInfo[i][j] = scanner.nextInt();
                total[i] += scoreInfo[i][j];
            }
            avg[i] = total[i] / subject.length;
        }

        int allTotal = 0;
        int allAvg = 0;
        int avgTmp = 0;

        for(int i = 0; i< studentCnt; i++){
            allTotal += total[i];
            avgTmp += avg[i];
        }

        allAvg = avgTmp / studentCnt;

        // 출력하기
        for(int i = 0; i<studentCnt; i++){
            System.out.printf("%d번째 학생: ", i+1);
            for(int j = 0; j<subject.length; j++){
                System.out.printf("%d ", scoreInfo[i][j]);
            }
            System.out.printf("총점: %d, 평균: %d \n", total[i], avg[i]);
        }

        System.out.printf("전체 총점: %d, 전체 평균: %d", allTotal, allAvg);
    }
}
