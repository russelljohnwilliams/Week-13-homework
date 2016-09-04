
import static org.junit.Assert.*;
import org.junit.*;

import ShoppingBasket.*;
import java.util.*;

public class TillTest {

  CompactDisc item1;
  CompactDisc item2;
  Vinyl item3;
  Vinyl item4;
  Vinyl item5;
  Basket basket;
  Till till;

  @Before
  public void before(){
    item1 = new CompactDisc("Neil Young", "After The Goldrush", "bogof", 14.99);
    item2 = new CompactDisc("Bobby Conn", "The Golden Age", "bogof", 9.99);
    item4 = new Vinyl("Divine Comedy", "Casanova", "bogof", 15.99, "undefined");
    item5 = new Vinyl("Sonic Youth", "EVOL", "bogof", 10.99, "180gm");

    item3 = new Vinyl("Miles Davis", "Sketches of Spain", "null", 3.99, "180gm");
    basket = new Basket("loyal");
    till = new Till(0.00);
  }

  @Test
  public void canAddToTill(){
    basket.addItemToBasket(item2);
    basket.addItemToBasket(item4);
    till.subTotal(basket.getBasket());
    assertEquals(25.98, till.getTill(), 0.01);
  }


  @Test
  public void canDeductBogofDiscountIfOddNumberOfItemsInBasket(){
    basket.addItemToBasket(item2);
    basket.addItemToBasket(item4);
    basket.addItemToBasket(item5);
    till.subTotal(basket.getBasket());
    till.bogofDiscount(basket.getBasket());
    assertEquals(26.98, till.getTill(), 0.01);
  }

  @Test
  public void canDeductBogofDiscountIfEvenNumberOfItemsInBasket(){
    basket.addItemToBasket(item1);
    basket.addItemToBasket(item2);
    basket.addItemToBasket(item4);
    basket.addItemToBasket(item5);
    till.subTotal(basket.getBasket());
    till.bogofDiscount(basket.getBasket());
    assertEquals(30.98,  till.getTill(), 0.01);
  }

  @Test
  public void CanIgnoreNonBogofTitle(){
    basket.addItemToBasket(item1);
    basket.addItemToBasket(item2);
    basket.addItemToBasket(item3);
    till.subTotal(basket.getBasket());
    till.bogofDiscount(basket.getBasket());
    assertEquals(18.98, till.getTill(), 0.01);
  }

  @Test
  public void canDeduct10Percent(){
    basket.addItemToBasket(item1);
    basket.addItemToBasket(item2);
    basket.addItemToBasket(item3);
    basket.addItemToBasket(item4);
    till.subTotal(basket.getBasket());
    till.tenPercentDiscount(basket.getBasket());
    assertEquals(31.47, till.getTill(), 0.01);
  }

  @Test
  public void canDeductLoyaltyCardDiscount(){
    basket.addItemToBasket(item1);
    basket.addItemToBasket(item2);
    basket.addItemToBasket(item3);
    basket.addItemToBasket(item4);
    till.subTotal(basket.getBasket());
    till.twoPercentDiscount(basket.getBasket(), basket);
    assertEquals(30.84, till.getTill(), 0.01);
  }

  


}