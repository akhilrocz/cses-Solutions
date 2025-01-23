
import java.util.*;
public class Elephant {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();

      int[] stepSizes ={5,4,3,2,1};
      int steps=0;
        for(int stepSize: stepSizes){
            steps+=x/stepSize;
            x%=stepSize;
        }

        System.out.println(steps);

    }

}
