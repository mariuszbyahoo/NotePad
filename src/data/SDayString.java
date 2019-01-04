package data;

public class SDayString {
    private String data;

    private SpecificDay sDay = new SpecificDay();

    public void setData(int d, int m, int y) {
        d = sDay.getD();
        m = sDay.getM();
        y = sDay.getY();
        this.data = d + "." + m + "." + y + "r.";
    }

    public String getData() {
        return data;
    }
}
