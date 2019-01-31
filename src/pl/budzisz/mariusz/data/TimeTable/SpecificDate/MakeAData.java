package pl.budzisz.mariusz.data.TimeTable.SpecificDate;

import java.util.Scanner;

public class MakeAData {

    private StringBuilder builder = new StringBuilder();

    private MakeADay makeADay = new MakeADay();
    private MakeAMonth makeAMonth = new MakeAMonth();
    private MakeAnYear makeAnYear = new MakeAnYear();
    private MakeAnHour makeAnHour = new MakeAnHour();
    private Scanner input = new Scanner(System.in);

    private String data;

    public String makeAData() {

        System.out.println("1->Notatka na caly dzien\n2-> Notatka na konkretna godzine");

        if (input.nextInt() == 1) {

            builder.append(" Dnia: ");
            builder.append(makeADay.make());
            builder.append(".");

            builder.append(makeAMonth.make());
            builder.append(".");

            builder.append(makeAnYear.make());
            builder.append("r.");

            this.data = builder.toString();

        } else {

            builder.append(" Dnia: ");
            builder.append(makeADay.make());
            builder.append(".");

            builder.append(makeAMonth.make());
            builder.append(".");

            builder.append(makeAnYear.make());
            builder.append("r.");
            System.out.println("Od: ");
            builder.append(" Godzina: ");
            builder.append(makeAnHour.make());
            System.out.println("Do: ");
            builder.append(" Do godziny: ");
            builder.append(makeAnHour.make());

            this.data = builder.toString();
        }
        return data;
    }
}