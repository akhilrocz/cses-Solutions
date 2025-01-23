import java.util.*;
public class Towers {
    public  static  void  main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int maxHeight=0;

        Map<Integer,Integer> hashMap =new HashMap<>();
        for(int num:arr){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }
        int totalTowers=hashMap.size();
        for(int cnt:hashMap.values()){
            maxHeight = Math.max(cnt,maxHeight);
        }
        System.out.print(maxHeight+" "+totalTowers);
    }

}
