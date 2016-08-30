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

  public int getIndexOfItemInBasket(Product product){
    for (Product item : basket) {
      if (item.getProductDescription() == product.getProductDescription()) {
        return basket.indexOf(item);
      }
    }
    return -1;
  }

  public void removeItemFromBasket(Product product){
    int index = getIndexOfItemInBasket(product);
    basket.remove(index);
  }


}