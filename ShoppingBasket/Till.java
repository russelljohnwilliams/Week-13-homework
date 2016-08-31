package ShoppingBasket;
import ShoppingBasket.*;
import java.util.*;

public class Till{

  private Double money;
  // private  prices;
  private ArrayList<Product> basket;

  public Till(Double money){
    this.money = money;

    basket = new ArrayList<Product>();
  }

  public double executeBogofDeal(){
    ArrayList<Double> prices = new ArrayList<Double>();
    for (Product item : basket) {
      if (item.getProductId() == "bogof") {
        prices.add(item.getProductPrice());
        Collections.sort(prices);
        prices.remove(0);
        return prices.get(0);
        }
      }
    return 0;
  }

  // public float tenPercentDiscount(){


  //   // check for Bogof()
  //   // then total all the Shopping items (another function)
  //   // deduct 10%
  // return ;
  // }

  // // public float twoPercentDiscount(){
  //   // check for Bogof(), then TenPercent()
  //   // get total
  //   // deduct 2%
  // return ;
  // }

}