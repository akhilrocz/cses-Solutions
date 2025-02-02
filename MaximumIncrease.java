
import java.util.*;

public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int currentLength = 0;
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] > arr[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }
            maxLength = Math.max(currentLength, maxLength);
        }
        System.out.println(maxLength);
        scanner.close();
    }
}
