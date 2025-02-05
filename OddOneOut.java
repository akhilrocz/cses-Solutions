import java.util.*;

public class OddOneOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            if (x == y && x != z && y != z) {
                System.out.println(z);
            } else if (x == z && x != y && z != y) {
                System.out.println(y);
            } else {
                System.out.println(x);
            }
        }
    }
}
