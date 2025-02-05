import java.util.*;

public class Reconnaissance2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int minDiff = Integer.MAX_VALUE;
        int index1 = -1;
        int index2 = -1;
        for (int i = 1; i < arr.length; i++) {
            minDiff = Math.min(Math.abs(arr[i] - arr[i-1]), minDiff);
            index1 = i;
            index2 = i-1;
        }
        System.out.print(index1 + " " + index2);
    }
}
