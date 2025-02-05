import java.util.*;

public class ClockConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();  //consumes next line

        while (t-- > 0) {
            String times = scanner.nextLine();
            String[] parts = times.split(":");

            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);

            String s = "AM";

            if (hours >= 12) {
                s = "PM";
                if (hours > 12) {
                    hours -= 12;
                }
            } else if (hours == 0) {
                hours = 12;
            }

            String formatHours = String.format("%02d", hours);
            String formatMinutes = String.format("%02d", minutes);

            System.out.println(formatHours + ":" + formatMinutes + " " + s);

        }

    }
}
