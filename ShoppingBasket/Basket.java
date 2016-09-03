package ShoppingBasket;
import ShoppingBasket.*;
import java.util.*;

public class Basket{

  private ArrayList<Product> basket;
  private String loyaltyCard;

  public Basket(String loyaltyCard){
    this.basket = new ArrayList<Product>();
    this.loyaltyCard = loyaltyCard;
  }

  public ArrayList<Product> getBasket(){
    return this.basket;
  }

  public String getLoyaltyCard(){
    return this.loyaltyCard;
  }

  public int countBasketContents(){
    return this.basket.size();
  }

  public void addItemToBasket(Product product){
    this.basket.add(product);
  }

  public int getIndexOfItemInBasket(Product product){
    for (Product item : basket) {
      if (item.getProductTitle() == product.getProductTitle()) {
        return basket.indexOf(item);
      }
    }
    return -1;
  }

  public void removeItemFromBasket(Product product){
    int index = getIndexOfItemInBasket(product);
    basket.remove(index);
  }

  public void removeAllItems(){
    basket.clear();
  }


}