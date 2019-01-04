package data;

import java.util.ArrayList;
import java.util.Scanner;

public class NotePad {
    Scanner input = new Scanner(System.in);
    private ArrayList<String> list = new ArrayList<>();

    private int NotePadId;

    public ArrayList<String> getList() {
        return list;
    }

    public void setList() {
        this.list = list;
    }

    public void addElement() {
        NotePadId++;
        System.out.println("Id: " + NotePadId);
        System.out.println("Podaj notatkę: ");
        String txt = input.nextLine();
        Note note = new Note(txt);
        list.add(note.getTxt());
    }

    public int getNotePadId() {
        return NotePadId;
    }

    public void setNotePadId(int notePadId) {
        this.NotePadId = notePadId;
    }
}
