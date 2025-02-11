import java.util.*;

public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxCoins = 0;

        int sum = 0;
        for (int coins : arr) {
            maxCoins = Math.max(maxCoins, coins);
        }

        for (int coins : arr) {
            sum += maxCoins - coins;
        }

        System.out.println(sum);

    }
}
