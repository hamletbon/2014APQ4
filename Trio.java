
/**
 * Write a description of class Sandwich here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trio implements MenuItem
{
    //fields
    private String name;
    private double price;
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;
    
    //constructor
    public Trio(Sandwich aSandwich, Salad aSalad, Drink aDrink)
    {
        this.sandwich = aSandwich;
        this.salad = aSalad;
        this.drink = aDrink;
        this.name = aSandwich.getName() + "/" + aSalad.getName() + "/" + aDrink.getName(); 
        if ((aSandwich.getPrice() < aSalad.getPrice()) && (aSandwich.getPrice() < aDrink.getPrice())){
            this.price = aSalad.getPrice() + aDrink.getPrice();
        }else if (aSalad.getPrice() < aDrink.getPrice()){
            this.price = aSandwich.getPrice() + aDrink.getPrice();
        }else{
            this.price = aSandwich.getPrice() + aSalad.getPrice();
        }
    }
    
    //methods
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
}
