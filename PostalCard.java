import java.util.*;

public class PostalCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] s = new String[n];
        String[] t = new String[m];

        for (int i = 0; i < n; i++) {
            s[i] = scanner.next();
        }
        for (int i = 0; i < m; i++) {
            t[i] = scanner.next();
        }

        int count = 0;
        for (String si : s) {
            for (String tj : t) {
                if (si.substring(3).equals(tj)) {  //last 3 characters comparison
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);

    }
}
