package PERULANGAN;

import java.util.Scanner;

public class PerulanganNilaiSiswa {
    public static void main(String[] args) {
        int jumlahSiswa, nilai, totalNilai;
        Scanner s = new Scanner(System.in);

        System.out.println("masukkan jumlah siswa:");
        jumlahSiswa = s.nextInt();
        int total = 0;


        for (int i = 1; i <=jumlahSiswa; i++){    
        System.out.println("masukkan nilai siswa " + i + ":");
        nilai = s.nextInt();
        total += nilai;
        }
        double ratarata = (double) total / jumlahSiswa;
        System.out.println("total nilai: " + total);
        System.out.println("rata rata nilai: " + ratarata);
        
       
        
        
         
        


        
    }
} 
    
    
    
