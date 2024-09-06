import java.util.Scanner;

public class seleksiprakerin {
    public static void main(String[] args) {
        String nama, kelas, periaku;
        int nilai;

        Scanner s = new Scanner(System.in);
        System.out.print("nama: ");
        nama = s.nextLine();
        System.out.print("kelas: ");
        kelas = s.next();
    if (kelas.equalsIgnoreCase("XII")){
        System.out.print("perilaku siswa: (BAIK/CUKUP): ");
        periaku=s.next();
        if (periaku.equalsIgnoreCase("baik")) {
            System.out.print("nilai siswa: ");
            nilai= s.nextInt();
            if (nilai >=85) {
                System.out.println(nama + " dinyatakan  bisa mengikuti prakerin");

                
            }else{
                System.out.println("anda gagal karena nilai");
            }
            
        }else{
            System.out.println("maaf anda gagal karena perilaku");
        }

    }else{
        System.out.println("maaf anda gagal karena bukan kelas XII");
    }
    }
    
}
