package pl.budzisz.mariusz.data.TimeTable.SpecificDate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MakeAnHour {
    private int hour;
    private int minute;
    private String time;
    private Scanner input = new Scanner(System.in);

    public String make() {
        while (true) {
            try {
                System.out.println("Godzina: ");
                hour = input.nextInt();
                if (hour > 24 || hour < 0) {
                    System.out.println("Dzien ma najwyzej 24 godziny... Podaj jeszcze raz.");
                } else {
                    System.out.println("Minuta: ");
                    minute = input.nextInt();
                    if (minute > 60 || minute < 0) {
                        System.out.println("Godzina ma najwyzej 60 minut... Podaj jeszcze raz.");
                    } else {
                        break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Ale miales wpisac cyfry, a nie jakies literki...");
                input.nextLine();
            } finally {
                time = hour + ":" + minute;
            }
        }
        return time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}