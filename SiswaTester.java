//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //object
        //Class object = new Contructor
        Siswa aveline = new Siswa();
        Siswa lila = new Siswa();
        Siswa leni = new Siswa();
        Siswa memey = new Siswa();
        Siswa keyza = new Siswa();

        aveline.id = 4;
        aveline.nama = "aveline voleta";
        aveline.ipk = 90;

        lila.id = 12;
        lila.nama = "kalilah arafah";
        lila.ipk = 88;

        leni.id = 16;
        leni.nama = "leni sintiasari";
        leni.ipk = 87;

        memey.id = 31;
        memey.nama = "nur azlina";
        memey.ipk = 86;

        keyza.id = 14;
        keyza.nama = "keyza nadine";
        keyza.ipk = 85; 
        System.out.println("ID : " + aveline.id);
        System.out.println("Nama : " + aveline.nama);
        System.out.println("IPK : " + aveline.ipk);

        System.out.println("ID : " + lila.id);
        System.out.println("Nama : " + lila.nama);
        System.out.println("IPK : " + lila.ipk);

        System.out.println("ID : " + leni.id);
        System.out.println("Nama : " + leni.nama);
        System.out.println("IPK : " + leni.ipk);

        System.out.println("ID : " + memey.id);
        System.out.println("Nama : " + memey.nama);
        System.out.println("IPK : " + memey.ipk);

        System.out.println("ID : " + keyza.id);
        System.out.println("Nama : " + keyza.nama);
        System.out.println("IPK : " + keyza.ipk);
    }
     
}