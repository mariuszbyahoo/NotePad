public class Note {
    private int id = 1;
    private String txt;

    public Note() {

    }

    public void addNote(String txt) {
        this.id++;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
