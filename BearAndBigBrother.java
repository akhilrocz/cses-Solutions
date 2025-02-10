import java.util.*;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int count = 0;

        while (x <= y) {
            x = 3 * x;
            y = 2 * y;
            count++;
        }

        System.out.println(count);

    }
}
