import java.util.*;

public class LearnFromMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.print(4 + " " + (n - 4));
        } else {
            System.out.print(9 + " " + (n - 9));
        }
    }
}
