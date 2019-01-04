package data.TimeTable;

import java.util.Scanner;

public class SpecificDay {
    private int d;
    private int m;
    private int y;

    private String data = d + "." + m + "." + y + "r.";

    public SpecificDay() {
        setD(d);
        setM(m);
        setY(y);
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getD() {
        return d;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getM() {
        return m;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
