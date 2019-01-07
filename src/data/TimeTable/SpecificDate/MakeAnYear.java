package data.TimeTable.SpecificDate;

import java.util.InputMismatchException;

public class MakeAnYear implements Making {
    private int number;

    public int make() {
        while (true) {
            try {
                System.out.println("Roku: ");
                number = input.nextInt();
                if (number < 2019) {
                    System.out.println("Nie mozna planowac przeszlosci... No zastanow sie...");
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
