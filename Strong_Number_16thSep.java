import java.util.Scanner;

public class Strong_Number_16thSep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int number = Integer.parseInt(scanner.nextLine()); //стойността на числото, която ще се модифицира
         int startNumber = number; //първоначалнот въведената стойност на числото
         //четем цифра
         //намираме факториел
         //сума на факториел
         // сума на факториел = числото

        //2345 ->
        //последната цифра остатъка %10 ->5
        //числото / 10  ->234
        // числото % 10  -> 4
       // новото число /10 -> 23
       //новото число % 10 ->3
        //новото число /10 -> 2
        //новото число /10 -> %2
 int sumFactorial = 0 ;

        while   (number > 0 ) {
            int lastDigit = number % 10;
            //факториел
            int fact = 1;
            //сумираме факториел
            for (int i = 1; i <= lastDigit ; i++) {
                fact = fact * i;
            }
            sumFactorial += fact;
            number = number / 10 ; //премахваме последната цифра
        }

        if (sumFactorial == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
