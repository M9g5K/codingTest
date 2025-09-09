import java.io.*;
public class time {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        sb.append(n).append('\n').append(1).append('\n');
        System.out.print(sb.toString());
    }
}
