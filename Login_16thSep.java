import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Login_16thSep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //while
        String userName = scanner.nextLine();
        String password = "";

        for (int position = userName.length() - 1; position >= 0; position--) {
            char currentSymbol = userName.charAt(position);
            password += currentSymbol;
        } //Знаем каква ни е паролата

        String enteredPAssword = scanner.nextLine();
        int countFailedTry = 0; //брой опити за въвеждане на паролата
        //powtarqme: wywevdame nqkakwa parola
        //sspirame , kogato enteredPAssword e = password

        while (!enteredPAssword.equals(password)) {
            countFailedTry++;
            if (countFailedTry == 4) {
                System.out.printf("User %s blocked!", userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPAssword = scanner.nextLine();

        }

        if (enteredPAssword.equals(password)) {
            System.out.printf("User %s logged in.", userName);
        }

    }
}

