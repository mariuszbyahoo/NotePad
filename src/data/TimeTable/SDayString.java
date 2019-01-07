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
        while (true) {
            System.out.println("Miesiaca: ");
            number = input.nextInt();
            if (number > 12 || number < 0) {
                System.out.println("Rok ma najwyzej 12 miesiecy... Podaj jeszcze raz.");
            } else {
                break;
            }
        }
        sDay.setM(number);
        while (true) {
            System.out.println("Roku: ");
            number = input.nextInt();
            if (number < 2018) {
                System.out.println("Nie mozna planowac przeszlosci... No zastanow sie...");
            } else {
                break;
            }
        }
        sDay.setY(number);
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
