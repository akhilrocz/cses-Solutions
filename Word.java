

import java.util.*;
public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        int upperCaseCnt = 0;
        int lowerCaseCnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                upperCaseCnt++;
            } else {
                lowerCaseCnt++;
            }
        }

        if (upperCaseCnt > lowerCaseCnt) {
            System.out.println(s.toUpperCase());
        } else{
            System.out.println(s.toLowerCase());
        }
    }

}
