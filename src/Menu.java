/**
 * Teraz potrzebuję obsłużyć wszystkie wyjątki tak, by to wszystko było idiotoodporne, potem porozdzielać do klas, i na końcu dodać grafikę
 * obecny problem skutkuje tym, że pętla robi dwa obiegi na linii 23 po wykasowaniu albo pokazaniu notatki...
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    void startMenu() {
        int id = 1;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        boolean correctRemove;
        boolean correctShow;

        ArrayList<String> list = new ArrayList<>();

        String menu = "\n1 -> Nowa notatka\n2 -> wykasowanie notatki\n3 -> pokazanie notatki";

        while (true) {

            System.out.println(menu);
            System.out.println("Notatnik zawiera: " + list.size() + " notatek");
            correctRemove = false;
            correctShow = false;
            switch (input.nextLine()) {
                case "1":
                    System.out.println("Id: " + id);
                    String txt = input2.nextLine();
                    list.add(txt);
                    id++;
                    break;
                case "2":
                    if (list.size() == 0) {
                        System.out.println("\n No ale nie masz notatek jeszcze to co bedziesz kasowal?");
                    } else {
                        while (!correctRemove) {
                            try {
                                System.out.println("Podaj id notki ktora chcesz wyrzucic: ");
                                list.remove(input.nextInt() - 1);
                                correctRemove = true;
                            } catch (IndexOutOfBoundsException ex) {
                                System.out.println("\n Na razie mamy: " + list.size() + " a Ty wpisales" +
                                        " zly numer notatki...");
                            } catch (InputMismatchException ex) {
                                System.out.println("\n Ale tu musisz podac liczbe... a nie co innego, to teraz od nowa!");
                                break;
                            }
                        }
                    }
                    break;
                case "3":
                    if (list.size() == 0) {
                        System.out.println("Notatnik pusty");
                    } else {
                        while (!correctShow) {
                            try {
                                System.out.println("Podaj id notki ktora chcesz wydrukowac: ");
                                System.out.println(list.get(input.nextInt() - 1));
                                System.out.println();
                                correctShow = true;
                            } catch (InputMismatchException ex) {
                                System.out.println("\n Ale tu musisz podac liczbe... a nie co innego, to teraz od nowa!");
                                break;
                            } catch (IndexOutOfBoundsException ex) {
                                System.out.println("\n Na razie mamy: " + list.size() + " a Ty wpisales" +
                                        " zly numer notatki...");
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Sorry, ale nie ma takiej komendy");
                    break;
            }
        }
    }
}


