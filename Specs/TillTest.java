import static org.junit.Assert.*;
import org.junit.*;

import ShoppingBasket.*;
import java.util.*;

public class TillTest {

  CompactDisc item1;
  CompactDisc item2;
  Vinyl item3;
  Vinyl item4;
  Basket basket;
  Till till;

  @Before
  public void before(){
  item1 = new CompactDisc("Neil Young", "After The Goldrush", "budget", 4.99);
  item2 = new CompactDisc("Bobby Conn", "The Golden Age", "bogof", 9.99);
  item3 = new Vinyl("Miles Davis", "Sketches of Spain", "full", 13.99, "180gm");
  item4 = new Vinyl("Divine Comedy", "Casanova", "bogof", 15.99, "undefined");
  basket = new Basket();
  till = new Till(0.00);
  }

  @Test
  public void canDeductBogofTitle(){
    basket.addItemToBasket(item2);
    basket.addItemToBasket(item4);
    assertEquals(9.99, till.executeBogofDeal(basket.getBasket()), 0.01);
  }



}