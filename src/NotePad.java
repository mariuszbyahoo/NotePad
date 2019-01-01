/**
 * Teraz potrzebuję obsłużyć wszystkie wyjątki tak, by to wszystko było idiotoodporne, potem porozdzielać do klas, i na końcu dodać grafikę
 */

import java.util.ArrayList;
import java.util.Scanner;

public class NotePad {
    public static void main(String[] args) {
        int id = 1;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        
        String menu = "1 -> Nowa notatka\n2 -> wykasowanie notatki\n3 -> pokazanie notatki";

        while (true) {

            System.out.println(menu);
            System.out.println("Notatnik zawiera: " + list.size() + " notatek");
            switch (input.nextLine()) {
                case "1":
                    System.out.println("Id: " + id);
                    String txt = input2.nextLine();
                    list.add(txt);
                    id++;
                    break;
                case "2":
                    System.out.println("Podaj id notki ktora chcesz wyrzucic: ");
                    list.remove(input.nextInt() - 1);
                    break;
                case "3":
                    if (list.size() == 0) {
                        System.out.println("Notatnik pusty");
                    } else {
                        System.out.println("Podaj id notki ktora chcesz wydrukowac: ");
                        System.out.println(list.get(input.nextInt() - 1));
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Sorry, ale nie ma takiej komendy");
                    break;
            }
        }
    }
}


