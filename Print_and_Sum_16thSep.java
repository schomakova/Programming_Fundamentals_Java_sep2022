import java.util.Scanner;

public class Print_and_Sum_16thSep {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());

        int sum = 0;

        for (int number = start;  number <= end; number ++) {
            System.out.print(number + " ");
            sum = sum += number; // sum += number;
        }
       System.out.println();
       System.out.println("Sum: " + sum);

    }
}
