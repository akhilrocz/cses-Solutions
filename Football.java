
import java.util.*;

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int count = 1;
        boolean dangerous=false;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                if (count >= 7) {
                   dangerous=true;
                   break;
                }
            }else{
                count=1;
            }
        }
        if(dangerous)
        {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
