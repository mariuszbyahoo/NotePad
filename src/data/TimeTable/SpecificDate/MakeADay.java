package data.TimeTable.SpecificDate;

import java.util.Scanner;

public class MakeADay {
    Scanner input = new Scanner(System.in);
    private int number;

    public int makeADay() {
        while (true) {
            System.out.println("Dnia: ");
            number = input.nextInt();
            if (number > 31 || number < 0) {
                System.out.println("Miesiac ma najwyzej 31 dni... Podaj jeszcze raz.");
            } else {
                break;
            }
        }
        return number;
    }
}
