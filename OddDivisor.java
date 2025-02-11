import java.util.*;

public class OddDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            long n = scanner.nextLong();
            if (n % 2 == 0) {  //even
                while (n % 2 == 0) {  //divide until n becomes odd
                    n /= 2;
                }
                if (n > 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                if (n > 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
