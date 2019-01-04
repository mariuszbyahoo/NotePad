package data;

public class Note {
    private String data;
    private String txt;

    SDayString sds = new SDayString();

    public Note(String txt) {
        setTxt(txt);
    }

    public Note(String txt, String data) {
        setData(sds.getData());
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
