import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
    double jumlahjamkerja, tarifpejamdaripengguna, potonganpajak, totalgaji;

    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan jumlah jam kerja");
    jumlahjamkerja = input.nextDouble();
    System.out.println("Masukkan tarif perjam pengguna");
    tarifpejamdaripengguna = input.nextDouble();
    System.out.println("Masukkan potongan pajak");
    potonganpajak = input.nextDouble();

    totalgaji= jumlahjamkerja*tarifpejamdaripengguna;
    potonganpajak=(potonganpajak/100)*totalgaji;
    totalgaji=totalgaji-potonganpajak;
    System.out.println("Total gaji:"+totalgaji);
    }
    
}
