import java.util.Scanner;

public class Rage_Expenses_16thSep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
 // крайна сума = (countHeadset * цената на слушалка) + (countMouse * цената на мика)
       // + (countKeyboards * цената на клавиатура) + (countDisplays * цената на монитор)

        int countHeadset = countLostGames / 2 ; //брой счупени слушалки
        int countMouse = countLostGames / 3 ; //брой счупени  мишки
        int countKeyboards = countLostGames / 6 ; //брой счупени  клавиатури
        int countDisplays = countLostGames / 12 ; //брой счупени  монитор;

        double finalSUm = (countHeadset * headsetPrice) + (countMouse * mousePrice) + (countKeyboards * keyboardPrice ) + (countDisplays * displayPrice);

        System.out.printf("Rage expenses: %.2f lv." , finalSUm);
    }
}
