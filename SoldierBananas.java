import java.util.*;

public class SoldierBananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        long totalCost = (long) k * w * (w + 1) / 2;
        long borrowAmount = Math.max(0, totalCost - n);
        System.out.println(borrowAmount);
        scanner.close();
    }
}
