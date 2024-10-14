package tugas1.tugaspenilaian;

public class guitar extends StringInstrument {

    private boolean isElectric;

    public boolean isIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public guitar(String name, double price, int numString, boolean isElectric) {
        super(name, price, numString);
        this.isElectric = isElectric;

    }

    public guitar() {
        super();
        isElectric = false;
    }

    public void print() {
        super.print();
        System.out.println("is electric: " + isElectric);

    }

}
