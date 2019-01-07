package data.TimeTable.SpecificDate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MakeAnYear {
    Scanner input = new Scanner(System.in);
    private int number;

    public int makeAnYear() {
        while (true) {
            try {
                System.out.println("Roku: ");
                number = input.nextInt();
                if (number < 2018) {
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
