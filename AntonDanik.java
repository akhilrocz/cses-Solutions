import java.util.*;

public class AntonDanik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int aCount = 0;
        int dCount = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A') {
                aCount++;
            } else if (c == 'D') {
                dCount++;
            }
        }

        if (aCount > dCount) {
            System.out.println("Anton");
        } else if (aCount == dCount) {
            System.out.println("Friendship");

        } else {
            System.out.println("Danik");
        }
    }
}
