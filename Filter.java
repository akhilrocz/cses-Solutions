import java.util.*;

public class Filter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n-- > 0) {
            int a = scanner.nextInt();
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
        }
    }
}
