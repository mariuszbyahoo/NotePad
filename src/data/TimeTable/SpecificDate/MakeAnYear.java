package data.TimeTable.SpecificDate;

import java.util.Scanner;

public class MakeAnYear {
    Scanner input = new Scanner(System.in);
    private int number;

    public int makeAnYear() {
        while (true) {
            System.out.println("Roku: ");
            number = input.nextInt();
            if (number < 2018) {
                System.out.println("Nie mozna planowac przeszlosci... No zastanow sie...");
            } else {
                break;
            }
        }
        return number;
    }
}
