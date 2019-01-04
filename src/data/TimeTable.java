package data;

import java.util.ArrayList;
import java.util.Scanner;

public class TimeTable {

 private int TimeTableId;
    private String data;
    private String txt;

 private ArrayList<String> list = new ArrayList<>();

 private Scanner input = new Scanner(System.in);

    public ArrayList<String> getList() {
        return list;
    }

    public void setList() {
        this.list = list;
    }

    public void addElement() {
 SDayString sDayString = new SDayString();
 TimeTableId++;
 System.out.println("Id: " + TimeTableId);
 sDayString.setData(sDayString.createData());
        DatedNote datedNote = new DatedNote(input.nextLine(), sDayString.getData());
        list.add(datedNote.getTxt());
    }

 public int getTimeTableId() {
 return TimeTableId;
    }

 public void setTimeTableId(int timeTableId) {
 this.TimeTableId = timeTableId;
    }
}
