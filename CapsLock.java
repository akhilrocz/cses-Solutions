import java.util.*;

public class CapsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String result = processWord(s);
        System.out.println(result);
    }

    private static String processWord(String s) {
        if (isAllUpperCase(s)) {
            return s.toLowerCase();
        } else if (isCapsLockFormat(s)) {
            return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
        } else {
            return s;
        }
    }

    private static boolean isAllUpperCase(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isUpperCase(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isCapsLockFormat(String s) {
        if (s.isEmpty()) {
            return false;
        }
        if (!Character.isLowerCase(s.charAt(0))) {
            return false;
        }
        for (int i = 1; i < s.length(); i++) {
            if (!Character.isUpperCase(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
