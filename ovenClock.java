import java.io.*;
import java.util.*;

public class ovenClock {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // 시 (0~23)
        int B = Integer.parseInt(st.nextToken()); // 분 (0~59)
        int C = Integer.parseInt(br.readLine());  // 추가 분 (0~1000)

        int total = A * 60 + B + C;
        int hour = (total / 60) % 24;
        int minute = total % 60;

        System.out.println(hour + " " + minute);
    }
}
