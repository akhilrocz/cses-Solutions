import java.util.*;
public class Translation {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner =new Scanner(System.in);
        String s = scanner.next();
        String t =scanner.next();
        for(int i=t.length()-1;i>=0;i--){
            sb.append(t.charAt(i));
        }
        if(sb.toString().equals(s)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
