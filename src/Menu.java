/**
 * Teraz potrzebuję obsłużyć wszystkie wyjątki tak, by to wszystko było idiotoodporne, potem porozdzielać do klas, i na końcu dodać grafikę
 * obecny problem skutkuje tym, że pętla robi dwa obiegi na linii 23 po wykasowaniu albo pokazaniu notatki...
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    static ArrayList<String> list = new ArrayList<>();

    void startMenu() {

        Scanner input = new Scanner(System.in);


        String menu = "\n1 -> Nowa notatka\n2 -> wykasowanie notatki\n3 -> pokazanie notatki";
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
                default:
                    System.out.println("Sorry, ale nie ma takiej komendy");
                    break;
            }
        }
    }
}


