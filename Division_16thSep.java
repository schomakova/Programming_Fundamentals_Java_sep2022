import java.util.Scanner;

public class Division_16thSep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int division_by_two = number % 2;
        int division_by_three = number % 3;
        int division_by_six = number % 6;
        int division_by_seven = number % 7;
        int division_by_ten = number % 10;

        // 30 /2 = 15
        // 30/3 = 10
        // 30/6 = 5
        // 30/7 = 4.29
        // 30/10 = 3

        if (division_by_ten == 0) {
            System.out.println("The number is divisible by 10");
        } else if (division_by_seven == 0) {
            System.out.println("The number is divisible by 7");
        } else if (division_by_six == 0) {
            System.out.println("The number is divisible by 6");
        } else if (division_by_three == 0) {
            System.out.println("The number is divisible by 3");
        } else if (division_by_two == 0) {
            System.out.println("The number is divisible by 2");
        } else {
            System.out.println("Not divisible");
        }

    }
}
