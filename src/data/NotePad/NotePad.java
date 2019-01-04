package data.NotePad;

import methods.Options;

import java.util.Scanner;

public class NotePad {
    Scanner input = new Scanner(System.in);

    private String txt;

    public void addElement() {
        Options.id++;
        System.out.println("Id: " + Options.id);
        System.out.println("Podaj notatkę: ");
        txt = input.nextLine();
        Note note = new Note(txt);
        Options.list.add(note.getTxt());
    }
}
