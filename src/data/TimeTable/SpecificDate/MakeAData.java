package data.TimeTable.SpecificDate;

public class MakeAData {

    private StringBuilder builder = new StringBuilder();

    private MakeADay makeADay = new MakeADay();
    private MakeAMonth makeAMonth = new MakeAMonth();
    private MakeAnYear makeAnYear = new MakeAnYear();

    private String data;

    public String makeAData() {

        builder.append(makeADay.makeADay());
        builder.append(".");

        builder.append(makeAMonth.makeAMonth());
        builder.append(".");

        builder.append(makeAnYear.makeAnYear());
        builder.append("r.");

        this.data = builder.toString();
        return data;
    }
}
