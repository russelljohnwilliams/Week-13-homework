import static org.junit.Assert.*;
import org.junit.*;

import ShoppingBasket.*;
import java.util.*;

public class BasketTest {


  Product item1;
  Product item2;
  Product item3;
  Basket basket;

  @Before
  public void before(){
    item1 = new Product("CD", "bogof", 4.99);
    item2 = new Product("DVD", "full price", 9.99);
    item3 = new Product("LP", "bogof", 24.99);
    basket = new Basket();
  }


  @Test
  public void canAddItemToBasket(){
    basket.addItemToBasket(item1);
    assertEquals(1, basket.countBasketContents());
  }

  

}