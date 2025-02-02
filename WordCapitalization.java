import java.util.*;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        StringBuilder sb = new StringBuilder();

        sb.append(Character.toUpperCase(s.charAt(0)));

        for (int i = 1; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }

        System.out.println(sb.toString());
    }
}
