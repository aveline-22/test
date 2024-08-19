//Object Class 
public class Karyawan{
    int id;
    String nama;
    String unit;
    String alamat;

    //Contructor Parameter
    public Karyawan (int id, String nama,String unit, String alamat ) {
        this.id = id;
        this.nama = nama;
        this.unit = unit;
        this.alamat = alamat;

    }

    //method print 
    public void print (){
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Unit: " + unit);
        System.out.println("Alamat: " + alamat);
    }
} 
