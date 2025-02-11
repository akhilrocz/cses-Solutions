import java.util.*;

public class SkibidusandAmogu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            if (s.substring(s.length()-2).equals("us")) {
                s =s.substring(0,s.length()-2)+ s.substring(s.length()-2).replace("us", "i");
            }
            System.out.println(s);
        }
    }
}
