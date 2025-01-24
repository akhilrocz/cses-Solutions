

import java.util.*;

public class maximumSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        long currentSum = arr[0];
        long maxSum = arr[0];
        for (int j = 1; j < arr.length; j++) {
            currentSum = Math.max(arr[j], currentSum + arr[j]);
            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println(maxSum);
    }
}
