import java.util.Scanner;

public class vending_machine_16thSep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. След командата Start трябва да започваме да четем какви монети пускат
        //2. автоматът приема само 0.1, 0.2, 0.5, 1 или 2
        //3. ако ни дадат монета, която не приемаме, трябва да
        //4. Трябва да сумираме монетите(валидните) принтираме  "Cannot accept {money} -.2ф и да не добавяме тези монети към сумата
        // 5. Трябва да прочетем какви прподукти иска да купи клиента (валидни са само:
        // "Nuts"= 2.0
        // "Water" =0.7
        // "Crisps" = 1.5
        // "Soda" = 0.8
        // "Coke"= 1.0
        //ако сме въвели друг рподукт трябва да изпишем "Invalid product;
        //ако парите на клиента не са достатъчни трябва да изпишем  "Sorry, not enough money"
        // покупката е успешна "Purchased {product name}";
        //след End команда, спираме програмата принтираме рестото "Change: {money left}".;


        String text = scanner.nextLine();
        double sumCoins = 0;
        double price = 0;
        while (!text.equals("End")) {
            double coins = Double.parseDouble(text);
            if (coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1 && coins != 2) {
                System.out.printf("Cannot accept %.2f", text);
            }
            coins = Double.parseDouble(scanner.nextLine());
            sumCoins += coins;

            if (text.equals("Nuts")) {
                price = 2.0;
            } else if (text.equals("Water")) {
                price = 0.7;
            } else if (text.equals("Crisps")) {
                price = 1.5;
            } else if (text.equals("Soda")) {
                price = 0.8;
            } else if (text.equals("Coke")) {
                price = 1.0;
            } else {
                System.out.println("Invalid product");
            }
        }
        ;

        while (text.equals("End")) {
            if (sumCoins < price) {
                System.out.println("Sorry, not enough money");
            }

            double change = sumCoins - price;
            System.out.printf("Change: %.2f}",change);
        }
    }
}


