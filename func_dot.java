import java.io.*;
import java.util.*;

public class func_dot {
    static int once(int a, int b, int c) {
        if (a == b) return c;
        if (a == c) return b;
        return a;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] xs = new int[3];
        int[] ys = new int[3];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            xs[i] = Integer.parseInt(st.nextToken());
            ys[i] = Integer.parseInt(st.nextToken());
        }
        int x = once(xs[0], xs[1], xs[2]);
        int y = once(ys[0], ys[1], ys[2]);
        System.out.println(x + " " + y);
    }
}
