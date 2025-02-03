import java.util.*;

public class DreamoonAndStairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int minMoves = (n + 1) / 2;
        while (minMoves <= n) {
            if (minMoves % m == 0) {
                System.out.println(minMoves);
                return;
            }
            minMoves++;
        }
        System.out.println(-1);
    }
}
