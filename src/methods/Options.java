package methods;

import data.NotePad.NotePad;
import data.TimeTable.TimeTable;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Options {
    private boolean correctRemove;
    private boolean correctShow;
    private Scanner input = new Scanner(System.in);

    private StringBuilder builder = new StringBuilder();

    NotePad notePad = new NotePad();
    TimeTable timeTable = new TimeTable();

    public static ArrayList<String> list = new ArrayList<>();
    public static int id = 0;

    private String message;

    private String options2 = "\nDostepne opcje: \n1-> Dodaj nowa notatke\n2-> Dodanie Notatki z data\n3-> Wykasowanie notatki" +
            "\n4-> Wykasowanie wszystkich notatek\n5-> Pokazanie wybranej notatki\n6-> Pokazanie wszystkich notatek";

    public void printOptions() {
        System.out.println(options2);
    }

    public void addNote() {
        notePad.addElement();
    }

    public void addDatedNote() {
        timeTable.addElement();
    }

    public void removeElement() {
        correctRemove = false;

        if (list.size() == 0) {
            System.out.println("\n No ale nie masz notatek jeszcze to co bedziesz kasowal?");
        } else {
            while (!correctRemove) {
                try {
                    message = null;
                    System.out.println("Podaj id notki ktora chcesz wyrzucic: ");
                    list.remove(input.nextInt() - 1);
                    correctRemove = true;
                    System.out.println("Notka usunieta ");
                } catch (IndexOutOfBoundsException ex) {
                    builder.append("\nNa razie mamy: ");
                    builder.append(list.size());
                    builder.append(" notatnki, a Ty wpisales zly numer notatki");
                    message = builder.toString();
                    System.out.println(message);
                } catch (InputMismatchException ex) {
                    System.out.println("\n Ale tu musisz podac liczbe... a nie co innego, to teraz od nowa!");
                    break;
                }
            }
        }
        id -= 1;
    }

    public void removeAllElements() {
        System.out.println("\n Notatnik pusty");
        list.clear();
        id = 0;
    }

    public void showElement() {
        correctShow = false;
        StringBuilder builder = new StringBuilder();
        if (list.size() == 0) {
            System.out.println("Notatnik pusty");
        } else {
            String message;
            while (!correctShow) {
                try {
                    System.out.println("Podaj id notki ktora chcesz wydrukowac: ");
                    builder.append(id);
                    builder.append(" ");
                    builder.append(list.get(input.nextInt() - 1));
                    System.out.println(builder.toString());
                    correctShow = true;
                } catch (InputMismatchException ex) {
                    System.out.println("\n Ale tu musisz podac liczbe... a nie co innego, to teraz od nowa!");
                    break;
                } catch (IndexOutOfBoundsException ex) {
                    builder.append("\n Na razie mamy: ");
                    builder.append(list.size());
                    builder.append(" a Ty wpisales zly numer notatki...");
                    message = builder.toString();
                    System.out.println(message);
                }
            }
        }
    }

    public void showAllElements() {
        StringBuilder builder = new StringBuilder();
        correctShow = false;
        if (id == 0) {
            System.out.println("Notatnik pusty");
        } else {
            int noteId = 1;
            String message = new String();
            for (String specificNote : list) {
                builder.append("\n");
                builder.append(noteId);
                builder.append(" ");
                builder.append(specificNote);
                message = builder.toString();
                noteId++;
            }
            System.out.println(message);
        }
    }
}
