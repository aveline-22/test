import java.util.Scanner;

public class PembelianBarang2 {
    public static void main(String[] args) {
        double total, diskon, potHar;

        Scanner input = new Scanner(System.in);
        System.out.println("masukkan total pembelian: ");
        total = input.nextDouble();

        if (total>150000){
            potHar = 0;
            diskon = 0.1 * total;
            total -= diskon;
        }else {
            diskon=0;
            potHar = 5000;
            total  -= diskon;
        }

            System.out.println("diskon; " + potHar);
            System.out.println("potongan harga: "+ potHar);
            System.out.println("total yang harus dinayar: "+ total);
           







            
        

    }
    
}
