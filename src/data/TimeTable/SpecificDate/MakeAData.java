package data.TimeTable.SpecificDate;

public class MakeAData {

    private StringBuilder builder = new StringBuilder();

    private MakeADay makeADay = new MakeADay();
    private MakeAMonth makeAMonth = new MakeAMonth();
    private MakeAnYear makeAnYear = new MakeAnYear();
    private MakeAnHour makeAnHour = new MakeAnHour();

    private String data;

    public String makeAData() {

        builder.append(" Dnia: ");
        builder.append(makeADay.make());
        builder.append(".");

        builder.append(makeAMonth.make());
        builder.append(".");

        builder.append(makeAnYear.make());
        builder.append("r.");

        builder.append(" Godzina: ");
        builder.append(makeAnHour.make());

        this.data = builder.toString();
        return data;
    }
}
