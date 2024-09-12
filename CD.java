package PERSEWAAN; // nama folder tempat penyimpanan

//subclass
public class CD extends Product {

   private String artist;
   private int totalSong;
   private String label;

   public String getArtist() {
      return this.artist;
   }

   public void setArtist(String artist) {
      this.artist = artist;
   }

   public int getTotalSong() {
      return this.totalSong;
   }

   public void setTotalSong(int totalSong) {
      this.totalSong = totalSong;
   }

   public String getLabel() {
      return this.label;
   }

   public void setLabel(String label) {
      this.label = label;
   }

   public CD() {
      number = 10;
      name = "CD Selamat Siang";
      quantity = 0;
      artist = "Salman";
      totalSong = 0;
      label = "sony music";
   } 

   public CD(int number, String name, int quantity, double price, String artist, int totalSong, String label) {
      this.number = number;
      this.name = name;
      this.quantity = quantity;
      this.price = price;
      this.artist = artist;
      this.totalSong = totalSong;
      this.label = label;
   }

   public void print() {
      System.out.println("Number : " + number); // atau bisa langsung menggunakan code super.print(); dan bawahnya
                                                // diberi systemoutprint (agar tidsk error jika super class diganti
                                                // variable)
      System.out.println("Name : " + name);
      System.out.println("Quantitiy : " + quantity);
      System.out.println("Artist: " + artist);
      System.out.println("Total song : " + totalSong);
      System.out.println("Label : " + label);
   }

}
