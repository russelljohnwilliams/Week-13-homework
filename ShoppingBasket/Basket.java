package ShoppingBasket;
import ShoppingBasket.*;
import java.util.*;

public class Basket{

  private ArrayList<Product> basket;


  public Basket(){
    this.basket = new ArrayList<Product>();
  }

  public int countBasketContents(){
    return this.basket.size();
  }

  public void addItemToBasket(Product product){
    this.basket.add(product);

  }

  


}