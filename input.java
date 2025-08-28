import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int[] a = new int[N];
        while (M-- > 0) {
            int i = sc.nextInt(), j = sc.nextInt(), k = sc.nextInt();
            for (int x = i-1; x <= j-1; x++) a[x] = k;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) sb.append(a[i]).append(i+1==N? "":" ");
        System.out.print(sb.toString());
    }
}
