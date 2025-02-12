import java.util.*;

class ANchoicequestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int c = scanner.nextInt();
            if (c == a + b) {  //cIth element is in range 1<=cI<=2000
                System.out.println(i + 1);
            }
        }
    }
}
