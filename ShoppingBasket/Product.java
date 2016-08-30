package ShoppingBasket;
import ShoppingBasket.*;
import java.util.*;

public class Product{

  private String product;
  private String id;
  private double price;


  public Product(String product, String id, double price){

    this.product = product;
    this.id = id;
    this.price = price; 

  }

  public String getProductDescription(){
    return this.product;
  }

  public String getProductId(){
    return this.id;
  }

  public double getProductPrice(){
    return this.price;
  }

}