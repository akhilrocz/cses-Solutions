import java.util.*;

public class Divisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a % b == 0) {
                System.out.println(0);
            } else {
                System.out.println(b - (a % b));
            }
        }
    }
}
