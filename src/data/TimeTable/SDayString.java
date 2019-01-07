package data.TimeTable;

import java.util.Scanner;

public class SDayString {
    private String data;
    private int number;

    private SpecificDay sDay = new SpecificDay();

    private Scanner input = new Scanner(System.in);

    private StringBuilder builder = new StringBuilder();

    public SDayString() {

    }

    public String createData() {
        while (true) {
            System.out.println("Dnia: ");
            number = input.nextInt();
            if (number > 31 || number < 0) {
                System.out.println("Miesiac ma najwyzej 31 dni... Podaj jeszcze raz.");
            } else {
                break;
            }
        }
        sDay.setD(number);
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
