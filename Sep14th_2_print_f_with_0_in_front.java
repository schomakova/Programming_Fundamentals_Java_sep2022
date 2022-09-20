import java.util.Scanner;

public class Sep14th_2_print_f_with_0_in_front {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        System.out.printf("%03d", num);
    }
}
