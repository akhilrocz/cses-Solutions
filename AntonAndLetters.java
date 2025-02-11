import java.util.*;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.replaceAll("[{}]", "");
        if (input.isEmpty()) {
            System.out.println(0);
            return;
        }
        String[] elements = input.split(",\\s*");
        Set<String> distinct = new HashSet<>();
        for(String ele : elements) {
            distinct.add(ele);
        }

        System.out.println(distinct.size());

        scanner.close();
    }
}
