//Driver Class
import java.util.Scanner;
public class KaryawanTester {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("imputkan nama karyawan: ");
        String nama = input.nextLine();
        System.out.println("imputkan unit: ");
        String unit = input.nextLine();
        System.out.println("imputkan alamat: ");
        String alamat = input.nextLine();
        System.out.println("inputkan ID: ");
        int id = input.nextInt();
        Karyawan sintia = new Karyawan (id, nama, unit, alamat);
        sintia.print();

        //object
        //Class object = new Contructor
        // Karyawan Denada = new Karyawan (123, "Denada Maheswara", "Kurikulum", "Malang");
        // Karyawan Miranda = new Karyawan (356, "Miranda Syeradari", "Kesiswaan", "Tulungagung");
        // Karyawan Serra = new Karyawan (153, "Serra Adindaraya", "Kurikulum", "Blitar");
        // Karyawan Meylan = new Karyawan (354, "Meylan Syakirra", "BK", "Jakarta");
        // Karyawan Sania = new Karyawan (153, "Sania Rainasari", "Kesiswaan", "Jogja");

        // Denada.print();
        // Miranda.print();
        // Serra.print();
        // Meylan.print();
        // Sania.print();
        input.close();
    }
    
}
