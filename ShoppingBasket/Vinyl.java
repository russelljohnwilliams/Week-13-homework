package ShoppingBasket;
import ShoppingBasket.*;
import java.util.*;

public class Vinyl extends Product{

  private String weight;

  public Vinyl(String artist, String title, String id, double price, String weight){
    this.artist = artist;
    this.title = title;
    this.id = id;
    this.price = price;
    this.weight = weight;
  }

  public String getWeight(){
    return this.weight;
  }

  

}

