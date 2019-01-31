package pl.budzisz.mariusz.data.TimeTable;

import pl.budzisz.mariusz.methods.Options;

public class TimeTable {

    public void addElement() {
        Options.id++;
        System.out.println("Id: " + Options.id);
        DatedNote datedNote = new DatedNote();
        datedNote.setTxt(datedNote.addNote());
        Options.list.add(datedNote.getTxt());
    }
}
