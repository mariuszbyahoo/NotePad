import java.util.InputMismatchException;
import java.util.Scanner;

public class Options {
    private int id = 1;
    private boolean correctRemove;
    private boolean correctShow;
    private Scanner input = new Scanner(System.in);

    void addNote() {
        System.out.println("Id: " + id);
        String txt = input.nextLine();
        Menu.list.add(txt);
        id++;
    }

    void removeNote() {
        correctRemove = false;

        if (Menu.list.size() == 0) {
            System.out.println("\n No ale nie masz notatek jeszcze to co bedziesz kasowal?");
        } else {
            while (!correctRemove) {
                try {
                    System.out.println("Podaj id notki ktora chcesz wyrzucic: ");
                    Menu.list.remove(input.nextInt() - 1);
                    correctRemove = true;
                } catch (IndexOutOfBoundsException ex) {
                    System.out.println("\n Na razie mamy: " + Menu.list.size() + " a Ty wpisales" +
                            " zly numer notatki...");
                } catch (InputMismatchException ex) {
                    System.out.println("\n Ale tu musisz podac liczbe... a nie co innego, to teraz od nowa!");
                    break;
                }
            }
        }
    }

    void showNote() {
        correctShow = false;

        if (Menu.list.size() == 0) {
            System.out.println("Notatnik pusty");
        } else {
            while (!correctShow) {
                try {
                    System.out.println("Podaj id notki ktora chcesz wydrukowac: ");
                    System.out.println(Menu.list.get(input.nextInt() - 1));
                    System.out.println();
                    correctShow = true;
                } catch (InputMismatchException ex) {
                    System.out.println("\n Ale tu musisz podac liczbe... a nie co innego, to teraz od nowa!");
                    break;
                } catch (IndexOutOfBoundsException ex) {
                    System.out.println("\n Na razie mamy: " + Menu.list.size() + " a Ty wpisales" +
                            " zly numer notatki...");
                }
            }
        }
    }
}
