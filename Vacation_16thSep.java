import java.util.Locale;
import java.util.Scanner;

public class Vacation_16thSep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0;


        if (typeOfGroup.equals("Students")) {
            if (dayOfWeek.equals("Friday")) {
                price = 8.45;
            } else if (dayOfWeek.equals("Saturday")) {
                price = 9.80;
            } else if (dayOfWeek.equals("Sunday")) {
                price = 10.46;
            }
        } else if (typeOfGroup.equals("Business")) {
            if (dayOfWeek.equals("Friday")) {
                price = 10.90;
            } else if (dayOfWeek.equals("Saturday")) {
                price = 15.60;
            } else if (dayOfWeek.equals("Sunday")) {
                price = 16;
            }
        } else if (typeOfGroup.equals("Regular")) {
            if (dayOfWeek.equals("Friday")) {
                price = 15;
            } else if (dayOfWeek.equals("Saturday")) {
                price = 20;
            } else if (dayOfWeek.equals("Sunday")) {
                price = 22.5;
            }
        }


        double sum = price * countPeople;

        if (typeOfGroup.equals("Students") && countPeople >= 30) {
            sum = (price * countPeople) * 0.85;
        } else if (typeOfGroup.equals("Business") && countPeople >= 100) {
            sum = price * (countPeople - 10);
        } else if (typeOfGroup.equals("Regular") && countPeople >= 10 && countPeople <= 20) {
            sum = (price * countPeople) * 0.95;
        }


        System.out.printf("Total price: %.2f", sum);

    }
}
