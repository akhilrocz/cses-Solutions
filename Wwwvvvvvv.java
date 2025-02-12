import java.util.*;

public class Wwwvvvvvv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int bottoms = 0;
        for (char c : s.toCharArray()) {
            if (c == 'v') {
                bottoms += 1;
            } else if (c == 'w') {
                bottoms += 2;
            }
        }

        System.out.println(bottoms);
    }
}
