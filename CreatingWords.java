import java.util.*;

public class CreatingWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s1 = scanner.next();
            String s2 = scanner.next();

            String result1 = s2.charAt(0) + s1.substring(1);
            String result2 = s1.charAt(0) + s2.substring(1);

            System.out.print(result1 + " " + result2 + "\n");

        }
    }
}
