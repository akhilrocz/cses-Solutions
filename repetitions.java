
import java.util.*;
public class repetitions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int maxLength=0;
        int currentLength=1;
        char currChar =s.charAt(0);

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==currChar){
                currentLength++;
            }else{
                maxLength=Math.max(maxLength,currentLength);
                currentLength=1;
                currChar=s.charAt(i);
            }
        }
        maxLength=Math.max(currentLength,maxLength);
        System.out.println(maxLength);
        
    }
}
