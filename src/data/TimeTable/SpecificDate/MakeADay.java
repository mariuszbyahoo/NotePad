package data.TimeTable.SpecificDate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MakeADay {

    private int number;
    Scanner input = new Scanner(System.in);

    public int makeADay() {
        while (true) {
            try {
                System.out.println("Dnia: ");
                number = input.nextInt();
                if (number > 31 || number < 0) {
                    System.out.println("Miesiac ma najwyzej 31 dni... Podaj jeszcze raz.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ale miales wpisac cyfry, a nie jakies literki...");
                input.nextLine();
            }
        }
        return number;
    }
}