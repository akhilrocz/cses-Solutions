import java.util.*;

public class EasyProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x = scanner.nextInt();
            System.out.println(x - 1);
        }
        scanner.close();
    }
}
