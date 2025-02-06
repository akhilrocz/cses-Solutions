import java.util.*;

public class MagicNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String s = String.valueOf(n);

        s = s.replaceAll("144", "");
        s = s.replaceAll("14", "");
        s = s.replaceAll("1", "");

        System.out.println(s.isEmpty());
    }
}
