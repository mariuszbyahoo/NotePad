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
                    options.removeNote();
                    break;
                case "3":
                    options.removeAllNotes();
                    break;
                case "4":
                    options.showNote();
                    break;
                case "5":
                    options.showAllNotes();
                    break;
                default:
                    System.out.println("Sorry, ale nie ma takiej komendy");
                    break;
            }
        }
    }
}

