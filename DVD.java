package PERSEWAAN;
//subclass
public class DVD extends Product{
    private int legth;
    private String rating;
    private String studio;

    public DVD(){
        number = 9;
        name = "DVD Selamat siang";
        quantity = 0;
        price = 0.0;
        legth = 2;
        rating = "remaja";
        studio = "max picture";

        
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
