import java.util.*;
import java.io.*;
import java.util.Scanner;

public class star6 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            int spaces = i - 1;
            int stars  = 2 * (N - i) + 1;
            
            for (int s = 0; s < spaces; s++) sb.append(' ');
            for (int k = 0; k < stars; k++) sb.append('*');
            if (i < N) sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}


