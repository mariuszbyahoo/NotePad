package pl.budzisz.mariusz.data.TimeTable.SpecificDate;

import java.util.InputMismatchException;

public class MakeAnYear implements Making {
    private int number;

    public int make() {
        while (true) {
            try {
                System.out.println("Roku: ");
                number = input.nextInt();
                if (number < 2019) {
                    System.out.println("Nie zmienimy przeszlosci...");
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
