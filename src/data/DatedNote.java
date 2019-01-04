package data;

public class DatedNote {
    private String data;
    private String txt;


    public DatedNote(String txt, String data) {
        SDayString sDayString = new SDayString();
        setTxt(txt);
        setData(sDayString.getData());
    }

    private String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
