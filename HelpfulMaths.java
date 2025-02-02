import java.util.*;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String[] nums = s.split("\\+");
        Arrays.sort(nums);
        StringBuilder sb = new StringBuilder();
        for (String num : nums) {
            sb.append(num).append("+");
        }

        sb.setLength(sb.length() - 1);

        System.out.println(sb.toString());

    }
}
