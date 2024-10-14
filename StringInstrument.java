package tugas1.tugaspenilaian;

public class StringInstrument extends instruments {
    private int numString;

    public int getNumString() {
        return this.numString;
    }

    public void setNumString(int numString) {
        this.numString = numString;
    }

    public StringInstrument() {
        super();
        numString = 0;

    }

    public StringInstrument(String name, double price, int numString) {
        super(name, price);
        this.numString = numString;

    }

    public void print() {
        super.print();
        System.out.println("num string: " + numString);
    }

}
