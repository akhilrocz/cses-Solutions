import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            if (x + y == z || y + z == x || x + z == y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
