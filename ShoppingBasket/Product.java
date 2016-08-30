package ShoppingBasket;
import ShoppingBasket.*;
import java.util.*;

public class Product{

  private String description;
  private String id;
  private double price;


  public Product(String description, String id, double price){

    this.description = description;
    this.id = id;
    this.price = price; 

  }

  public String getProductDescription(){
    return this.description;
  }

  public String getProductId(){
    return this.id;
  }

  public double getProductPrice(){
    return this.price;
  }

}