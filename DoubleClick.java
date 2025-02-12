import java.util.*;

public class DoubleClick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] <= d) {
                System.out.println(arr[i + 1]);
                return;
            }
        }

        System.out.println(-1);

    }
}
