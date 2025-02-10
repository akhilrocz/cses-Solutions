import java.util.*;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        int kthScore = scores[k - 1];

        for (int score : scores) {
            if (score >= kthScore && score > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
