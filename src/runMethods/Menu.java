package runMethods;

import data.Options;

import java.util.Scanner;

public class Menu {

    public void startMenu() {

        Scanner input = new Scanner(System.in);

        Options options = new Options();

        while (true) {

            options.printOptions();

            switch (input.nextLine()) {
                case "1":
                    options.addNote();
                    break;
                case "2":
                    options.removeElement();
                    break;
                case "3":
                    options.removeAllElements();
                    break;
                case "4":
                    options.showElement();
                    break;
                case "5":
                    options.showAllElements();
                    break;
                default:
                    System.out.println("Sorry, ale nie ma takiej komendy");
                    break;
            }
        }
    }
}


