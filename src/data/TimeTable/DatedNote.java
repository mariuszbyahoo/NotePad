package data.TimeTable;

import java.util.Scanner;

public class DatedNote {
    private String data;
    private String txt;
    private String message;

    Scanner input = new Scanner(System.in);
    StringBuilder builder = new StringBuilder();
    SDayString sDayString = new SDayString();

    public DatedNote() {

    }

    public String addNote() {
        System.out.println("Napisz, co chcesz zanotowac, pozniej podasz date: ");
        setTxt(input.nextLine());
        setData(sDayString.createData());
        builder.append(this.txt);
        builder.append(" ");
        builder.append(this.data);
        message = builder.toString();
        builder.setLength(0);
        return message;
    }


    private String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
