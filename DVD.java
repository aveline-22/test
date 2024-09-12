package PERSEWAAN;
//subclass
public class DVD extends Product{
    private int legth;
    private String rating;
    private String studio;

    public int getLegth() {
        return this.legth;
    }

    public void setLegth(int legth) {
        this.legth = legth;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public DVD(){
        number = 9;
        name = "DVD Selamat siang";
        
        quantity = 0;
        price = 0.0;
        legth = 2;
        rating = "remaja";
        studio = "max picture"; 
    }

    public DVD(int number, String name, int quantity, int price, int legth, String rating, String studio){
        this.number = number;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.legth = legth;
        this.rating = rating;
        this.studio = studio;


    }
    public void print(){
        System.out.println("Number : " + number);
        System.out.println("Name : " + name);
        System.out.println("Quantitiy : " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Legth : " + legth);
        System.out.println("Rating : " + rating);
        System.out.println("Studio : " + studio);
     }


    
}
