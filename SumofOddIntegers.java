import java.util.*;

public class SumofOddIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            if ((n - k) % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
