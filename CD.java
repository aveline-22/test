 package PERSEWAAN; // nama folder tempat penyimpanan


//subclass
    public class CD extends Product {
      public static void main(String[] args) {
         
      }
      private String artist;
      private int totalSong;
      private String label;

      public CD(){
         number = 10;
         name = "CD Selamat Siang";
         quantity = 0;
         artist = "Salman";
         totalSong = 0;
         label = "sony music";

         
      }
      public void print(){
         System.out.println("Number : " + number);
         System.out.println("Name : " + name);
         System.out.println("Quantitiy : " + quantity);
         System.out.println("Artist: " + artist);
         System.out.println("Total song : " + totalSong);
         System.out.println("Label : " + label);
      }

      
      }
    
        
    

