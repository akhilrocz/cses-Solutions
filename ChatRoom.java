import java.util.*;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String hello = "hello";
        int helloIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (helloIndex < hello.length() && s.charAt(i) == hello.charAt(helloIndex)) {
                helloIndex++;
            }
        }

        if (hello.length() == helloIndex) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
