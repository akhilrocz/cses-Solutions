
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
public class Permutations {
    public static void main(String[] args) throws IOException {
        Scanner scanner =new Scanner(System.in);
        long n=scanner.nextLong();
        if(n==2 || n==3){
            System.out.println("NO SOLUTION");
            return;
        }
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=2;i<=n;i+=2){
            out.write(i+" ");
        }
        for(int i=1;i<=n;i+=2){
            out.write(i+" ");
        }
        out.flush();
    }



}
