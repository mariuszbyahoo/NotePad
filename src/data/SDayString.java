package data;

import java.util.Scanner;

public class SDayString {
    private String data;

    private SpecificDay sDay = new SpecificDay();

    public Scanner input = new Scanner(System.in);

    public SDayString() {
        setData(createData());
    }

    public String createData() {
        System.out.println("Dnia: ");
        sDay.setD(input.nextInt());
        System.out.println("Miesiaca: ");
        sDay.setM(input.nextInt());
        System.out.println("Roku: ");
        sDay.setY(input.nextInt());
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
