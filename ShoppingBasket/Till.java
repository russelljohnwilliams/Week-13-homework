package ShoppingBasket;
import ShoppingBasket.*;
import java.util.*;

public class Till{

  private Double money;

  public Till(Double money){
    this.money = money;
  }


  public double countMoneyInTill(){
    return this.money;
  }


  public void subTotal(ArrayList<Product> item){
    ArrayList<Double> prices = new ArrayList<Double>(); 
    for (Product items : item) {
      this.money += items.getProductPrice();
    }
  }


  public void executeBogofDeal(ArrayList<Product> item){
    ArrayList<Double> prices = new ArrayList<Double>(); 
    for (Product items : item) {
      String productId = items.getProductId();
      if (productId.equals("bogof")) 
      {
        double productPrice = items.getProductPrice();
        prices.add(productPrice);
      }
    } 
    Collections.sort(prices);
    for (int i = 0; i < prices.size() / 2; i++)
    {
      this.money -= prices.get(i);
    }
  }


  public void tenPercentDiscount(ArrayList<Product> item){
    executeBogofDeal(item);
    double discount = this.money;
    if (this.money >= 20.00){
      double ten = discount / 100 * 10;
      this.money -= ten;
    }
  }


  public void twoPercentDiscount(ArrayList<Product> item, Basket basket){
    tenPercentDiscount(item);
    String loyaltyCard = basket.getLoyaltyCard();
    if (loyaltyCard.equals("loyal")){
      double discount = this.money;
      double loyalty = discount / 100 * 2;
      this.money -= loyalty;
    }
  }

}