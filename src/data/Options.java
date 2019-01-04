package data;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Options {
    private boolean correctRemove;
    private boolean correctShow;
    private Scanner input = new Scanner(System.in);

    private StringBuilder builder = new StringBuilder();

    NotePad notePad = new NotePad();

    private ArrayList<String> list = notePad.getList();

    private String options1 = "\nDostepne opcje: \n1-> Otworz notatnik\n2-> Otworz terminarz\n3->Wyjscie z programu";

    private String options2 = "\nDostepne opcje: \n1-> Dodaj nowa notatke\n2-> Wykasowanie notatki\n3-> Wykasowanie wszystkich notatek" +
            "\n4-> Pokazanie wybranej notatki\n5-> Pokazanie wszystkich notatek";

    public void useNotePad() {
        list = notePad.getList();
    }

    public void printOptions() {
        System.out.println(options2);
    }

    public void addNote() {
        notePad.addElement();
        notePad.setList();
    }

    public void removeElement() {
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
        notePad.setNotePadId(notePad.getNotePadId() - 1);
    }

    public void removeAllElements() {
        System.out.println("\n Notatnik pusty");
        list.clear();
        notePad.setNotePadId(notePad.getNotePadId());
    }

    public void showElement() {
        correctShow = false;

        if (list.size() == 0) {
            System.out.println("Notatnik pusty");
        } else {
            String message;
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
        correctShow = false;
        if (notePad.getNotePadId() == 0) {
            System.out.println("Notatnik pusty");
        } else {
            int noteId = 1;
            String message;
            for (String specificNote : list) {
                builder.append(noteId);
                builder.append(" ");
                builder.append(specificNote);
                message = builder.toString();
                System.out.println(message);
                noteId++;
            }
        }
    }
}
