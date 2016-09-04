// package ShoppingBasket;
// import ShoppingBasket.*;
// import java.util.*;

// public class BogofDiscount implements Discountable{

//   public void applyDiscount(ArrayList<Product> item, Till till){
    
//     ArrayList<Double> prices = new ArrayList<Double>(); 
//     for (Product items : item) {
//       String productId = items.getProductId();
//       if (productId.equals("bogof")) 
//       {
//         double productPrice = items.getProductPrice();
//         prices.add(productPrice);
//       }
//     } 
//     Collections.sort(prices);
//     for (int i = 0; i < prices.size() / 2; i++)
//     {
//       Double money = till.getTill();
//       money -= prices.get(i);
//       till.setTill(money);
//     }
//   }
// }