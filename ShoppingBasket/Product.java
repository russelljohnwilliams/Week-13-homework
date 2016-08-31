package ShoppingBasket;
import ShoppingBasket.*;
import java.util.*;

public abstract class Product{

  protected String artist;
  protected String title;
  protected String id;
  protected double price;


  public String getProductArtist(){
    return this.artist;
  }

  public String getProductTitle(){
    return this.title;
  }

  public String getProductId(){
    return this.id;
  }

  public double getProductPrice(){
    return this.price;
  }

}