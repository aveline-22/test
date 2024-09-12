package PERSEWAAN;
import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("mau membuat berapa objek");
        int jumlah = in.nextInt();
        System.out.println("jumlah: "+ jumlah);
        }catch (Exception e){
            System.out.println("tipe data salah");
        }
        System.out.println("pilih CD / DVD");
        String pilihan = in.next();


        if(pilihan.equals("CD")){
            CD c = new CD();
            c.print();
        }else if (pilihan.equals("DVD")){
            DVD d = new DVD();
            d.print();
        }else {
            System.out.println("sistem salah");
        }
        
    }
    
}
