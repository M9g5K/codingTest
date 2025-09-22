import java.io.*;
import java.util.*;

public class chess {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] need = {1, 1, 2, 2, 2, 8};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int have = Integer.parseInt(st.nextToken());
            sb.append(need[i] - have);
            if (i < 5) sb.append(' ');
        }
        System.out.println(sb.toString());
    }
}
