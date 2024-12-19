
import java.sql.Array;
import java.util.*;
public class increasingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];

      for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextLong();
        }
        if(n<=1){
            System.out.println(0);
            sc.close();
            return;
        }

        long minMoves=0L;
      for(int i=1;i<arr.length;i++){
          if(arr[i-1]>arr[i]) {
              minMoves += arr[i - 1] - arr[i];
              arr[i] =arr[i-1];
          }
      }
      System.out.println(minMoves);
      sc.close();

    }
}
