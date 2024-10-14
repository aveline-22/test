package tugas1.tugaspenilaian;

import java.util.Scanner;

public class driverclass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String choice = "a";
        System.out.println("pilih gitar atau piano?");
        choice = in.nextLine();

        if (choice.equalsIgnoreCase("gitar")) {
            System.out.println("imputkan nama gitar: ");
            String name = in.nextLine();
            System.out.println("gitar elektrik? (TRUE/FALSE): ");
            Boolean isElectric = in.nextBoolean();
            in.nextLine();
            System.out.println("imputkan numString: ");
            int numString = in.nextInt();
            System.out.println("imputkan harga  gitar: ");
            double price = in.nextDouble();

            guitar gtr1 = new guitar(name, price, numString, isElectric);
            gtr1.print();

        } else if (choice.equalsIgnoreCase("piano")) {
            System.out.println("inputkan nama piano: ");
            String name = in.nextLine();
            System.out.println("tipe piano: ");
            String pianoType = in.nextLine();
            System.out.println("imputkan harga piano: ");
            double price = in.nextDouble();

            piano p1 = new piano(name, pianoType, price);
            p1.print();

        }

    }

}
