import java.util.Scanner;

public class TrailingZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
System.out.print(countTrailingZeros(n));
    }
    public  static long countTrailingZeros(long n){
        long count=0;
        long i=5;
        while(n/i>=1){
            count+=n/i;
            i*=5;
        }
        return count;
    }

}