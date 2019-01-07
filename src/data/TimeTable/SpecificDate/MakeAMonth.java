package data.TimeTable.SpecificDate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MakeAMonth {
    Scanner input = new Scanner(System.in);
    private int number;

    public int makeAMonth() {
        while (true) {
            try {
                System.out.println("Miesiaca: ");
                number = input.nextInt();
                if (number > 12 || number < 0) {
                    System.out.println("Rok ma najwyzej 12 miesiecy... Podaj jeszcze raz.");
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