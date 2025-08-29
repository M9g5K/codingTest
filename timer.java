import java.util.*;
public class timer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(), M = sc.nextInt();
        if (M >= 45) {
            M -= 45;
        } else {
            M += 15;
            H = (H == 0) ? 23 : H - 1;
        }
        System.out.println(H + " " + M);
    }
}
