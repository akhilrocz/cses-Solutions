import java.util.*;

public class BitPlusPlus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        int x = 0;
        for (int i = 0; i < n; i++) {
            String statement = scanner.nextLine().trim();
            if (statement.contains("++")) {
                x++;
            } else if (statement.contains("--")) {
                x--;
            }
        }

        scanner.close();
        System.out.println(x);


    }
}
