import java.util.*;

public class InSearchOfEasyProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean isHard = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                isHard = true;
            }
        }

        if (isHard) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }


    }
}
