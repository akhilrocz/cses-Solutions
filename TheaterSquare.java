import java.util.*;

public class TheaterSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();

        long tiles_n = (long) Math.ceil((double) n / a);

        long tiles_m = (long) Math.ceil((double) m / a);

        long totalTiles = tiles_m * tiles_n;

        System.out.println(totalTiles);

    }
}
