import java.util.*;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int digit = Character.getNumericValue(c);
            int inverted = 9 - digit;

            if (i == 0 && inverted == 0) {
                sb.append(digit);
            } else {
                sb.append(Math.min(digit, inverted));
            }
        }

        System.out.println(sb.toString());

    }
}
