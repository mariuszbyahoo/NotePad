package data;

public class Note {
    private String data;
    private String txt;

    public Note(String txt) {
        setTxt(txt);
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
