package data;

import java.util.Scanner;

public class SDayString {
    private String data;

    private SpecificDay sDay = new SpecificDay();

    private Scanner input = new Scanner(System.in);

    private StringBuilder builder = new StringBuilder();

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
        builder.append(sDay.getD());
        builder.append(".");
        builder.append(sDay.getM());
        builder.append(".");
        builder.append(sDay.getY());
        builder.append("r.");
        this.data = builder.toString();
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
