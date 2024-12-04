
import java.util.*;
public class missingNum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long expectedSum=n*(n+1L)/2;
        long actualSum=0;
        for(int i=0;i<n-1;i++){
            actualSum+= sc.nextInt();
        }

        long res=expectedSum-actualSum;
        System.out.println(res);


        sc.close();

    }

}
