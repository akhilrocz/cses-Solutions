import java.util.*;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long noOfOdds = (n + 1) / 2;

        if (m <= noOfOdds) {
            System.out.println(m * 2 - 1);
        } else {
            System.out.println((m - noOfOdds) * 2);
        }
    }

}
