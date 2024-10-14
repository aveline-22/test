package tugas1.tugaspenilaian;

public class piano extends instruments {

    private String pianoType;

    public String getPianoType() {
        return this.pianoType;
    }

    public void setPianoType(String pianoType) {
        this.pianoType = pianoType;
    }

    public piano() {
        super();
        pianoType = "b";
    }

    public piano(String name, String pianoType, double price) {
        super(name, price);
        this.pianoType = pianoType;
    }

    public void print() {
        super.print();
        System.out.println("piano type: " + pianoType);
    }

}
