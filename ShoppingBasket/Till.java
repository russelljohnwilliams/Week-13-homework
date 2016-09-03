package ShoppingBasket;
import ShoppingBasket.*;
import java.util.*;

public class Till{

  private Double money;
  // private ArrayList<Product> basket;

  public Till(Double money){
    this.money = money;
    // basket = new ArrayList<Product>();
  }

  public double executeBogofDeal(ArrayList<Product> basket){
    ArrayList<Double> prices = new ArrayList<Double>(); 
    for (Product item : basket) {
      String productId = item.getProductId();
      if (productId.equals("bogof")) {
        double value = item.getProductPrice();
        prices.add(value);
      }
        Collections.sort(prices);
        return prices.get(0);
      }
    return 0.0;
  }

  // loop through 'prices'
  // if the number is devisible by two &&  there is more than
  // use that number to return the amount of discounts to apply


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