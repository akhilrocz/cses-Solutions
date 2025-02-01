import java.util.*;
public class LenaPresent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPattern(n);
    }

    private static void printPattern(int n){
        for(int i=0;i<=n;i++){
            printLine(n,i);
        }
        for(int i=n-1;i>=0;i--){
            printLine(n,i);
        }
    }

    private static void printLine(int n,int i){

        for(int j=0;j<n-i;j++){
            System.out.print(" ");
        }

        

    }


}
