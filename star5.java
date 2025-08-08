import java.util.Scanner;

public class star5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // 사용자로부터 줄 수 입력 받기

        for (int i = 1; i <= N; i++) {
            int space = N - i;              // 앞에 출력할 공백 수
            int stars = 2 * i - 1;          // 출력할 별 수

            // 공백 출력
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            // 줄 바꿈
            System.out.println();
        }
    }
}

