import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Options {
    private int id = 0;
    private boolean correctRemove;
    private boolean correctShow;
    private Scanner input = new Scanner(System.in);

    private ArrayList<String> list = new ArrayList<>();

    private String options = "\n Notatnik zawiera: " + list.size() + " notatek" +
            "\nDostepne opcje: \n1-> Dodaj nowa notatke\n2-> Wykasowanie notatki\n3-> Wykasowanie wszystkich notatek" +
            "\n4-> Pokazanie wybranej notatki\n5-> Pokazanie wszystkich notatek";

    public void printOptions() {
        System.out.println(options);
    }

    void addNote() {
        id++;
        System.out.println("Id: " + id);
        String txt = input.nextLine();
        list.add(txt);
        id++;
    }

    void removeNote() {
        correctRemove = false;

        if (list.size() == 0) {
            System.out.println("\n No ale nie masz notatek jeszcze to co bedziesz kasowal?");
        } else {
            while (!correctRemove) {
                try {
                    System.out.println("Podaj id notki ktora chcesz wyrzucic: ");
                    list.remove(input.nextInt() - 1);
                    correctRemove = true;
                    System.out.println("Notka usunieta ");
                } catch (IndexOutOfBoundsException ex) {
                    System.out.println("\n Na razie mamy: " + list.size() + " notatki, a Ty wpisales" +
                            " zly numer notatki...");
                } catch (InputMismatchException ex) {
                    System.out.println("\n Ale tu musisz podac liczbe... a nie co innego, to teraz od nowa!");
                    break;
                }
            }
        }
    }

    void removeAllNotes() {
        System.out.println("\n Notatnik pusty");
        list.clear();

    }

    void showNote() {
        correctShow = false;

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
    }

    void showAllNotes() {
        correctShow = false;

        if (id == 0) {
            System.out.println("Notatnik pusty");
        } else {
            for (String specificNote : list) {
                System.out.println(specificNote);
            }
        }
    }
}
