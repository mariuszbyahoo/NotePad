package pl.budzisz.mariusz.data.TimeTable.SpecificDate;

import java.util.InputMismatchException;

public class MakeADay implements Making {
    private int number;

    @Override
    public int make() {
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
