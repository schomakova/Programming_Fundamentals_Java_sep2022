import java.util.Scanner;

public class Lunch_Break {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String Serial = scanner.nextLine();
            int movietime = Integer.parseInt(scanner.nextLine());
            int lunchlenght = Integer.parseInt(scanner.nextLine());

            double lunchtime = lunchlenght * 0.125;
            double relaxtime = lunchlenght * 0.25;

            double timelft = (lunchlenght - (lunchtime + relaxtime));

            double difference = Math.abs(timelft -movietime);
            if (timelft >= movietime) {
                System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",Serial,Math.ceil(difference));
            }else {
                System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",Serial,Math.ceil(difference));
            }

    }
}
