package methods;

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
                    options.addDatedNote();
                    break;
                case "3":
                    options.removeElement();
                    break;
                case "4":
                    options.removeAllElements();
                    break;
                case "5":
                    options.showElement();
                    break;
                case "6":
                    options.showAllElements();
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Sorry, ale nie ma takiej komendy");
                    break;
            }
        }
    }
}


