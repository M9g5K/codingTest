import java.io.*;
import java.util.*;

public class star7 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        // 위쪽 (가운데 포함)
        for (int i = 1; i <= N; i++) {
            int spaces = N - i;
            int stars = 2 * i - 1;
            appendChars(sb, ' ', spaces);
            appendChars(sb, '*', stars);
            sb.append('\n');
        }

        // 아래쪽
        for (int i = N - 1; i >= 1; i--) {
            int spaces = N - i;
            int stars = 2 * i - 1;
            appendChars(sb, ' ', spaces);
            appendChars(sb, '*', stars);
            sb.append('\n');
        }

        System.out.print(sb.toString());
    }

    private static void appendChars(StringBuilder sb, char ch, int count) {
        for (int i = 0; i < count; i++) sb.append(ch);
    }
}
