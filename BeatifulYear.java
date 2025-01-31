
import java.util.*;

public class BeatifulYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        year = findBeautifulYear(year);
        System.out.println(year);
    }

    private static int findBeautifulYear(int year) {
        while (true) {
            year++;
            if (hasDistinctDigits(year)) {
                return year;
            }
        }
    }

    private static boolean hasDistinctDigits(int year) {
        String yearStr = String.valueOf(year);
        HashSet<Character> set = new HashSet<>();
        for (char digit : yearStr.toCharArray()) {
            if (!set.add(digit)) {
                return false;
            }
        }
        return true;
    }

}
