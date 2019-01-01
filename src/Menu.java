/**
 * No już za bardzo na czerwono nie wyskakują wyjątki więc powinno być w porządku...
 * obecny problem skutkuje tym, że pętla robi dwa obiegi na linii 23 po wykasowaniu albo pokazaniu notatki...
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    static ArrayList<String> list = new ArrayList<>();

    void startMenu() {

        Scanner input = new Scanner(System.in);


        String menu = "\nDostepne opcje: \n1 -> Nowa notatka\n2 -> Wykasowanie notatki\n3 -> Pokazanie notatki\n4 -> Pokazanie wszystkich notatek" +
                "\n5 -> Wykasowanie wszystkich notatek";
        Options options = new Options();

        while (true) {

            System.out.println(menu);
            System.out.println("Notatnik zawiera: " + list.size() + " notatek");

            switch (input.nextLine()) {
                case "1":
                    options.addNote();
                    break;
                case "2":
                    options.removeNote();
                    break;
                case "3":
                    options.showNote();
                    break;
                case "4":
                    options.showAllNotes();
                    break;
                case "5":
                    Menu.list.clear();
                    break;
                default:
                    System.out.println("Sorry, ale nie ma takiej komendy");
                    break;
            }
        }
    }
}


