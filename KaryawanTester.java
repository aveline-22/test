//Driver Class
public class KaryawanTester {
    public static void main(String[] args) {
        //object
        //Class object = new Contructor
        Karyawan Denada = new Karyawan (123, "Denada Maheswara", "Kurikulum", "Malang");
        Karyawan Miranda = new Karyawan (356, "Miranda Syeradari", "Kesiswaan", "Tulungagung");
        Karyawan Serra = new Karyawan (153, "Serra Adindaraya", "Kurikulum", "Blitar");
        Karyawan Meylan = new Karyawan (354, "Meylan Syakirra", "BK", "Jakarta");
        Karyawan Sania = new Karyawan (153, "Sania Rainasari", "Kesiswaan", "Jogja");

        Denada.print();
        Miranda.print();
        Serra.print();
        Meylan.print();
        Sania.print();

    }
    
}
