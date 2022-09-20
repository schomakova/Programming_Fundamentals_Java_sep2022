import java.util.Scanner;

public class Back_in_30_min {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int initialHour = Integer.parseInt(scanner.nextLine());
            int initMinutes = Integer.parseInt(scanner.nextLine());

            int minutesOverall = (initialHour * 60) + initMinutes + 30;

            int  hour = minutesOverall / 60 ;
            int minutes = minutesOverall % 60;

            if(hour > 23){
                hour = 0;
            }
            System.out.printf("%d:%02d", hour, minutes);
        }
    }


