import java.util.*;

public class APlusB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x = scanner.nextInt();
            int sum = 0;
            while (x > 0) {
                int r = x % 10;
                sum += r;
                x /= 10;
            }
            System.out.println(sum);
        }
    }
}
