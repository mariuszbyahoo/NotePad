package data;

public class SpecificDay {
    private int day;
    private int month;
    private int year;

    private String toDo;

    public SpecificDay() {
        setDay(day);
        setMonth(month);
        setYear(year);
        setToDo(toDo);
    }

    public void printSpecDay() {
        System.out.println(day + "." + month + "." + year);
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }

    private void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
