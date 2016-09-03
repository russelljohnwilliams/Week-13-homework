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

  public double countMoneyInTill(){
    return this.money;
  }

  public void subTotal(ArrayList<Product> basket){
    ArrayList<Double> prices = new ArrayList<Double>(); 
    for (Product item : basket) {
      this.money += item.getProductPrice();
    }
  }

  public void executeBogofDeal(ArrayList<Product> basket){
    ArrayList<Double> prices = new ArrayList<Double>(); 
    for (Product item : basket) {
      String productId = item.getProductId();
      if (productId.equals("bogof")) 
      {
        double productPrice = item.getProductPrice();
        prices.add(productPrice);
      }
    } 
    Collections.sort(prices);
    for (int i = 0; i < prices.size() / 2; i++)
    {
      this.money -= prices.get(i);
    }
  }


public void tenPercentDiscount(){
  // till.executeBogofDeal(ArrayList<Product> basket)
double discount = this.money;
if (this.money >= 20.00){
double ten = discount / 100 * 10;
this.money -= ten;
}
}

// // public float twoPercentDiscount(){
//   // check for Bogof(), then TenPercent()
//   // get total
//   // deduct 2%
// return ;
// }

}