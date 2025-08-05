import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 N 입력 받기
        System.out.print("숫자 N을 입력하세요: ");
        int N = scanner.nextInt();

        // 줄 수만큼 반복
        for (int i = 1; i <= N; i++) {
            // i번 만큼 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }

        scanner.close();
    }
}






