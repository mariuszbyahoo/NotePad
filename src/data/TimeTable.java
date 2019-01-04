package data;

import java.util.ArrayList;
import java.util.Scanner;

public class TimeTable {
    private ArrayList<String> list = new ArrayList<>();

    private int id;
    private String data;
    private String txt;

    Scanner input = new Scanner(System.in);

    public ArrayList<String> getList() {
        return list;
    }

    public void setList() {
        this.list = list;
    }

    public void addElement() {
        id++;
        System.out.println("Id: " + id);
        Note note = new Note(input.nextLine());
        list.add(note.getTxt());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
