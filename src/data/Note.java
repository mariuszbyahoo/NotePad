package data;

public class Note {
    private String txt;
    private int id;

    public Note(String txt, int id) {
        setTxt(txt);
        setId(id);
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    private void setId(int id) {
        this.id = id;
    }
}
