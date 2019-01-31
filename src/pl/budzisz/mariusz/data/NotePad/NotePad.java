package pl.budzisz.mariusz.data.NotePad;

import pl.budzisz.mariusz.methods.Options;

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

    public void loadFromFile(String loadedTxt) {
        Options.id++;
        Note note = new Note(loadedTxt);
        Options.list.add(note.getTxt());
    }
}
